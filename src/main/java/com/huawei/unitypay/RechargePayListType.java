
package com.huawei.unitypay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RechargePayListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RechargePayListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payInfo" type="{http://huawei.com/UnityPay/}RechargePayInfoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargePayListType", propOrder = {
    "payInfo"
})
public class RechargePayListType {

    @XmlElement(required = true)
    protected List<RechargePayInfoType> payInfo;

    /**
     * Gets the value of the payInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RechargePayInfoType }
     * 
     * 
     */
    public List<RechargePayInfoType> getPayInfo() {
        if (payInfo == null) {
            payInfo = new ArrayList<RechargePayInfoType>();
        }
        return this.payInfo;
    }

}
