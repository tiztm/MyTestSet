
package com.huawei.unitypay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InvoiceListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="InvoiceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoiceItem" type="{http://huawei.com/UnityPay/}InvoiceItemType" maxOccurs="unbounded"/>
 *         &lt;element name="invoiceTxt" type="{http://huawei.com/UnityPay/}invoiceTxtType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceListType", propOrder = {
    "invoiceItem",
    "invoiceTxt"
})
public class InvoiceListType {

    @XmlElement(required = true)
    protected List<InvoiceItemType> invoiceItem;
    @XmlElement(required = true)
    protected List<InvoiceTxtType> invoiceTxt;

    /**
     * Gets the value of the invoiceItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceItemType }
     * 
     * 
     */
    public List<InvoiceItemType> getInvoiceItem() {
        if (invoiceItem == null) {
            invoiceItem = new ArrayList<InvoiceItemType>();
        }
        return this.invoiceItem;
    }

    /**
     * Gets the value of the invoiceTxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceTxt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceTxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceTxtType }
     * 
     * 
     */
    public List<InvoiceTxtType> getInvoiceTxt() {
        if (invoiceTxt == null) {
            invoiceTxt = new ArrayList<InvoiceTxtType>();
        }
        return this.invoiceTxt;
    }

}
