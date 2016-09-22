package biz.njds;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.io.IOUtils;


/**
 * <p>
 * Http工具类
 * 
 * <p>
 * Http工具类，为系统提供通用Http访问操作方法：
 * 
 * <p>
 * 1、发送GET请求；
 * <p>
 * 2、发送POST请求。
 * 
 */
public class HttpUtils {

	private static HttpClient httpClient = new HttpClient();

	/**
	 * <p>
	 * 发送GET请求
	 * 
	 * @param url
	 *            GET请求地址
	 * 
	 * @return 与当前请求对应的响应内容字节数组
	 * 
	 */
	public static HttpResult doGet(String url) {

		return HttpUtils.doGet(url, null, null, 0);
	}

	/**
	 * <p>
	 * 发送GET请求
	 * 
	 * @param url
	 *            GET请求地址
	 * @param headerMap
	 *            GET请求头参数容器
	 * 
	 * @return 与当前请求对应的响应内容字节数组
	 * 
	 */
	public static HttpResult doGet(String url, Map<String, String> headerMap) {

		return HttpUtils.doGet(url, headerMap, null, 0);
	}

	/**
	 * <p>
	 * 发送GET请求
	 * 
	 * @param url
	 *            GET请求地址
	 * @param proxyUrl
	 *            代理服务器地址
	 * @param proxyPort
	 *            代理服务器端口号
	 * 
	 * @return 与当前请求对应的响应内容字节数组
	 * 
	 * @modify 窦海宁, 2012-03-19
	 */
	public static HttpResult doGet(String url, String proxyUrl, int proxyPort) {

		return HttpUtils.doGet(url, null, proxyUrl, proxyPort);
	}

	/**
	 * <p>
	 * 发送GET请求
	 * 
	 * @param url
	 *            GET请求地址
	 * @param headerMap
	 *            GET请求头参数容器
	 * @param proxyUrl
	 *            代理服务器地址
	 * @param proxyPort
	 *            代理服务器端口号
	 * 
	 * @return 与当前请求对应的响应内容字节数组
	 * 
	 * @modify 窦海宁, 2012-03-19
	 */
	public static HttpResult doGet(String url, Map<String, String> headerMap, String proxyUrl, int proxyPort) {

		byte[] content = null;
		GetMethod getMethod = new GetMethod(url);
		if (headerMap != null && headerMap.size() != 0) {
			Iterator<Entry<String, String>> iterator = headerMap.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry<String, String> entry = (Entry<String, String>) iterator.next();
				getMethod.addRequestHeader(entry.getKey().toString(), entry.getValue().toString());
			}
		}
		if (StringUtil.isNotEmpty(proxyUrl))
			httpClient.getHostConfiguration().setProxy(proxyUrl, proxyPort);
		// 设置成了默认的恢复策略，在发生异常时候将自动重试3次，在这里你也可以设置成自定义的恢复策略
		getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
		getMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 10000);
		InputStream inputStream = null;
		try {
			int resultCode = httpClient.executeMethod(getMethod);
			if (resultCode == HttpStatus.SC_OK) {
				inputStream = getMethod.getResponseBodyAsStream();
				content = IOUtils.toByteArray(inputStream);
				return new HttpUtils().new HttpResult(resultCode, new String(content), getMethod, content);
			} else {
				return new HttpUtils().new HttpResult(resultCode, getMethod.getStatusLine().toString(), getMethod,
						content);
			}
		} catch (

		IOException ex) {
			ex.printStackTrace();
			return new HttpUtils().new HttpResult(HttpStatus.SC_INTERNAL_SERVER_ERROR, ex.getMessage(), getMethod,
					content);
		} finally {
			IOUtils.closeQuietly(inputStream);
			getMethod.releaseConnection();
		}
	}

	/**
	 * <p>
	 * 发送POST请求
	 * 
	 * @param url
	 *            POST请求地址
	 *            POST请求参数容器
	 * 
	 * @return 与当前请求对应的响应内容字节数组
	 * 
	 */
	public static HttpResult doPost(String url, List<Part> params) {

		return HttpUtils.doPost(url, null, params, null, null, 0);
	}

	/**
	 * <p>
	 * 发送POST请求
	 * 
	 * @param url
	 *            POST请求地址
	 *            POST请求参数容器
	 * @param paramCharset
	 *            参数字符集名称
	 * 
	 * @return 与当前请求对应的响应内容字节数组
	 * 
	 * @modify 窦海宁, 2012-05-21
	 */
	public static HttpResult doPost(String url, List<Part> params, String paramCharset) {
		return HttpUtils.doPost(url, null, params, paramCharset, null, 0);
	}

	/**
	 * <p>
	 * 发送POST请求
	 * 
	 * @param url
	 *            POST请求地址
	 * @param headerMap
	 *            POST请求头参数容器
	 *            POST请求参数容器
	 * @param paramCharset
	 *            参数字符集名称
	 * 
	 * @return 与当前请求对应的响应内容字节数组
	 * 
	 * @modify 窦海宁, 2012-05-21
	 */
	public static HttpResult doPost(String url, Map<String, String> headerMap, List<Part> params, String paramCharset) {
		return HttpUtils.doPost(url, headerMap, params, paramCharset, null, 0);
	}

	/**
	 * <p>
	 * 发送POST请求
	 * 
	 * @param url
	 *            POST请求地址
	 *            POST请求参数容器
	 * @param paramCharset
	 *            参数字符集名称
	 * @param proxyUrl
	 *            代理服务器地址
	 * @param proxyPort
	 *            代理服务器端口号
	 * 
	 * @return 与当前请求对应的响应内容字节数组
	 * 
	 */
	public static HttpResult doPost(String url, List<Part> params, String paramCharset, String proxyUrl,
			int proxyPort) {
		return HttpUtils.doPost(url, null, params, paramCharset, proxyUrl, proxyPort);
	}


	public static void createhttpClient()
	{
		httpClient = new HttpClient();
		httpClient.getParams().setCookiePolicy(CookiePolicy.BROWSER_COMPATIBILITY);
		httpClient.getParams().setParameter(HttpMethodParams.USER_AGENT,"Mozilla/5.0 (X11; U; Linux i686; zh-CN; rv:1.9.1.2) Gecko/20090803 Fedora/3.5.2-2.fc11 Firefox/3.5.2");//设置信息
	}

	/**
	 * <p>
	 * 发送POST请求
	 * 
	 * @param url
	 *            POST请求地址
	 * @param headerMap
	 *            POST请求头参数容器
	 *            POST请求参数容器
	 * @param paramCharset
	 *            参数字符集名称
	 * @param proxyUrl
	 *            代理服务器地址
	 * @param proxyPort
	 *            代理服务器端口号
	 * 
	 * @return 与当前请求对应的响应内容字节数组
	 * 
	 * @modify 窦海宁, 2012-05-21
	 */
	public static HttpResult doPost(String url, Map<String, String> headerMap, List<Part> params, String paramCharset,
			String proxyUrl, int proxyPort) {
		byte[] content = null;
		PostMethod postMethod = new PostMethod(url);
		if (StringUtil.isNotEmpty(paramCharset)) {
			postMethod.getParams().setContentCharset(paramCharset);
			postMethod.getParams().setHttpElementCharset(paramCharset);
		}
		if (headerMap != null && headerMap.size() != 0) {
			Iterator<Entry<String, String>> iterator = headerMap.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry<String, String> entry = (Entry<String, String>) iterator.next();
				postMethod.addRequestHeader(entry.getKey().toString(), entry.getValue().toString());
			}
		}
		if (StringUtil.isNotEmpty(proxyUrl)) {
			httpClient.getHostConfiguration().setProxy(proxyUrl, proxyPort);
		}


		// 设置成了默认的恢复策略，在发生异常时候将自动重试3次，在这里你也可以设置成自定义的恢复策略
		postMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
		postMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 10000);
		postMethod.setRequestEntity(
				new StringRequestEntity("cxfs=1&hideshow_tm1=0&fpdm=%C7%EB%C2%BC%C8%EB12%CE%BB%B5%C4%B7%A2%C6%B1%B4%FA%C2%EB%3B&fphm=%C7%EB%C2%BC%C8%EB8%CE%BB%B5%C4%B7%A2%C6%B1%BA%C5%C2%EB%3B&kprq=%C8%D5%C6%DA%B8%F1%CA%BD%3Ayyyy-MM-dd%3B&jine=%C7%EB%C2%BC%C8%EB%CA%FD%D7%D6%2C%C8%E7%A3%BA%A1%C0120.12%3B&INVOICE_CHECKING_CHECKCODE=6002&yzm=&fptxm=232001506120109005337070"));

		InputStream inputStream = null;
		try {
			int resultCode = httpClient.executeMethod(postMethod);
			if (resultCode == HttpStatus.SC_OK) {
				inputStream = postMethod.getResponseBodyAsStream();
				content = IOUtils.toByteArray(inputStream);


				return new HttpUtils().new HttpResult(resultCode, new String(content,"gbk"), postMethod, content);
			} else {
				return new HttpUtils().new HttpResult(resultCode, postMethod.getStatusLine().toString(), postMethod,
						content);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
			return new HttpUtils().new HttpResult(HttpStatus.SC_INTERNAL_SERVER_ERROR, ex.getMessage(), postMethod,
					content);
		} finally {
			IOUtils.closeQuietly(inputStream);
			postMethod.releaseConnection();
		}
	}

	public class HttpResult {
		private int returnCode;
		private String returnObj;
		private byte[] returnByte;
		private Map<String, String> requestHeaders = new HashMap<>();
		private Map<String, String> responseHeaders = new HashMap<>();

		public int getReturnCode() {
			return returnCode;
		}

		public void setReturnCode(int returnCode) {
			this.returnCode = returnCode;
		}

		public String getReturnObj() {
			return returnObj;
		}

		public void setReturnObj(String returnObj) {
			this.returnObj = returnObj;
		}

		public byte[] getReturnByte() {
			return returnByte;
		}

		public void setReturnByte(byte[] returnByte) {
			this.returnByte = returnByte;
		}

		public void setRequestHeaders(Map<String, String> requestHeaders) {
			this.requestHeaders = requestHeaders;
		}

		public void setResponseHeaders(Map<String, String> responseHeaders) {
			this.responseHeaders = responseHeaders;
		}

		
		public HttpResult(int returnCode, String returnObj, byte[] bytes) {
			super();
			this.returnCode = returnCode;
			this.returnObj = returnObj;
			this.returnByte = bytes;
		}

		public HttpResult(int returnCode, String returnObj, HttpMethodBase methodBase, byte[] bytes) {
			super();
			this.returnCode = returnCode;
			this.returnObj = returnObj;
			this.returnByte = bytes;
			for (Header header : methodBase.getRequestHeaders()) {
				this.requestHeaders.put(header.getName(), header.getValue());
			}
			for (Header header : methodBase.getResponseHeaders()) {
				this.responseHeaders.put(header.getName(), header.getValue());
			}
		}

		public HttpResult() {
			super();
		}

		public String getRequestHeader(String key) {
			if (StringUtil.isNotEmpty(key))
				return requestHeaders.get(key);
			return "Can't find Request Header";
		}

		public String getResponseHeader(String key) {
			if (StringUtil.isNotEmpty(key))
				return responseHeaders.get(key);
			return "Can't find Response Header";
		}

		public Map<String, String> getRequestHeaders() {
			return requestHeaders;
		}

		public Map<String, String> getResponseHeaders() {
			return responseHeaders;
		}

		@Override
		public String toString() {
			return "HttpResult [returnCode=" + returnCode + ", returnObj=" + returnObj + "]";
		}

	}

}
