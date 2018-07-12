
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
 *         &lt;element name="cycleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payIndentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalCharge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custTaxFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalChargeGet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="staffId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemList" type="{http://huawei.com/UnityPay/}BatchSyncItemListType"/>
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
    "payIndentId",
    "agentId",
    "agentName",
    "totalCharge",
    "custTaxFlag",
    "totalChargeGet",
    "totalCount",
    "staffId",
    "itemList"
})
@XmlRootElement(name = "batchIndentItemSync")
public class BatchIndentItemSync {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected String requestTime;
    @XmlElement(required = true)
    protected String platId;
    @XmlElement(required = true)
    protected String channelId;
    @XmlElement(required = true)
    protected String cycleId;
    @XmlElement(required = true)
    protected String payIndentId;
    @XmlElement(required = true)
    protected String agentId;
    @XmlElement(required = true)
    protected String agentName;
    @XmlElement(required = true)
    protected String totalCharge;
    protected int custTaxFlag;
    @XmlElement(required = true)
    protected String totalChargeGet;
    @XmlElement(required = true)
    protected String totalCount;
    @XmlElement(required = true)
    protected String staffId;
    @XmlElement(required = true)
    protected BatchSyncItemListType itemList;

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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleId() {
        return cycleId;
    }

    /**
     * 设置cycleId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleId(String value) {
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
     * 获取agentId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * 设置agentId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

    /**
     * 获取agentName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * 设置agentName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
    }

    /**
     * 获取totalCharge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCharge() {
        return totalCharge;
    }

    /**
     * 设置totalCharge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCharge(String value) {
        this.totalCharge = value;
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
     * 获取totalChargeGet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalChargeGet() {
        return totalChargeGet;
    }

    /**
     * 设置totalChargeGet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalChargeGet(String value) {
        this.totalChargeGet = value;
    }

    /**
     * 获取totalCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCount() {
        return totalCount;
    }

    /**
     * 设置totalCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCount(String value) {
        this.totalCount = value;
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
     * 获取itemList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BatchSyncItemListType }
     *     
     */
    public BatchSyncItemListType getItemList() {
        return itemList;
    }

    /**
     * 设置itemList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BatchSyncItemListType }
     *     
     */
    public void setItemList(BatchSyncItemListType value) {
        this.itemList = value;
    }

}
