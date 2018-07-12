
package com.huawei.unitypay;

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
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="platId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cycleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payIndentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="staffId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="printType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="invoiceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "requestId",
    "requestTime",
    "platId",
    "cycleId",
    "payIndentId",
    "staffId",
    "printType",
    "invoiceType",
    "invoiceId",
    "channelId",
    "phoneNbr",
    "email"
})
@XmlRootElement(name = "indentInvoicePrint")
public class IndentInvoicePrint {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String requestTime;
    @XmlElement(required = true)
    protected String platId;
    protected int cycleId;
    @XmlElement(required = true)
    protected String payIndentId;
    @XmlElement(required = true)
    protected String staffId;
    protected int printType;
    protected int invoiceType;
    @XmlElement(required = true)
    protected String invoiceId;
    @XmlElement(required = true)
    protected String channelId;
    @XmlElement(required = true)
    protected String phoneNbr;
    @XmlElement(required = true)
    protected String email;

    /**
     * 获取requestId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * 设置requestId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * 获取requestTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTime() {
        return requestTime;
    }

    /**
     * 设置requestTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTime(String value) {
        this.requestTime = value;
    }

    /**
     * 获取platId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatId() {
        return platId;
    }

    /**
     * 设置platId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatId(String value) {
        this.platId = value;
    }

    /**
     * 获取cycleId属性的值。
     * 
     */
    public int getCycleId() {
        return cycleId;
    }

    /**
     * 设置cycleId属性的值。
     * 
     */
    public void setCycleId(int value) {
        this.cycleId = value;
    }

    /**
     * 获取payIndentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayIndentId() {
        return payIndentId;
    }

    /**
     * 设置payIndentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayIndentId(String value) {
        this.payIndentId = value;
    }

    /**
     * 获取staffId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * 设置staffId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffId(String value) {
        this.staffId = value;
    }

    /**
     * 获取printType属性的值。
     * 
     */
    public int getPrintType() {
        return printType;
    }

    /**
     * 设置printType属性的值。
     * 
     */
    public void setPrintType(int value) {
        this.printType = value;
    }

    /**
     * 获取invoiceType属性的值。
     * 
     */
    public int getInvoiceType() {
        return invoiceType;
    }

    /**
     * 设置invoiceType属性的值。
     * 
     */
    public void setInvoiceType(int value) {
        this.invoiceType = value;
    }

    /**
     * 获取invoiceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * 设置invoiceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceId(String value) {
        this.invoiceId = value;
    }

    /**
     * 获取channelId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * 设置channelId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * 获取phoneNbr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNbr() {
        return phoneNbr;
    }

    /**
     * 设置phoneNbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNbr(String value) {
        this.phoneNbr = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
