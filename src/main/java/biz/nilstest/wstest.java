package biz.nilstest;

import com.huawei.unitypay.GetInvoiceRequest;
import com.huawei.unitypay.GetInvoiceResponse;
import com.huawei.unitypay.UnityPay_Service;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2018/7/12.
 */
public class wstest {

    public static void main(String[] args) {
        UnityPay_Service myWebService = new UnityPay_Service();

        GetInvoiceRequest parameters = new GetInvoiceRequest();
        parameters.setAccNbr("EQT50000124");
        parameters.setInterfaceId("06");
        parameters.setRequestTime("20180711130000");




        GetInvoiceResponse invoice = myWebService.getUnityPaySOAP().getInvoice(parameters);



        System.out.println(invoice.toString());
    }

}
