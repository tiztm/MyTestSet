
package com.huawei.unitypay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>preprintInvoiceLists complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="preprintInvoiceLists">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoiceList" type="{http://huawei.com/UnityPay/}preprintInvoiceListType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preprintInvoiceLists", propOrder = {
    "invoiceList"
})
public class PreprintInvoiceLists {

    @XmlElement(required = true)
    protected List<PreprintInvoiceListType> invoiceList;

    /**
     * Gets the value of the invoiceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreprintInvoiceListType }
     * 
     * 
     */
    public List<PreprintInvoiceListType> getInvoiceList() {
        if (invoiceList == null) {
            invoiceList = new ArrayList<PreprintInvoiceListType>();
        }
        return this.invoiceList;
    }

}
