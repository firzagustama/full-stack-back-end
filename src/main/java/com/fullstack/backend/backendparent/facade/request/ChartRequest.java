
package com.fullstack.backend.backendparent.facade.request;

/**
 * @author firzagustama
 * @version $Id: ChartRequest.java, v 0.1 2021-07-13 00.50 firzagustama Exp $$
 */
public class ChartRequest extends BaseRequest {
    /** serialVersionUID */
    private static final long serialVersionUID = 7627909142834879922L;

    /**
     * option between 1 -  5
     */
    private int option;

    /**
     * Getter method for property option.
     *
     * @return property value of option
     */
    public int getOption() {
        return option;
    }

    /**
     * Setter method for property option.
     *
     * @param option value to be assigned to property option
     */
    public void setOption(int option) {
        this.option = option;
    }
}