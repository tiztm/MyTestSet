
package com.huawei.unitypay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>verifyItemType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="verifyItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="materialKind" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyItemType", propOrder = {
    "itemId",
    "itemFlag",
    "itemTypeId",
    "materialKind",
    "charge"
})
public class VerifyItemType {

    @XmlElement(required = true)
    protected String itemId;
    @XmlElement(required = true)
    protected String itemFlag;
    @XmlElement(required = true)
    protected String itemTypeId;
    protected Integer materialKind;
    protected int charge;

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

}
