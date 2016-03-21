package njds;



import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		HttpUtils.createhttpClient();
		HttpUtils.HttpResult result = HttpUtils.doGet("http://pub.jsds.gov.cn/lm/front/mailwrite.jsp?sysid=001&sess=0&groupid=0005");
		System.out.println(result.getReturnObj().replace("(\r\n|\r|\n|\n\r)", ""));
		System.out.println(result.getRequestHeaders().toString()+"\r\n");
		System.out.println(result.getResponseHeaders().toString()+"\r\n");

		//System.out.println(result.getResponseHeader("Set-Cookie"));
		result = HttpUtils.doGet("http://pub.jsds.gov.cn/lm/VerifyCodeServlet?flag=001");
		System.out.println(result.getRequestHeaders().toString()+"\r\n");
		System.out.println(result.getResponseHeaders().toString()+"\r\n");
		JFrame frame = new JFrame("");
		frame.setVisible(false);
		frame.setBounds(100, 100, 100, 100);
		frame.setLayout(new FlowLayout());
		ImageIcon icon = new ImageIcon("e:/code.jpg");
		frame.add(new JLabel(icon));
		frame.setVisible(true);

		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> header = new HashMap<String, String>();
		map.put("sysid", "001");
		map.put("mailproperty", "006");
		map.put("wishpublic", "1");
		map.put("mustfield", "");
		map.put("file0", "");
		map.put("title", "地税手机客户端测是");
		map.put("content", "content");
		map.put("vc_parentname", "江苏省南京地方税务局");
		map.put("vc_parentid", "0031");
		map.put("vc_backup0", "0031");

		map.put("username", "");
		map.put("relationphone", "");
		map.put("mobilephone", "");
		map.put("email", "");
		Scanner scanner = new Scanner(System.in);
		map.put("registercode", scanner.nextLine());
		//header.put("Cookie", "JSESSIONID=36BEEB307D9522EAEBFA6DBD3A0C3730");
		//header.put("Host","pub.jsds.gov.cn");

		header.put("Referer","http://pub.jsds.gov.cn/lm/front/mailwrite.jsp?sysid=001&sess=0&groupid=0005");

		scanner.close();
		HttpUtils.HttpResult result1 = HttpUtils.doPost("http://pub.jsds.gov.cn/lm/front/mailwrite_do.jsp?sess=0&groupid=0005", header, map, "utf-8");
		System.out.println(result1.getReturnObj().replace("(\r\n|\r|\n|\n\r)", ""));
		System.out.println(result1.getRequestHeaders().toString());
		System.out.println(result1.getResponseHeaders().toString()+"\r\n");
		//System.out.println(result1.+"\r\n");
	}
}
