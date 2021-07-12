
package com.fullstack.backend.backendparent.util.domain;

import java.io.Serializable;

/**
 * @author firzagustama
 * @version $Id: MoneyView.java, v 0.1 2021-07-10 22.39 firzagustama Exp $$
 */
public class MoneyView implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = 2482864839728799418L;

    /** amount */
    private String amount;

    /** currency */
    private String currency;

    /**
     * Getter method for property amount.
     *
     * @return property value of amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Setter method for property amount.
     *
     * @param amount value to be assigned to property amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Getter method for property currency.
     *
     * @return property value of currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter method for property currency.
     *
     * @param currency value to be assigned to property currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}