
package com.huawei.unitypay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>verifyItemType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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

}
