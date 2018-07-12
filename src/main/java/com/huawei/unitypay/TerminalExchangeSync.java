
package com.huawei.unitypay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡrequestId���Ե�ֵ��
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
     * ����requestId���Ե�ֵ��
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
     * ��ȡrequestTime���Ե�ֵ��
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
     * ����requestTime���Ե�ֵ��
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
     * ��ȡplatId���Ե�ֵ��
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
     * ����platId���Ե�ֵ��
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
     * ��ȡcycleId���Ե�ֵ��
     * 
     */
    public int getCycleId() {
        return cycleId;
    }

    /**
     * ����cycleId���Ե�ֵ��
     * 
     */
    public void setCycleId(int value) {
        this.cycleId = value;
    }

    /**
     * ��ȡexchangeDate���Ե�ֵ��
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
     * ����exchangeDate���Ե�ֵ��
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
     * ��ȡstaffId���Ե�ֵ��
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
     * ����staffId���Ե�ֵ��
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
     * ��ȡchannelId���Ե�ֵ��
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
     * ����channelId���Ե�ֵ��
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
     * ��ȡpayIndentId���Ե�ֵ��
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
     * ����payIndentId���Ե�ֵ��
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
     * ��ȡauditticketcd���Ե�ֵ��
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
     * ����auditticketcd���Ե�ֵ��
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
     * ��ȡfacevalue���Ե�ֵ��
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
     * ����facevalue���Ե�ֵ��
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
     * ��ȡremark���Ե�ֵ��
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
     * ����remark���Ե�ֵ��
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
     * ��ȡcharge���Ե�ֵ��
     * 
     */
    public int getCharge() {
        return charge;
    }

    /**
     * ����charge���Ե�ֵ��
     * 
     */
    public void setCharge(int value) {
        this.charge = value;
    }

    /**
     * ��ȡservId���Ե�ֵ��
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
     * ����servId���Ե�ֵ��
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
     * ��ȡaccNbr���Ե�ֵ��
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
     * ����accNbr���Ե�ֵ��
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
     * ��ȡticketGenDate���Ե�ֵ��
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
     * ����ticketGenDate���Ե�ֵ��
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
     * ��ȡcouponName���Ե�ֵ��
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
     * ����couponName���Ե�ֵ��
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
     * ��ȡcouponId���Ե�ֵ��
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
     * ����couponId���Ե�ֵ��
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
     * ��ȡbcdCode���Ե�ֵ��
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
     * ����bcdCode���Ե�ֵ��
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
     * ��ȡstaffidGen���Ե�ֵ��
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
     * ����staffidGen���Ե�ֵ��
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
     * ��ȡstaffidReverse���Ե�ֵ��
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
     * ����staffidReverse���Ե�ֵ��
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
     * ��ȡofferSpecName���Ե�ֵ��
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
     * ����offerSpecName���Ե�ֵ��
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
