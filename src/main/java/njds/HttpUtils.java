package njds;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

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
public class HttpUtils
{

	private static HttpClient httpClient=new HttpClient();

	public static void createhttpClient()
	{
		httpClient.getParams().setCookiePolicy(CookiePolicy.BROWSER_COMPATIBILITY);
		httpClient.getParams().setParameter(HttpMethodParams.USER_AGENT,"Mozilla/5.0 (X11; U; Linux i686; zh-CN; rv:1.9.1.2) Gecko/20090803 Fedora/3.5.2-2.fc11 Firefox/3.5.2");//设置信息
	}



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
	public static HttpResult doGet(String url)
	{

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
	public static HttpResult doGet(String url, Map<String, String> headerMap)
	{

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
	public static HttpResult doGet(String url, String proxyUrl, int proxyPort)
	{

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
	public static HttpResult doGet(String url, Map<String, String> headerMap, String proxyUrl, int proxyPort)
	{

		byte[] content = null;
		GetMethod getMethod = new GetMethod(url);
		if (headerMap != null && headerMap.size() != 0)
		{
			Iterator<Entry<String, String>> iterator = headerMap.entrySet().iterator();
			while (iterator.hasNext())
			{
				Entry<String, String> entry = (Entry<String, String>) iterator.next();
				getMethod.addRequestHeader(entry.getKey().toString(), entry.getValue().toString());
			}
		}
		if (StringUtil.isNotEmpty(proxyUrl))
			httpClient.getHostConfiguration().setProxy(proxyUrl, proxyPort);
		// 设置成了默认的恢复策略，在发生异常时候将自动重试3次，在这里你也可以设置成自定义的恢复策略
		// postMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER ,
		// new DefaultHttpMethodRetryHandler());
		getMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 10000);
		InputStream inputStream = null;
		try
		{
			int resultCode = httpClient.executeMethod(getMethod);
			if (resultCode == HttpStatus.SC_OK)
			{
				inputStream = getMethod.getResponseBodyAsStream();
				
				//添加开始
				BufferedInputStream in = new BufferedInputStream(inputStream);
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("E:/code.jpg"));
				int i;
				while ((i = in.read()) != -1)
				{
					out.write(i);
				}
				out.flush();
				out.close();
				in.close();
				content = new byte[0];
				//添加结束
				
				//content = IOUtils.toByteArray(inputStream);
				return new HttpResult(resultCode, new String(content), getMethod);
			} else
			{
				return new HttpResult(resultCode, getMethod.getStatusLine().toString(), getMethod);
			}
		} catch (

		IOException ex)
		{
			ex.printStackTrace();
			return new HttpResult(HttpStatus.SC_INTERNAL_SERVER_ERROR, ex.getMessage(), getMethod);
		} finally
		{
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
	 * @param parameterMap
	 *            POST请求参数容器
	 * 
	 * @return 与当前请求对应的响应内容字节数组
	 * 
	 */
	public static HttpResult doPost(String url, Map<String, String> parameterMap)
	{

		return HttpUtils.doPost(url, null, parameterMap, null, null, 0);
	}

	/**
	 * <p>
	 * 发送POST请求
	 * 
	 * @param url
	 *            POST请求地址
	 * @param parameterMap
	 *            POST请求参数容器
	 * @param paramCharset
	 *            参数字符集名称
	 * 
	 * @return 与当前请求对应的响应内容字节数组
	 * 
	 * @modify 窦海宁, 2012-05-21
	 */
	public static HttpResult doPost(String url, Map<String, String> parameterMap, String paramCharset)
	{
		return HttpUtils.doPost(url, null, parameterMap, paramCharset, null, 0);
	}

	/**
	 * <p>
	 * 发送POST请求
	 * 
	 * @param url
	 *            POST请求地址
	 * @param headerMap
	 *            POST请求头参数容器
	 * @param parameterMap
	 *            POST请求参数容器
	 * @param paramCharset
	 *            参数字符集名称
	 * 
	 * @return 与当前请求对应的响应内容字节数组
	 * 
	 * @modify 窦海宁, 2012-05-21
	 */
	public static HttpResult doPost(String url, Map<String, String> headerMap, Map<String, String> parameterMap, String paramCharset)
	{
		return HttpUtils.doPost(url, headerMap, parameterMap, paramCharset, null, 0);
	}

	/**
	 * <p>
	 * 发送POST请求
	 * 
	 * @param url
	 *            POST请求地址
	 * @param parameterMap
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
	public static HttpResult doPost(String url, Map<String, String> parameterMap, String paramCharset, String proxyUrl, int proxyPort)
	{
		return HttpUtils.doPost(url, null, parameterMap, paramCharset, proxyUrl, proxyPort);
	}

	/**
	 * <p>
	 * 发送POST请求
	 * 
	 * @param url
	 *            POST请求地址
	 * @param headerMap
	 *            POST请求头参数容器
	 * @param parameterMap
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
	public static HttpResult doPost(String url, Map<String, String> headerMap, Map<String, String> parameterMap, String paramCharset, String proxyUrl, int proxyPort)
	{
		byte[] content = null;

		PostMethod postMethod = new PostMethod(url);
		if (StringUtil.isNotEmpty(paramCharset))
		{
			postMethod.getParams().setContentCharset(paramCharset);
			postMethod.getParams().setHttpElementCharset(paramCharset);
		}
		if (headerMap != null && headerMap.size() != 0)
		{
			Iterator<Entry<String, String>> iterator = headerMap.entrySet().iterator();
			while (iterator.hasNext())
			{
				Entry<String, String> entry = (Entry<String, String>) iterator.next();
				postMethod.addRequestHeader(entry.getKey().toString(), entry.getValue().toString());
			}
		}

		List<Part> parts =  new ArrayList<Part>();
		Iterator<String> iterator = parameterMap.keySet().iterator();
		while (iterator.hasNext())
		{
			String key = (String) iterator.next();
			//postMethod.addParameter(key, (String) parameterMap.get(key));
			StringPart uname=new StringPart(key, (String) parameterMap.get(key));
			parts.add(uname);
		}
		if (StringUtil.isNotEmpty(proxyUrl))
		{
			httpClient.getHostConfiguration().setProxy(proxyUrl, proxyPort);
		}
		// 设置成了默认的恢复策略，在发生异常时候将自动重试3次，在这里你也可以设置成自定义的恢复策略
		// postMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER ,
		// new DefaultHttpMethodRetryHandler());
		postMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 10000);
		
		
		//添加开始
		File filePost = new File("e:/c.txt");
		try
		{
			FilePart filePart = new FilePart(filePost.getName(), filePost);
			parts.add(filePart);

			postMethod.setRequestEntity(new MultipartRequestEntity((Part[]) parts.toArray(new Part[parts.size()]), postMethod.getParams()));
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		//添加介绍
		
		InputStream inputStream = null;
		try
		{
			int resultCode = httpClient.executeMethod(postMethod);
			if (resultCode == HttpStatus.SC_OK)
			{
				inputStream = postMethod.getResponseBodyAsStream();
				content = IOUtils.toByteArray(inputStream);
				return new HttpResult(resultCode, new String(content), postMethod);
			} else
			{
				return new HttpResult(resultCode, postMethod.getStatusLine().toString(), postMethod);
			}
		} catch (IOException ex)
		{
			ex.printStackTrace();
			return new HttpResult(HttpStatus.SC_INTERNAL_SERVER_ERROR, ex.getMessage(), postMethod);
		} finally
		{
			IOUtils.closeQuietly(inputStream);
			postMethod.releaseConnection();
		}
	}

	public static class HttpResult
	{
		private int returnCode;
		private String returnObj;
		private Map<String, String> requestHeaders = new HashMap<String, String>();
		private Map<String, String> responseHeaders = new HashMap<String, String>();

		public int getReturnCode()
		{
			return returnCode;
		}

		public void setReturnCode(int returnCode)
		{
			this.returnCode = returnCode;
		}

		public String getReturnObj()
		{
			return returnObj;
		}

		public void setReturnObj(String returnObj)
		{
			this.returnObj = returnObj;
		}

		public HttpResult(int returnCode, String returnObj)
		{
			super();
			this.returnCode = returnCode;
			this.returnObj = returnObj;
		}

		public HttpResult(int returnCode, String returnObj, HttpMethodBase methodBase)
		{
			super();
			this.returnCode = returnCode;
			this.returnObj = returnObj;
			for (Header header : methodBase.getRequestHeaders())
			{
				this.requestHeaders.put(header.getName(), header.getValue());
			}
			for (Header header : methodBase.getResponseHeaders())
			{
				this.responseHeaders.put(header.getName(), header.getValue());
			}
		}

		public HttpResult()
		{
			super();
		}

		public String getRequestHeader(String key)
		{
			if (StringUtil.isNotEmpty(key))
				return requestHeaders.get(key);
			return "Can't find Request Header";
		}

		public String getResponseHeader(String key)
		{
			if (StringUtil.isNotEmpty(key))
				return responseHeaders.get(key);
			return "Can't find Response Header";
		}

		public Map<String, String> getRequestHeaders()
		{
			return requestHeaders;
		}

		public Map<String, String> getResponseHeaders()
		{
			return responseHeaders;
		}

		@Override
		public String toString()
		{
			return "HttpResult [returnCode=" + returnCode + ", returnObj=" + returnObj + "]";
		}

	}

}
