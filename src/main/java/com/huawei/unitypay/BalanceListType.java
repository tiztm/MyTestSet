
package com.huawei.unitypay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BalanceListType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="BalanceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="balanceTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="balanceFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="usedBalance" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceListType", propOrder = {
    "balanceTypeId",
    "balanceFlag",
    "balance",
    "usedBalance"
})
public class BalanceListType {

    protected int balanceTypeId;
    protected int balanceFlag;
    protected long balance;
    protected long usedBalance;

    /**
     * ��ȡbalanceTypeId���Ե�ֵ��
     * 
     */
    public int getBalanceTypeId() {
        return balanceTypeId;
    }

    /**
     * ����balanceTypeId���Ե�ֵ��
     * 
     */
    public void setBalanceTypeId(int value) {
        this.balanceTypeId = value;
    }

    /**
     * ��ȡbalanceFlag���Ե�ֵ��
     * 
     */
    public int getBalanceFlag() {
        return balanceFlag;
    }

    /**
     * ����balanceFlag���Ե�ֵ��
     * 
     */
    public void setBalanceFlag(int value) {
        this.balanceFlag = value;
    }

    /**
     * ��ȡbalance���Ե�ֵ��
     * 
     */
    public long getBalance() {
        return balance;
    }

    /**
     * ����balance���Ե�ֵ��
     * 
     */
    public void setBalance(long value) {
        this.balance = value;
    }

    /**
     * ��ȡusedBalance���Ե�ֵ��
     * 
     */
    public long getUsedBalance() {
        return usedBalance;
    }

    /**
     * ����usedBalance���Ե�ֵ��
     * 
     */
    public void setUsedBalance(long value) {
        this.usedBalance = value;
    }

}
