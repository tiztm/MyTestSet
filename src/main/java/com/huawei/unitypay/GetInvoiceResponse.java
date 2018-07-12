
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
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accNbr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxBankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acctName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InvoiceNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InvoiceInfo" type="{http://huawei.com/UnityPay/}InvoiceInfo" maxOccurs="unbounded" minOccurs="0"/>
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
    "result",
    "errorCode",
    "errorMessage",
    "accNbr",
    "taxCode",
    "taxBank",
    "taxBankAccount",
    "taxTel",
    "taxAddr",
    "acctName",
    "invoiceNum",
    "invoiceInfo"
})
@XmlRootElement(name = "getInvoiceResponse")
public class GetInvoiceResponse {

    @XmlElement(required = true)
    protected String result;
    @XmlElement(required = true)
    protected String errorCode;
    @XmlElement(required = true)
    protected String errorMessage;
    @XmlElement(required = true)
    protected String accNbr;
    protected String taxCode;
    protected String taxBank;
    protected String taxBankAccount;
    protected String taxTel;
    protected String taxAddr;
    @XmlElement(required = true)
    protected String acctName;
    @XmlElement(name = "InvoiceNum", required = true)
    protected String invoiceNum;
    @XmlElement(name = "InvoiceInfo")
    protected List<InvoiceInfo> invoiceInfo;

    /**
     * ��ȡresult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * ����result���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * ��ȡerrorCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * ����errorCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * ��ȡerrorMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * ����errorMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
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
     * ��ȡacctName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * ����acctName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctName(String value) {
        this.acctName = value;
    }

    /**
     * ��ȡinvoiceNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * ����invoiceNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNum(String value) {
        this.invoiceNum = value;
    }

    /**
     * Gets the value of the invoiceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceInfo }
     * 
     * 
     */
    public List<InvoiceInfo> getInvoiceInfo() {
        if (invoiceInfo == null) {
            invoiceInfo = new ArrayList<InvoiceInfo>();
        }
        return this.invoiceInfo;
    }

}
