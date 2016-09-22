package biz.nilstest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import core.util.HTMLUtil;
import core.util.HttpclientUtil;
import org.apache.http.impl.client.DefaultHttpClient;

public class UMSGetInfo {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws Exception,
			UnsupportedEncodingException {

		// 创建一个httpclient实例
		DefaultHttpClient httpclient = HttpclientUtil
				.getDefaultHttpClient("gbk");

		Map<String, String> params = new HashMap<String, String>();
		params.put("userid", "1003");
		params.put("userpass", "001010");

		String s = HttpclientUtil.post(
				"http://115.29.186.94:8080/unailmission/LoginCtrl", params,
				"gbk", httpclient);
		String s2 = "";
		String s3 = "";
		File f = new File("f:/ums_user.txt");
		File f2 = new File("f:/ums_user_pro.txt");

		for (int pageIndex = 0; pageIndex < 129; pageIndex++) {
			String entityBody = "%3CROOT%3E%3CName%3Ewsy.bussiness.Dwsd.queryHyzl%3C/Name%3E%3CArguments%3E%3Chybh%3E%3C/hybh%3E%3Chymc%3E%3C/hymc%3E%3Cklb%3E%3C/klb%3E%3CcompanyId%3E002%3C/companyId%3E%3Chysrq%3E%3C/hysrq%3E%3Chysrz%3E%3C/hysrz%3E%3CpageIndex%3E"
					+ pageIndex + "%3C/pageIndex%3E%3C/Arguments%3E%3C/ROOT%3E";
			String temp = HttpclientUtil.postBody(
					"http://115.29.186.94:8080/unailmission/ServletCtrl",
					entityBody, "gbk", httpclient);

			temp = HTMLUtil.getSelectedString(temp, "<DATA>", "</DATA>");
			// <hykh>000468</hykh>

			// int indexOfhykh = temp.indexOf("<hykh>");

			// int indexOf2hykh = temp.indexOf("</hykh>");

			List<String> patternString = HTMLUtil.getPatternString(temp,
					"<hykh>.*</hykh>");

			for (String string : patternString) {

				String hykh = HTMLUtil.getSelectedString(string, "<hykh>",
						"</hykh>");

				System.out.println(hykh);

				String eB2 = "%3CROOT%3E%3CName%3Ewsy.bussiness.LcTool.queryLcxxKd%3C/Name%3E%3CArguments%3E%3Chykh%3E"
						+ hykh
						+ "%3C/hykh%3E%3Clsdh%3EKD.00220150922162810%3C/lsdh%3E%3CcompanyId%3E002%3C/companyId%3E%3C/Arguments%3E%3C/ROOT%3E";

				String tempHYKH = HttpclientUtil.postBody(
						"http://115.29.186.94:8080/unailmission/ServletCtrl",
						eB2, "gbk", httpclient);

				tempHYKH = HTMLUtil.getSelectedString(tempHYKH, "<DATA>",
						"</DATA>");

				// 可加入判断，对不存在项目使用的用户进行过滤
				String selectedString = HTMLUtil.getSelectedString(tempHYKH,
						"<id>", "</id>");

				if (selectedString == null || selectedString.length() < 1)
					continue;

				tempHYKH = "<kh>" + hykh + "</kh>" + tempHYKH;

				s3 += tempHYKH;

			}

			s2 += temp;

		}

		try {
			if (!f.exists()) {
				f.createNewFile();
			}

			FileWriter fileWritter = new FileWriter(f.getAbsoluteFile());
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);

			bufferWritter.write(s2);
			bufferWritter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			if (!f2.exists()) {
				f2.createNewFile();
			}

			FileWriter fileWritter = new FileWriter(f2.getAbsoluteFile());
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);

			bufferWritter.write(s3);
			bufferWritter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Done");

		/*
		 * String kh = "000018"; String eB2 =
		 * "%3CROOT%3E%3CName%3Ewsy.bussiness.LcTool.queryLcxxKd%3C/Name%3E%3CArguments%3E%3Chykh%3E"
		 * +kh+
		 * "%3C/hykh%3E%3Clsdh%3EKD.00220150922162810%3C/lsdh%3E%3CcompanyId%3E002%3C/companyId%3E%3C/Arguments%3E%3C/ROOT%3E"
		 * ;
		 * 
		 * String s3 = HttpclientUtil.postBody(
		 * "http://115.29.186.94:8080/unailmission/ServletCtrl"
		 * ,eB2,"gbk",httpclient);
		 */
		/**
		 * String eb3 =
		 * "%3CROOT%3E%3CName%3Ewsy.bussiness.Xmzlgl.query%3C/Name%3E%3CArguments%3E%3Cxmbh%3E%3C/xmbh%3E%3Cxmmc%3E%3C/xmmc%3E%3CcompanyId%3E002%3C/companyId%3E%3CpageIndex%3E0%3C/pageIndex%3E%3C/Arguments%3E%3C/ROOT%3E"
		 * ;
		 * 
		 * String s4 = HttpclientUtil.postBody(
		 * "http://115.29.186.94:8080/unailmission/ServletCtrl"
		 * ,eb3,"gbk",httpclient);
		 **/

	}

}
