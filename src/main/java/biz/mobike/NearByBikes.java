package biz.mobike;

import biz.svnmanager.HtpasswdTest;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import core.util.HttpclientUtil;
import org.apache.http.client.HttpClient;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

import javax.net.ssl.SSLContext;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/4/7.
 */
public class NearByBikes {



    public static void main(String[] args) {

        String latitude = "32.043282";

        String longitude = "118.770191";


        System.out.println(getNearByBikes(latitude,longitude));

    }

    private static String getNearByBikes(String latitude, String longitude) {


        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("latitude", latitude);
        paraMap.put("longitude",longitude);
        paraMap.put("userid","57912076881748117504381112");


        String s = null;
        try {
            HttpClient client = HtpasswdTest.client;

            Map<String, String> headMap = new HashMap<>();

            headMap.put("accesstoken","b5534e042d747fdf71c93a348ed9d3aa");



            s = HttpclientUtil.post("https://api.mobike.com//mobike-api/rent/nearbyBikesInfo.do",paraMap,null, client,headMap);
        } catch (Exception e) {
            e.printStackTrace();
        }

 //       s="{\"code\":0,\"biketype\":0,\"object\":[{\"bikeIds\":\"0256010575#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0256010575\",\"distNum\":1,\"distX\":118.77136564556567,\"distY\":32.04168938487897,\"distance\":\"17\",\"type\":0},{\"bikeIds\":\"0250036013#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0250036013\",\"distNum\":1,\"distX\":118.77133566029215,\"distY\":32.04164041348284,\"distance\":\"23\",\"type\":0},{\"bikeIds\":\"0250040430#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0250040430\",\"distNum\":1,\"distX\":118.77141560320933,\"distY\":32.04157938019261,\"distance\":\"26\",\"type\":0},{\"bikeIds\":\"0256514926#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0256514926\",\"distNum\":1,\"distX\":118.77135464097684,\"distY\":32.04156341964171,\"distance\":\"29\",\"type\":0},{\"bikeIds\":\"0256500175#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0256500175\",\"distNum\":1,\"distX\":118.77142958807501,\"distY\":32.04151338677357,\"distance\":\"32\",\"type\":0},{\"bikeIds\":\"0256506057#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0256506057\",\"distNum\":1,\"distX\":118.77128966098272,\"distY\":32.041329510279645,\"distance\":\"56\",\"type\":0},{\"bikeIds\":\"0256030539#\",\"biketype\":999,\"boundary\":null,\"distId\":\"0256030539\",\"distNum\":1,\"distX\":118.7720752073315,\"distY\":32.04199688980866,\"distance\":\"59\",\"type\":0},{\"bikeIds\":\"0256038450#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0256038450\",\"distNum\":1,\"distX\":118.77103682983872,\"distY\":32.04142063651235,\"distance\":\"60\",\"type\":0},{\"bikeIds\":\"0250052183#\",\"biketype\":999,\"boundary\":null,\"distId\":\"0250052183\",\"distNum\":1,\"distX\":118.77085297610847,\"distY\":32.041758665800444,\"distance\":\"60\",\"type\":0},{\"bikeIds\":\"0250018649#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0250018649\",\"distNum\":1,\"distX\":118.77185539535105,\"distY\":32.04244192379982,\"distance\":\"79\",\"type\":0},{\"bikeIds\":\"0250061783#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0250061783\",\"distNum\":1,\"distX\":118.77198219297962,\"distY\":32.041168132875704,\"distance\":\"84\",\"type\":0},{\"bikeIds\":\"0256001507#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0256001507\",\"distNum\":1,\"distX\":118.77203428091597,\"distY\":32.04249480308646,\"distance\":\"93\",\"type\":0},{\"bikeIds\":\"0250056101#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0250056101\",\"distNum\":1,\"distX\":118.77080407393112,\"distY\":32.042487529922845,\"distance\":\"100\",\"type\":0},{\"bikeIds\":\"0256506089#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0256506089\",\"distNum\":1,\"distX\":118.77185641392776,\"distY\":32.04264987651047,\"distance\":\"101\",\"type\":0},{\"bikeIds\":\"0250035365#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0250035365\",\"distNum\":1,\"distX\":118.77080408373664,\"distY\":32.042593506131375,\"distance\":\"109\",\"type\":0},{\"bikeIds\":\"0256514237#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0256514237\",\"distNum\":1,\"distX\":118.77175947934006,\"distY\":32.04266393185912,\"distance\":\"100\",\"type\":0},{\"bikeIds\":\"0250027653#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0250027653\",\"distNum\":1,\"distX\":118.7716845335498,\"distY\":32.04271696495812,\"distance\":\"104\",\"type\":0},{\"bikeIds\":\"0250017393#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0250017393\",\"distNum\":1,\"distX\":118.77243389382427,\"distY\":32.04124483652076,\"distance\":\"108\",\"type\":0},{\"bikeIds\":\"0256510216#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0256510216\",\"distNum\":1,\"distX\":118.77179546742951,\"distY\":32.0427918814672,\"distance\":\"114\",\"type\":0},{\"bikeIds\":\"0250018759#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0250018759\",\"distNum\":1,\"distX\":118.77123883552757,\"distY\":32.04286419534885,\"distance\":\"121\",\"type\":0},{\"bikeIds\":\"0256039120#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0256039120\",\"distNum\":1,\"distX\":118.77067814911273,\"distY\":32.04246060711081,\"distance\":\"106\",\"type\":0},{\"bikeIds\":\"0250035478#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0250035478\",\"distNum\":1,\"distX\":118.77184143247078,\"distY\":32.04274286470735,\"distance\":\"110\",\"type\":0},{\"bikeIds\":\"0250037814#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0250037814\",\"distNum\":1,\"distX\":118.77188041280326,\"distY\":32.04280982608208,\"distance\":\"118\",\"type\":0},{\"bikeIds\":\"0250036458#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0250036458\",\"distNum\":1,\"distX\":118.77046328604673,\"distY\":32.04252471278653,\"distance\":\"126\",\"type\":0},{\"bikeIds\":\"0250014300#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0250014300\",\"distNum\":1,\"distX\":118.7705842241149,\"distY\":32.04264961737986,\"distance\":\"127\",\"type\":0},{\"bikeIds\":\"0256019742#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0256019742\",\"distNum\":1,\"distX\":118.77073714482873,\"distY\":32.0428064962252,\"distance\":\"133\",\"type\":0},{\"bikeIds\":\"0250057555#\",\"biketype\":1,\"boundary\":null,\"distId\":\"0250057555\",\"distNum\":1,\"distX\":118.77208828248534,\"distY\":32.04290367824998,\"distance\":\"135\",\"type\":0}]}";

        System.out.println(s);

        JSONObject jsonObject = JSONObject.parseObject(s);




        JSONArray object = (JSONArray)jsonObject.get("object");


        for (int i = 0; i < object.size(); i++) {
            JSONObject bikeInfo =  object.getJSONObject(i);

            String bikeIds = bikeInfo.getString("bikeIds");
            String biketype = bikeInfo.getString("biketype");

            String distance = bikeInfo.getString("distance");
            String typeBike = bikeInfo.getString("type");

            System.out.println(distance+"-"+biketype);
            String distX = bikeInfo.getString("distX");
            String distY = bikeInfo.getString("distY");

        }



        System.out.println(object.size());

        return s;
    }
}
