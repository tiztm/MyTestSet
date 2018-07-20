package biz.nilstest;


import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2018/7/13.
 */
public class Axis2WebService {


    public static void main(String[] args) throws AxisFault {



        ServiceClient serviceClient = new ServiceClient();
        //创建服务地址WebService的URL,注意不是WSDL的URL
        String url = "http://apay.gotoai.net/axis2/services/UnityPay/";
        EndpointReference targetEPR = new EndpointReference(url);
        Options options = serviceClient.getOptions();
        options.setTo(targetEPR);
        //确定调用方法（wsdl 命名空间地址 (wsdl文档中的targetNamespace) 和 方法名称 的组合）
        options.setAction("http://apay.gotoai.net/axis2/services/UnityPay/getInvoice");

        OMFactory fac = OMAbstractFactory.getOMFactory();
        /*
         * 指定命名空间，参数：
         * uri--即为wsdl文档的targetNamespace，命名空间
         * perfix--可不填
         */
        OMNamespace omNs = fac.createOMNamespace("http://apay.gotoai.net/axis2/services/UnityPay/", "");
        // 指定方法
        OMElement method = fac.createOMElement("getInvoice", omNs);

        // 指定方法的参数
        OMElement mobileCode = fac.createOMElement("accNbr", omNs);
        mobileCode.setText("EQT50000124");

        OMElement userID = fac.createOMElement("requestTime", omNs);
        userID.setText("20180711130000");

        OMElement interfaceId = fac.createOMElement("interfaceId", omNs);
        userID.setText("06");

        method.addChild(mobileCode);
        method.addChild(userID);
        method.addChild(interfaceId);
        method.build();

        //远程调用web服务
        OMElement result = serviceClient.sendReceive(method);
        System.out.println(result);




    }


    public static void Weather1() {
        try {
            ServiceClient serviceClient = new ServiceClient();
            //创建服务地址WebService的URL,注意不是WSDL的URL
            String url = "http://ws.webxml.com.cn/WebServices/WeatherWS.asmx";
            EndpointReference targetEPR = new EndpointReference(url);
            Options options = serviceClient.getOptions();
            options.setTo(targetEPR);
            //确定调用方法（wsdl 命名空间地址 (wsdl文档中的targetNamespace) 和 方法名称 的组合）
            options.setAction("http://WebXml.com.cn/getSupportCityDataset");

            OMFactory fac = OMAbstractFactory.getOMFactory();
            /*
             * 指定命名空间，参数：
             * uri--即为wsdl文档的targetNamespace，命名空间
             * perfix--可不填
             */
            OMNamespace omNs = fac.createOMNamespace("http://WebXml.com.cn/", "");
            // 指定方法
            OMElement method = fac.createOMElement("getSupportCityDataset", omNs);
            // 指定方法的参数
            OMElement theRegionCode = fac.createOMElement("theRegionCode", omNs);
            theRegionCode.setText("北京");
            method.addChild(theRegionCode);
            method.build();

            //远程调用web服务
            OMElement result = serviceClient.sendReceive(method);
            System.out.println(result);

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        }
    }

}
