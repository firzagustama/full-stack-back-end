
package com.fullstack.backend.backendparent.enums;

/**
 * @author firzagustama
 * @version $Id: CurrencyEnum.java, v 0.1 2021-07-10 22.48 firzagustama Exp $$
 */
public enum CurrencyEnum {
    IDR("Rp", ".", "Rupiah"),
    USD("$", ",", "US Dollar"),
    SGP("$", ",", "Singapore Dollar");

    /** currency */
    private String currency;

    /** divider */
    private String divider;

    /** description */
    private String description;

    CurrencyEnum(String currency, String divider, String description) {
        this.currency = currency;
        this.divider = divider;
        this.description = description;
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

    /**
     * Getter method for property divider.
     *
     * @return property value of divider
     */
    public String getDivider() {
        return divider;
    }

    /**
     * Setter method for property divider.
     *
     * @param divider value to be assigned to property divider
     */
    public void setDivider(String divider) {
        this.divider = divider;
    }

    /**
     * Getter method for property description.
     *
     * @return property value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for property description.
     *
     * @param description value to be assigned to property description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
