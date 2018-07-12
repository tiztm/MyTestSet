
package com.huawei.unitypay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refundPayIndentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="chargeStd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="settleCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commissionType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="commission" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="productOfferId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="productOfferInstanceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ItemType", propOrder = {
    "refundPayIndentId",
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
public class ItemType {

    @XmlElement(required = true)
    protected String refundPayIndentId;
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
    protected int chargeStd;
    protected int charge;
    protected String settleCharge;
    protected int commissionType;
    protected int commission;
    protected int productOfferId;
    @XmlElement(required = true)
    protected String productOfferInstanceId;
    protected int count;
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
     * 获取refundPayIndentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundPayIndentId() {
        return refundPayIndentId;
    }

    /**
     * 设置refundPayIndentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundPayIndentId(String value) {
        this.refundPayIndentId = value;
    }

    /**
     * 获取custIndentNbr属性的值。
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
     * 设置custIndentNbr属性的值。
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
     * 获取itemId属性的值。
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
     * 设置itemId属性的值。
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
     * 获取itemFlag属性的值。
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
     * 设置itemFlag属性的值。
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
     * 获取itemTypeId属性的值。
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
     * 设置itemTypeId属性的值。
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
     * 获取materialKind属性的值。
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
     * 设置materialKind属性的值。
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
     * 获取settleType属性的值。
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
     * 设置settleType属性的值。
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
     *     {@link Long }
     *     
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * 设置couponId属性的值。
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
     * 获取contractMonths属性的值。
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
     * 设置contractMonths属性的值。
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
     * 获取settleAgentOrgId属性的值。
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
     * 设置settleAgentOrgId属性的值。
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
     * 获取chargeStd属性的值。
     * 
     */
    public int getChargeStd() {
        return chargeStd;
    }

    /**
     * 设置chargeStd属性的值。
     * 
     */
    public void setChargeStd(int value) {
        this.chargeStd = value;
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
     * 获取settleCharge属性的值。
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
     * 设置settleCharge属性的值。
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
     * 获取commissionType属性的值。
     * 
     */
    public int getCommissionType() {
        return commissionType;
    }

    /**
     * 设置commissionType属性的值。
     * 
     */
    public void setCommissionType(int value) {
        this.commissionType = value;
    }

    /**
     * 获取commission属性的值。
     * 
     */
    public int getCommission() {
        return commission;
    }

    /**
     * 设置commission属性的值。
     * 
     */
    public void setCommission(int value) {
        this.commission = value;
    }

    /**
     * 获取productOfferId属性的值。
     * 
     */
    public int getProductOfferId() {
        return productOfferId;
    }

    /**
     * 设置productOfferId属性的值。
     * 
     */
    public void setProductOfferId(int value) {
        this.productOfferId = value;
    }

    /**
     * 获取productOfferInstanceId属性的值。
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
     * 设置productOfferInstanceId属性的值。
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
     * 获取count属性的值。
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置count属性的值。
     * 
     */
    public void setCount(int value) {
        this.count = value;
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
     * 获取acctId属性的值。
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
     * 设置acctId属性的值。
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
     * 获取billingMode属性的值。
     * 
     */
    public int getBillingMode() {
        return billingMode;
    }

    /**
     * 设置billingMode属性的值。
     * 
     */
    public void setBillingMode(int value) {
        this.billingMode = value;
    }

    /**
     * 获取productSpecId属性的值。
     * 
     */
    public int getProductSpecId() {
        return productSpecId;
    }

    /**
     * 设置productSpecId属性的值。
     * 
     */
    public void setProductSpecId(int value) {
        this.productSpecId = value;
    }

    /**
     * 获取productSpecName属性的值。
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
     * 设置productSpecName属性的值。
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
