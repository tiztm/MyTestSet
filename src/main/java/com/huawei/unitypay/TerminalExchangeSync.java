
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
 *         &lt;element name="exchangeDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="staffId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payIndentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AUDIT_TICKET_CD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="facevalue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="servId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ticketGenDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="couponName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="couponId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bcdCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="staffidGen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="staffidReverse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offerSpecName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "exchangeDate",
    "staffId",
    "channelId",
    "payIndentId",
    "auditticketcd",
    "facevalue",
    "remark",
    "charge",
    "servId",
    "accNbr",
    "ticketGenDate",
    "couponName",
    "couponId",
    "bcdCode",
    "staffidGen",
    "staffidReverse",
    "offerSpecName"
})
@XmlRootElement(name = "TerminalExchangeSync")
public class TerminalExchangeSync {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String requestTime;
    @XmlElement(required = true)
    protected String platId;
    protected int cycleId;
    @XmlElement(required = true)
    protected String exchangeDate;
    @XmlElement(required = true)
    protected String staffId;
    @XmlElement(required = true)
    protected String channelId;
    @XmlElement(required = true)
    protected String payIndentId;
    @XmlElement(name = "AUDIT_TICKET_CD", required = true)
    protected String auditticketcd;
    @XmlElement(required = true)
    protected String facevalue;
    @XmlElement(required = true)
    protected String remark;
    protected int charge;
    @XmlElement(required = true)
    protected String servId;
    @XmlElement(required = true)
    protected String accNbr;
    @XmlElement(required = true)
    protected String ticketGenDate;
    @XmlElement(required = true)
    protected String couponName;
    @XmlElement(required = true)
    protected String couponId;
    @XmlElement(required = true)
    protected String bcdCode;
    @XmlElement(required = true)
    protected String staffidGen;
    @XmlElement(required = true)
    protected String staffidReverse;
    @XmlElement(required = true)
    protected String offerSpecName;

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
     * 获取exchangeDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeDate() {
        return exchangeDate;
    }

    /**
     * 设置exchangeDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeDate(String value) {
        this.exchangeDate = value;
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
     * 获取auditticketcd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUDITTICKETCD() {
        return auditticketcd;
    }

    /**
     * 设置auditticketcd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUDITTICKETCD(String value) {
        this.auditticketcd = value;
    }

    /**
     * 获取facevalue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacevalue() {
        return facevalue;
    }

    /**
     * 设置facevalue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacevalue(String value) {
        this.facevalue = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 获取charge属性的值。
     * 
     */
    public int getCharge() {
        return charge;
    }

    /**
     * 设置charge属性的值。
     * 
     */
    public void setCharge(int value) {
        this.charge = value;
    }

    /**
     * 获取servId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServId() {
        return servId;
    }

    /**
     * 设置servId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServId(String value) {
        this.servId = value;
    }

    /**
     * 获取accNbr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccNbr() {
        return accNbr;
    }

    /**
     * 设置accNbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccNbr(String value) {
        this.accNbr = value;
    }

    /**
     * 获取ticketGenDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketGenDate() {
        return ticketGenDate;
    }

    /**
     * 设置ticketGenDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketGenDate(String value) {
        this.ticketGenDate = value;
    }

    /**
     * 获取couponName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponName() {
        return couponName;
    }

    /**
     * 设置couponName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponName(String value) {
        this.couponName = value;
    }

    /**
     * 获取couponId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * 设置couponId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponId(String value) {
        this.couponId = value;
    }

    /**
     * 获取bcdCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBcdCode() {
        return bcdCode;
    }

    /**
     * 设置bcdCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBcdCode(String value) {
        this.bcdCode = value;
    }

    /**
     * 获取staffidGen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffidGen() {
        return staffidGen;
    }

    /**
     * 设置staffidGen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffidGen(String value) {
        this.staffidGen = value;
    }

    /**
     * 获取staffidReverse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffidReverse() {
        return staffidReverse;
    }

    /**
     * 设置staffidReverse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffidReverse(String value) {
        this.staffidReverse = value;
    }

    /**
     * 获取offerSpecName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferSpecName() {
        return offerSpecName;
    }

    /**
     * 设置offerSpecName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferSpecName(String value) {
        this.offerSpecName = value;
    }

}
