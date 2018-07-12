
package com.huawei.unitypay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BalanceListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取balanceTypeId属性的值。
     * 
     */
    public int getBalanceTypeId() {
        return balanceTypeId;
    }

    /**
     * 设置balanceTypeId属性的值。
     * 
     */
    public void setBalanceTypeId(int value) {
        this.balanceTypeId = value;
    }

    /**
     * 获取balanceFlag属性的值。
     * 
     */
    public int getBalanceFlag() {
        return balanceFlag;
    }

    /**
     * 设置balanceFlag属性的值。
     * 
     */
    public void setBalanceFlag(int value) {
        this.balanceFlag = value;
    }

    /**
     * 获取balance属性的值。
     * 
     */
    public long getBalance() {
        return balance;
    }

    /**
     * 设置balance属性的值。
     * 
     */
    public void setBalance(long value) {
        this.balance = value;
    }

    /**
     * 获取usedBalance属性的值。
     * 
     */
    public long getUsedBalance() {
        return usedBalance;
    }

    /**
     * 设置usedBalance属性的值。
     * 
     */
    public void setUsedBalance(long value) {
        this.usedBalance = value;
    }

}
