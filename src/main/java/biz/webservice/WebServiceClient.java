package biz.webservice;

import biz.webservice.localhost.client.MyWebService;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/7/12.
 */
public class WebServiceClient {

    public static void main(String[] args) {
        MyWebService myWebService = new MyWebService();
        System.out.println(myWebService.getMyTestWSPort().echo());
    }
}
