import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class UMSSQLOutput {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws Exception,
			UnsupportedEncodingException {

		System.out.println("123");
		
		outCus();
		
 
	}
	
	
	private static void outCus() {
		File file = new File("d:/ums_user.txt");
		File fileout= new File("d:/ums_user-out.txt");
		String ygxx = "INSERT INTO `users` VALUES (replace(uuid(),'-',''), '_lrrq', '402880e92db726b5012db729f65f0001', now(), null, 'default', '0', '001', '_hymc', null, null, '', '_hykh', '_yddh', 'd3eb9a9233e52948740d7eb8c3062d14', null,'_hykh', '402880e92db5d2ee012db601b2220004', '', '_kye', '_ygmc', '_csrq', '_lbmc', null, '0', null, null, null, null, null, null, '1', '_zkkh', null, null, '_spzk', '_xmzk');";
		 BufferedReader reader = null; 
		 String temOutString = ""; 
	        try {
	        	// step 1: 获得dom解析器工厂（工作的作用是用于创建具体的解析器）
 
	        	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

	        	//      System.out.println("class name: " + dbf.getClass().getName());

	        	// step 2:获得具体的dom解析器

	        	DocumentBuilder db = dbf.newDocumentBuilder();

	        	//      System.out.println("class name: " + db.getClass().getName());

	        	// step3: 解析一个xml文档，获得Document对象（根结点）

	        	Document document = db.parse(file);

	        	NodeList list = document.getElementsByTagName("item");

	        	for(int i = 0; i < list.getLength(); i++)

	        	{

	        	Element element = (Element)list.item(i);

	        
	        	
	        	String content = getValueByTag(element,"hykh");

	        	String hykh = content;
	        	
	        	content = getValueByTag(element,"hybh");

	        	String zkkh = content; 
	        	
	        	content = getValueByTag(element,"kye");

	        	String kye = content;

	        	content = getValueByTag(element,"ygmc");

	        	String ygmc = content;
	        	
	        	content =getValueByTag(element,"csrq");

	        	String csrq = content;
	        	
	        	
	        	content = getValueByTag(element,"lbmc");

	        	String lbmc = content;
	        	
	        	content = getValueByTag(element,"lrrq");

	        	String lrrq = content;

	        	content = getValueByTag(element,"yddh");

	        	String yddh = content;
	        	
	        	content =getValueByTag(element,"hymc");

	        	String hymc = content;
	        	
	        	//_lrrq _hymc _yddh _hykh _kye _ygmc _csrq _lbmc _zkkh _spzk', '_xmzk
	        	
	        	String spzk = "1";
	        	String xmzk = "1";
	        	/**
	        	
	        	白金会员卡10000-20000元	90	60
	        	
	        	1000元88折卡	100	88
	        	3000元8折	100	80
	        	5000元7折	100	70
	        	10000元6折	95	60
	        	20000元6折	90	60
**/
	        	if(lbmc.equals("白金会员卡10000-20000元")) 
	        	{
	        		spzk = "0.9";
		        	xmzk = "0.6";
	        	}
	        	if(lbmc.equals("1000元88折卡")) 
	        	{
	        		spzk = "1";
		        	xmzk = "0.88";
	        	}
	        	if(lbmc.equals("3000元8折")) 
	        	{
	        		spzk = "1";
		        	xmzk = "0.8";
	        	}
	        	if(lbmc.equals("5000元7折")) 
	        	{
	        		spzk = "1";
		        	xmzk = "0.7";
	        	}
	        	if(lbmc.equals("10000元6折")) 
	        	{
	        		spzk = "0.95";
		        	xmzk = "0.6";
	        	}
	        	if(lbmc.equals("20000元6折")) 
	        	{
	        		spzk = "0.9";
		        	xmzk = "0.6";
	        	}
	        	
	        	
	        	
	        	String replaceAll = ygxx.replaceAll("_lrrq",lrrq)
	        			.replaceAll("_hymc", hymc)
	                	.replaceAll("_hykh", hykh)
	                	.replaceAll("_kye", kye)
	                	.replaceAll("_ygmc", ygmc)
	                	.replaceAll("_csrq", csrq)
	                	.replaceAll("_lbmc", lbmc)
	                	.replaceAll("_zkkh",zkkh)
	                	.replaceAll("_spzk", spzk)
	                	.replaceAll("_xmzk",xmzk)
	                	.replaceAll("_yddh", yddh);
	        	
	        	temOutString +=replaceAll+"\r\n";
	        	

	        	System.out.println("--------------------------------------");

	        	}


	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	         
	            
	          
	    			if (!fileout.exists()) {
	    				fileout.createNewFile();
	    			}

	    			FileWriter fileWritter = new FileWriter(fileout.getAbsoluteFile());
	    			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);

	    			bufferWritter.write(temOutString);
	    			bufferWritter.close();


	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e1) {
	                }
	            }
	        }
	}


	private static String getValueByTag(Element element,String tag) {
		String content;
		
		Node firstChild = element.getElementsByTagName(tag).item(0).getFirstChild();
		if(firstChild ==null) return "";
		
		content = firstChild.getNodeValue();
		return content;
	}
	
	
	
	private static void outShanping() {
		File file = new File("d:/商品资料.csv");
		File fileout= new File("d:/商品资料-out.txt");
		String ygxx = "INSERT INTO `product` VALUES (replace(uuid(),'-',''), '2015-09-08 14:08:17', '2015-09-10 00:18:47', '402880e92db726b5012db729f65f0001', '402880e92db726b5012db729f65f0001', '402880e92db5d2ee012db601b2220004', '0', '_name', '_bianhao', '厂家1232', '402881904faaf60c014fab7da71b0015', '1', '', '_price', '');";
		 BufferedReader reader = null;
	        try {
	            System.out.println("商品资料");
	            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));
	            String tempString = null;
	            String temOutString = "";
	            int line = 1;
	            // 一次读入一行，直到读入null为文件结束
	            while ((tempString = reader.readLine()) != null) {
	               
	                if(line>1)
	                {//处理占位符
	                	String[] split = tempString.split(",");
	                	
	                	
	                	 
	                	String replaceAll = ygxx.replaceAll("_price", split[2])
	                	.replaceAll("_name", split[1])
	                	.replaceAll("_bianhao", split[0]);
	                	 // 显示行号
		                System.out.println("line " + line + ": " + replaceAll);
		                temOutString +=replaceAll+"\r\n";
	                }
	                
	                
	                
	                
	                
	                line++;
	            }
	            reader.close();
	            
	          
	    			if (!fileout.exists()) {
	    				fileout.createNewFile();
	    			}

	    			FileWriter fileWritter = new FileWriter(fileout.getAbsoluteFile());
	    			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);

	    			bufferWritter.write(temOutString);
	    			bufferWritter.close();

	    		

	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e1) {
	                }
	            }
	        }
	}
	
	
	private static void outPro() {
		File file = new File("d:/项目资料.csv");
		File fileout= new File("d:/项目资料-out.txt");
		String ygxx = "INSERT INTO `service` VALUES (replace(uuid(),'-',''), '2015-09-08 14:43:18', '2015-09-08 15:06:56', '402880e92db726b5012db729f65f0001', '402880e92db726b5012db729f65f0001', '402880e92db5d2ee012db601b2220004', '0', '_name', '_bianhao', '_type', '', '_bianhao', '_price', '_price', '_num', '24', '');";
		 BufferedReader reader = null;
	        try {
	            System.out.println("项目资料");
	            reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));
	            String tempString = null;
	            String temOutString = "";
	            int line = 1;
	            // 一次读入一行，直到读入null为文件结束
	            while ((tempString = reader.readLine()) != null) {
	               
	                if(line>1)
	                {//处理占位符
	                	String[] split = tempString.split(",");
	                	//特别处理 类别;
	                	
	                	
	                	if(split[4].equals("甲油护理"))  split[4] = "6";
	                	if(split[4].equals("甲油胶护理"))  split[4] = "5";
	                	if(split[4].equals("指甲护理"))  split[4] = "4";
	                	if(split[4].equals("种烫睫毛"))  split[4] = "3";
	                	if(split[4].equals("脚部护理"))  split[4] = "2";
	                	if(split[4].equals("手部护理"))  split[4] = "1";
	                	
	                	
	                	String replaceAll = ygxx.replaceAll("_type", split[4])
	                			.replaceAll("_num", split[3])
	                	.replaceAll("_price", split[2])
	                	.replaceAll("_name", split[1])
	                	.replaceAll("_bianhao", split[0]);
	                	 // 显示行号
		                System.out.println("line " + line + ": " + replaceAll);
		                temOutString +=replaceAll+"\r\n";
	                }
	                
	                
	                
	                
	                
	                line++;
	            }
	            reader.close();
	            
	          
	    			if (!fileout.exists()) {
	    				fileout.createNewFile();
	    			}

	    			FileWriter fileWritter = new FileWriter(fileout.getAbsoluteFile());
	    			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);

	    			bufferWritter.write(temOutString);
	    			bufferWritter.close();

	    		

	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e1) {
	                }
	            }
	        }
	}
	

	private static void outUserInfo() {
		File file = new File("d:/员工信息.csv");
		File fileout= new File("d:/员工信息-out.txt");
		String ygxx = "INSERT INTO `users` VALUES (replace(uuid(),'-',''),'_date', '402880e92db726b5012db729f65f0001', now(), '402881e74fd69b1b014fd6adc7220013', 'default', '0', '001', '_user_name', null, null, '', '_user_no', '_mobile', '52c69e3a57331081823331c4e69d3f2e', null, null, '402880e92db5d2ee012db601b2220004', null, null, null, null, null, null, null, null, '', null, null, null, '2', '2', null, null, '', '0', '0');";
		 BufferedReader reader = null;
	        try {
	            System.out.println("员工信息");
	            reader = new BufferedReader(new FileReader(file));
	            String tempString = null;
	            String temOutString = "";
	            int line = 1;
	            // 一次读入一行，直到读入null为文件结束
	            while ((tempString = reader.readLine()) != null) {
	               
	                if(line>1)
	                {//处理占位符
	                	String[] split = tempString.split(",");
	                	String replaceAll = ygxx.replaceAll("_date", split[3])
	                	.replaceAll("_mobile", split[2])
	                	.replaceAll("_user_name", split[1])
	                	.replaceAll("_user_no", split[0]);
	                	 // 显示行号
		                System.out.println("line " + line + ": " + replaceAll);
		                temOutString +=replaceAll+"\r\n";
	                }
	                
	                
	                
	                
	                
	                line++;
	            }
	            reader.close();
	            
	          
	    			if (!fileout.exists()) {
	    				fileout.createNewFile();
	    			}

	    			FileWriter fileWritter = new FileWriter(fileout.getAbsoluteFile());
	    			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);

	    			bufferWritter.write(temOutString);
	    			bufferWritter.close();

	    		

	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e1) {
	                }
	            }
	        }
	}

}
