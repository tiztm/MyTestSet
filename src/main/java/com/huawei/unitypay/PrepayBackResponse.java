
package com.huawei.unitypay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="balanceList" type="{http://huawei.com/UnityPay/}BalanceListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responseId",
    "responseTime",
    "result",
    "balanceList"
})
@XmlRootElement(name = "prepayBackResponse")
public class PrepayBackResponse {

    @XmlElement(required = true)
    protected String responseId;
    @XmlElement(required = true)
    protected String responseTime;
    protected int result;
    protected List<BalanceListType> balanceList;

    /**
     * 获取responseId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseId() {
        return responseId;
    }

    /**
     * 设置responseId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseId(String value) {
        this.responseId = value;
    }

    /**
     * 获取responseTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseTime() {
        return responseTime;
    }

    /**
     * 设置responseTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseTime(String value) {
        this.responseTime = value;
    }

    /**
     * 获取result属性的值。
     * 
     */
    public int getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     */
    public void setResult(int value) {
        this.result = value;
    }

    /**
     * Gets the value of the balanceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balanceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceListType }
     * 
     * 
     */
    public List<BalanceListType> getBalanceList() {
        if (balanceList == null) {
            balanceList = new ArrayList<BalanceListType>();
        }
        return this.balanceList;
    }

}
