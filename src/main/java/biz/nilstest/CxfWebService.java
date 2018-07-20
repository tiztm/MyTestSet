package biz.nilstest;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2018/7/13.
 */
public class CxfWebService {


    public static void main(String[] args) {
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        Client client = factory.createClient("http://apay.gotoai.net/axis2/services/UnityPay?wsdl");

        try {
            Object[] results = client.invoke("getInvoice", "world");
            System.out.println(results[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
