import core.util.HTMLUtil;
import core.util.HttpclientUtil;
import org.apache.http.impl.client.DefaultHttpClient;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/11/20.
 */
public class ufotest {

    public static void main(String[] args) throws Exception {

        Map<String,String> headerMap = new HashMap();
        headerMap.put("Cookie","ASP.NET_SessionId=cnl4ad2nec01h5fqc4mjyepe; Hm_lvt_9761313aa037c935c493f296c8743ead=1511158147; Hm_lpvt_9761313aa037c935c493f296c8743ead=1511158147; _ga=GA1.2.1167831672.1511158148; _gid=GA1.2.1784228061.1511158148; _gat=1; RememberMyUserName=true; CustomerUserName=15301586334");


        DefaultHttpClient httpclient = HttpclientUtil.getDefaultHttpClient();
        httpclient.getParams().setParameter("http.connection.timeout", Integer.valueOf(6000));
        httpclient.getParams().setParameter("http.socket.timeout", Integer.valueOf(6000));

        String s = HttpclientUtil.get("http://www.ufokuaidi.com/UserCenter/WaybillInfo.aspx?SID=796974",null,null,httpclient,headerMap);



        //

        //

        String pString = s.replaceAll("\r", "").replaceAll("\n", "");
        //System.out.println(pString);
        String betweenString = HTMLUtil.getBetweenString(pString,
                "<td>跟踪时间", "</table>").replaceAll(" ", "");


        System.out.println(betweenString);
    }
}
