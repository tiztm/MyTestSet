
import com.rui.utils.HttpclientUtil;

import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;

/**
 * Created by nilszhang on 2016/2/4.
 */
public class SuiKindleBooks {

    public static void main(String[] args) throws Exception {



        String panUrl = "http://yun.baidu.com/s/";
        int jiange = 60;
        int start=0;
        int index = 0;
        HttpClient h =  HttpclientUtil.getDefaultHttpClient();

        HttpclientUtil.get("http://yun.baidu.com/share/home?uk=1075874930&view=share#category/type=0",null,null,h);

        Map<String,String> headMap = new HashMap<String, String>() ;


        headMap.put("Cookie","PANWEB=1;Hm_lvt_a3139a1feb7fec092cafd367407ee051=1432191742; PSTM=1433404314; BAIDUID=2C4B3A3637979BF340990F47D742F8E7:FG=1; bdshare_firstime=1438664779602; a2404_times=14; Hm_lvt_773fea2ac036979ebb5fcc768d8beb67=1450245889,1450418406,1451356967; BDUSS=N4MHZTfjNZSkVUMjZMYzlTVXR6R0psTzMycmtafjhUQUc3Vzk1YlVLY3h0THBXQVFBQUFBJCQAAAAAAAAAAAEAAABmkQ4Aw9fI9MP3AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADEnk1YxJ5NWeV; MCITY=-315%3A; BIDUPSID=C08453D38496C69C65EB83E8EEFD7166; Hm_lvt_1d15eaebea50a900b7ddf4fa8d05c8a0=1452645866,1453106772,1454030505,1454319579; Hm_lvt_f5f83a6d8b15775a02760dc5f490bc47=1452645866,1453106772,1454030505,1454319579; H_PS_PSSID=17746_1467_18240_12824_18205_18560_17000_17072_15280_12054_18981_18019_10632; Hm_lvt_7a3960b6f067eb0085b7f96ff5e660b0=1454551503,1455413266; Hm_lpvt_7a3960b6f067eb0085b7f96ff5e660b0=1455413266; Hm_lvt_adf736c22cd6bcc36a1d27e5af30949e=1454551503,1455413266; Hm_lpvt_adf736c22cd6bcc36a1d27e5af30949e=1455413266");
        headMap.put("Accept", "application/json, text/javascript, */*; q=0.01");
        headMap.put("Referer", "http://yun.baidu.com/share/home?uk=1075874930&view=share");
        headMap.put("X-Requested-With", "XMLHttpRequest");
        headMap.put("Host", "yun.baidu.com");
        headMap.put("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.101 Safari/537.36");


        while (true) {


            Map<String,String> params = new HashMap<String, String>() ;
            params.put("t",(new Date()).getTime()+"");
            params.put("category","0");
            params.put("auth_type","1");
            params.put("request_location","share_home");
            params.put("category","0");
            params.put("start",start+"");
            params.put("limit",jiange+"");
            params.put("query_uk","1075874930");
            params.put("channel","chunlei");
            params.put("clienttype","0");
            params.put("web","1");
            params.put("bdstoken","738e104155a4c533bd5530d3685b734b");


            String s = HttpclientUtil.post("http://yun.baidu.com/pcloud/feed/getsharelist",params,null,h,headMap);




            //JSON字符串转化为Map
            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> productMap = mapper.readValue(s, Map.class);//转成map


            List<Map<String, Object>> records = (List) productMap.get("records");

            try {
                for (Map<String, Object> m : records
                        ) {
                    index++;
                    String title = m.get("title").toString();
                    Object shorturl = m.get("shorturl");
                    Object vCnt = m.get("vCnt");
                    Object dCnt = m.get("dCnt");


                    System.out.println(index+","+title.replaceAll(",","，")+","+panUrl+shorturl+","+vCnt+","+dCnt);

                }
            } catch (Exception e) {
                e.printStackTrace();
                Thread.sleep(5000);
                continue;
            }

            //System.out.println(start);
            if (records.size() < jiange) {
                break;
            }
            start = start+jiange;
            Thread.sleep(500);
        }



    }}
