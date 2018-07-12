
package com.huawei.unitypay;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="payIndentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="staffId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="printType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="invoiceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="invoiceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxBankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pushInfo" type="{http://huawei.com/UnityPay/}PushInfoType" maxOccurs="unbounded" minOccurs="0"/>
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
    "channelId",
    "printType",
    "invoiceType",
    "invoiceId",
    "phoneNbr",
    "email",
    "taxCode",
    "taxBank",
    "taxBankAccount",
    "taxTel",
    "taxAddr",
    "custName",
    "pushInfo"
})
@XmlRootElement(name = "IndentEleInvPrintRequest")
public class IndentEleInvPrintRequest {

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
    @XmlElement(required = true)
    protected String channelId;
    protected int printType;
    protected int invoiceType;
    @XmlElement(required = true)
    protected String invoiceId;
    protected String phoneNbr;
    protected String email;
    protected String taxCode;
    protected String taxBank;
    protected String taxBankAccount;
    protected String taxTel;
    protected String taxAddr;
    protected String custName;
    protected List<PushInfoType> pushInfo;

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
     * ��ȡprintType���Ե�ֵ��
     * 
     */
    public int getPrintType() {
        return printType;
    }

    /**
     * ����printType���Ե�ֵ��
     * 
     */
    public void setPrintType(int value) {
        this.printType = value;
    }

    /**
     * ��ȡinvoiceType���Ե�ֵ��
     * 
     */
    public int getInvoiceType() {
        return invoiceType;
    }

    /**
     * ����invoiceType���Ե�ֵ��
     * 
     */
    public void setInvoiceType(int value) {
        this.invoiceType = value;
    }

    /**
     * ��ȡinvoiceId���Ե�ֵ��
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
     * ����invoiceId���Ե�ֵ��
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
     * ��ȡphoneNbr���Ե�ֵ��
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
     * ����phoneNbr���Ե�ֵ��
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
     * ��ȡemail���Ե�ֵ��
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
     * ����email���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * ��ȡtaxCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * ����taxCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * ��ȡtaxBank���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxBank() {
        return taxBank;
    }

    /**
     * ����taxBank���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxBank(String value) {
        this.taxBank = value;
    }

    /**
     * ��ȡtaxBankAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxBankAccount() {
        return taxBankAccount;
    }

    /**
     * ����taxBankAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxBankAccount(String value) {
        this.taxBankAccount = value;
    }

    /**
     * ��ȡtaxTel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTel() {
        return taxTel;
    }

    /**
     * ����taxTel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTel(String value) {
        this.taxTel = value;
    }

    /**
     * ��ȡtaxAddr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAddr() {
        return taxAddr;
    }

    /**
     * ����taxAddr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAddr(String value) {
        this.taxAddr = value;
    }

    /**
     * ��ȡcustName���Ե�ֵ��
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
     * ����custName���Ե�ֵ��
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
     * Gets the value of the pushInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pushInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPushInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PushInfoType }
     * 
     * 
     */
    public List<PushInfoType> getPushInfo() {
        if (pushInfo == null) {
            pushInfo = new ArrayList<PushInfoType>();
        }
        return this.pushInfo;
    }

}
