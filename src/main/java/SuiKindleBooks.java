import com.rui.utils.HttpclientUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;

/**
 * Created by nilszhang on 2016/2/4.
 */
public class SuiKindleBooks {

    public static void main(String[] args) throws Exception {

        String panUrl = "http://yun.baidu.com/s/";
        int jiange = 60;
        int start=2460;
        int index = 0;
        HttpClient h =  HttpclientUtil.getDefaultHttpClient();

        HttpclientUtil.get("http://yun.baidu.com/share/home?uk=1075874930&view=share#category/type=0",null,null,h);


        while (true) {
            String s = HttpclientUtil.get("http://yun.baidu.com/pcloud/feed/getsharelist?t=" +(new Date()).getTime()+
                    "&category=0&auth_type=1&" +
                    "request_location=share_home&start=" +start+
                    "&limit=" +jiange+
                    "&query_uk=1075874930&channel=chunlei&clienttype=0&web=1&" +
                    "bdstoken=738e104155a4c533bd5530d3685b734b",null,null,h);

            ObjectMapper mapper = new ObjectMapper();
            Map<String, Object> productMap = mapper.readValue(s, Map.class);//转成map


            List<Map<String, Object>> records = (List) productMap.get("records");

            try {
                for (Map<String, Object> m : records
                        ) {
                    index++;
                    Object title = m.get("title");
                    Object shorturl = m.get("shorturl");
                    Object vCnt = m.get("vCnt");
                    Object dCnt = m.get("dCnt");


                    System.out.println(index+","+title+","+panUrl+shorturl+","+vCnt+","+dCnt);

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
            Thread.sleep(1000);
        }



    }}
