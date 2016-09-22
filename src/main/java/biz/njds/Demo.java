package biz.njds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.methods.multipart.Part;


public class Demo {
	public static void main(String[] args) {
		HttpUtils.createhttpClient();
		HttpUtils.HttpResult result1=HttpUtils.doGet("http://www.jsds.gov.cn/kpgl/rzxt/query2.jsp");
		Map<String, String> header = new HashMap<>();

		header.put("Content-Type","application/x-www-form-urlencoded");
		header.put("Origin","http://www.jsds.gov.cn");
		header.put("Referer","http://www.jsds.gov.cn/kpgl/rzxt/query2.jsp");

		header.put("Cookie","Secure; Secure; JSID_KPGL=9zQtW0zdYd5ffJcvLX5HBSJ11hpCkRmJzgVWRfPKPhp1G0TD4pJy!541357520; _gsref_1161164261=http://www.jsds.gov.cn/kpgl/rzxt/query2.jsp; _gscu_1161164261=58867921tztrwj64; _gscs_1161164261=58867921hpl4dj64|pv:3; _gscbrs_1161164261=1");
		HttpUtils.createhttpClient();
		System.out.println(result1.getRequestHeaders().toString()+"\r\n");
		System.out.println(result1.getResponseHeaders().toString()+"\r\n");

		System.out.println("_________________");

		List<Part> params = new ArrayList<>();
//		params.add(new StringPart("fptxm", "232001506120109005337070"));
//		params.add(new StringPart("cxfs", "1"));
//		params.add(new StringPart("hideshow_tm1", "0"));
//		params.add(new StringPart("INVOICE_CHECKING_CHECKCODE", "6002"));
//		params.add(new StringPart("yzm", ""));
		HttpUtils.HttpResult result = HttpUtils.doPost("http://www.jsds.gov.cn/kpgl/rzxt/wss_wwall",header, params,"gbk");
		System.out.println(result.getRequestHeaders().toString()+"\r\n");
		System.out.println(result.getResponseHeaders().toString()+"\r\n");

		System.out.println(result.getReturnObj());

	}
}
