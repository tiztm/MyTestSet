
package biz.webservice.localhost.client;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MyTestWS", targetNamespace = "http://localhost/client")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MyTestWS {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "echo", targetNamespace = "http://localhost/client", className = "localhost.client.Echo")
    @ResponseWrapper(localName = "echoResponse", targetNamespace = "http://localhost/client", className = "localhost.client.EchoResponse")
    @Action(input = "http://localhost/client/MyTestWS/echoRequest", output = "http://localhost/client/MyTestWS/echoResponse")
    public String echo();

}
