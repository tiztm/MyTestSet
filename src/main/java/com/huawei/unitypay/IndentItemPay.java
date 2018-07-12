
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
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cycleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payIdentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custTaxFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="staffId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="interfaceSerial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prepayFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemList" type="{http://huawei.com/UnityPay/}PayItemListType"/>
 *         &lt;element name="payList" type="{http://huawei.com/UnityPay/}PayListType"/>
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
    "channelId",
    "cycleId",
    "payIdentId",
    "custType",
    "custId",
    "custName",
    "custTaxFlag",
    "staffId",
    "interfaceSerial",
    "prepayFlag",
    "itemList",
    "payList"
})
@XmlRootElement(name = "indentItemPay")
public class IndentItemPay {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String requestTime;
    @XmlElement(required = true)
    protected String platId;
    @XmlElement(required = true)
    protected String channelId;
    protected int cycleId;
    @XmlElement(required = true)
    protected String payIdentId;
    @XmlElement(required = true)
    protected String custType;
    @XmlElement(required = true)
    protected String custId;
    @XmlElement(required = true)
    protected String custName;
    protected int custTaxFlag;
    @XmlElement(required = true)
    protected String staffId;
    @XmlElement(required = true)
    protected String interfaceSerial;
    @XmlElement(required = true)
    protected String prepayFlag;
    @XmlElement(required = true)
    protected PayItemListType itemList;
    @XmlElement(required = true)
    protected PayListType payList;

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
     * 获取payIdentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayIdentId() {
        return payIdentId;
    }

    /**
     * 设置payIdentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayIdentId(String value) {
        this.payIdentId = value;
    }

    /**
     * 获取custType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * 设置custType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * 获取custId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * 设置custId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * 获取custName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 设置custName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * 获取custTaxFlag属性的值。
     * 
     */
    public int getCustTaxFlag() {
        return custTaxFlag;
    }

    /**
     * 设置custTaxFlag属性的值。
     * 
     */
    public void setCustTaxFlag(int value) {
        this.custTaxFlag = value;
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
     * 获取interfaceSerial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceSerial() {
        return interfaceSerial;
    }

    /**
     * 设置interfaceSerial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceSerial(String value) {
        this.interfaceSerial = value;
    }

    /**
     * 获取prepayFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepayFlag() {
        return prepayFlag;
    }

    /**
     * 设置prepayFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepayFlag(String value) {
        this.prepayFlag = value;
    }

    /**
     * 获取itemList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PayItemListType }
     *     
     */
    public PayItemListType getItemList() {
        return itemList;
    }

    /**
     * 设置itemList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PayItemListType }
     *     
     */
    public void setItemList(PayItemListType value) {
        this.itemList = value;
    }

    /**
     * 获取payList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PayListType }
     *     
     */
    public PayListType getPayList() {
        return payList;
    }

    /**
     * 设置payList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PayListType }
     *     
     */
    public void setPayList(PayListType value) {
        this.payList = value;
    }

}
