
package com.huawei.unitypay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InvoiceInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InvoiceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcctMonthMoney" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceInfo", propOrder = {
    "acctMonth",
    "acctMonthMoney"
})
public class InvoiceInfo {

    @XmlElement(name = "AcctMonth", required = true)
    protected String acctMonth;
    @XmlElement(name = "AcctMonthMoney", required = true)
    protected String acctMonthMoney;

    /**
     * 获取acctMonth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctMonth() {
        return acctMonth;
    }

    /**
     * 设置acctMonth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctMonth(String value) {
        this.acctMonth = value;
    }

    /**
     * 获取acctMonthMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctMonthMoney() {
        return acctMonthMoney;
    }

    /**
     * 设置acctMonthMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctMonthMoney(String value) {
        this.acctMonthMoney = value;
    }

}
