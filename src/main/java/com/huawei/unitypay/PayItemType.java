
package com.huawei.unitypay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PayItemType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PayItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refundPayIdentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custIndentNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="materialKind" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="settleType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="couponName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="couponId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bcdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractMonths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="settleAgentOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="chargeStd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="settleCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commissionType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="productOfferId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="productOfferInstanceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="servId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acctId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingMode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="productSpecId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="productSpecName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayItemType", propOrder = {
    "refundPayIdentId",
    "custIndentNbr",
    "itemId",
    "itemFlag",
    "itemTypeId",
    "materialKind",
    "settleType",
    "couponName",
    "couponId",
    "bcdCode",
    "contractMonths",
    "settleAgentOrgId",
    "chargeStd",
    "charge",
    "settleCharge",
    "commissionType",
    "commission",
    "productOfferId",
    "productOfferInstanceId",
    "count",
    "servId",
    "acctId",
    "accNbr",
    "billingMode",
    "productSpecId",
    "productSpecName"
})
public class PayItemType {

    @XmlElement(required = true)
    protected String refundPayIdentId;
    @XmlElement(required = true)
    protected String custIndentNbr;
    @XmlElement(required = true)
    protected String itemId;
    @XmlElement(required = true)
    protected String itemFlag;
    @XmlElement(required = true)
    protected String itemTypeId;
    protected Integer materialKind;
    protected Integer settleType;
    protected String couponName;
    protected Long couponId;
    protected String bcdCode;
    protected Integer contractMonths;
    protected Long settleAgentOrgId;
    @XmlElement(required = true)
    protected String chargeStd;
    @XmlElement(required = true)
    protected String charge;
    protected String settleCharge;
    protected int commissionType;
    protected int commission;
    protected int productOfferId;
    @XmlElement(required = true)
    protected String productOfferInstanceId;
    @XmlElement(required = true)
    protected String count;
    @XmlElement(required = true)
    protected String servId;
    @XmlElement(required = true)
    protected String acctId;
    @XmlElement(required = true)
    protected String accNbr;
    protected int billingMode;
    protected int productSpecId;
    @XmlElement(required = true)
    protected String productSpecName;

    /**
     * ��ȡrefundPayIdentId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundPayIdentId() {
        return refundPayIdentId;
    }

    /**
     * ����refundPayIdentId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundPayIdentId(String value) {
        this.refundPayIdentId = value;
    }

    /**
     * ��ȡcustIndentNbr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustIndentNbr() {
        return custIndentNbr;
    }

    /**
     * ����custIndentNbr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustIndentNbr(String value) {
        this.custIndentNbr = value;
    }

    /**
     * ��ȡitemId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * ����itemId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * ��ȡitemFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemFlag() {
        return itemFlag;
    }

    /**
     * ����itemFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemFlag(String value) {
        this.itemFlag = value;
    }

    /**
     * ��ȡitemTypeId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTypeId() {
        return itemTypeId;
    }

    /**
     * ����itemTypeId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTypeId(String value) {
        this.itemTypeId = value;
    }

    /**
     * ��ȡmaterialKind���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaterialKind() {
        return materialKind;
    }

    /**
     * ����materialKind���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaterialKind(Integer value) {
        this.materialKind = value;
    }

    /**
     * ��ȡsettleType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSettleType() {
        return settleType;
    }

    /**
     * ����settleType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSettleType(Integer value) {
        this.settleType = value;
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
     *     {@link Long }
     *     
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * ����couponId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCouponId(Long value) {
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
     * ��ȡcontractMonths���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractMonths() {
        return contractMonths;
    }

    /**
     * ����contractMonths���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractMonths(Integer value) {
        this.contractMonths = value;
    }

    /**
     * ��ȡsettleAgentOrgId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSettleAgentOrgId() {
        return settleAgentOrgId;
    }

    /**
     * ����settleAgentOrgId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSettleAgentOrgId(Long value) {
        this.settleAgentOrgId = value;
    }

    /**
     * ��ȡchargeStd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeStd() {
        return chargeStd;
    }

    /**
     * ����chargeStd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeStd(String value) {
        this.chargeStd = value;
    }

    /**
     * ��ȡcharge���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharge() {
        return charge;
    }

    /**
     * ����charge���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharge(String value) {
        this.charge = value;
    }

    /**
     * ��ȡsettleCharge���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleCharge() {
        return settleCharge;
    }

    /**
     * ����settleCharge���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleCharge(String value) {
        this.settleCharge = value;
    }

    /**
     * ��ȡcommissionType���Ե�ֵ��
     * 
     */
    public int getCommissionType() {
        return commissionType;
    }

    /**
     * ����commissionType���Ե�ֵ��
     * 
     */
    public void setCommissionType(int value) {
        this.commissionType = value;
    }

    /**
     * ��ȡcommission���Ե�ֵ��
     * 
     */
    public int getCommission() {
        return commission;
    }

    /**
     * ����commission���Ե�ֵ��
     * 
     */
    public void setCommission(int value) {
        this.commission = value;
    }

    /**
     * ��ȡproductOfferId���Ե�ֵ��
     * 
     */
    public int getProductOfferId() {
        return productOfferId;
    }

    /**
     * ����productOfferId���Ե�ֵ��
     * 
     */
    public void setProductOfferId(int value) {
        this.productOfferId = value;
    }

    /**
     * ��ȡproductOfferInstanceId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductOfferInstanceId() {
        return productOfferInstanceId;
    }

    /**
     * ����productOfferInstanceId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductOfferInstanceId(String value) {
        this.productOfferInstanceId = value;
    }

    /**
     * ��ȡcount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCount() {
        return count;
    }

    /**
     * ����count���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {
        this.count = value;
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
     * ��ȡacctId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * ����acctId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
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
     * ��ȡbillingMode���Ե�ֵ��
     * 
     */
    public int getBillingMode() {
        return billingMode;
    }

    /**
     * ����billingMode���Ե�ֵ��
     * 
     */
    public void setBillingMode(int value) {
        this.billingMode = value;
    }

    /**
     * ��ȡproductSpecId���Ե�ֵ��
     * 
     */
    public int getProductSpecId() {
        return productSpecId;
    }

    /**
     * ����productSpecId���Ե�ֵ��
     * 
     */
    public void setProductSpecId(int value) {
        this.productSpecId = value;
    }

    /**
     * ��ȡproductSpecName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSpecName() {
        return productSpecName;
    }

    /**
     * ����productSpecName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSpecName(String value) {
        this.productSpecName = value;
    }

}
