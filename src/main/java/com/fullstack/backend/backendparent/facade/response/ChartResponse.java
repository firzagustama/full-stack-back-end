
package com.fullstack.backend.backendparent.facade.response;

import java.util.List;

/**
 * @author firzagustama
 * @version $Id: ChartResponse.java, v 0.1 2021-07-13 00.51 firzagustama Exp $$
 */
public class ChartResponse extends BaseResponse {
    /** serialVersionUID */
    private static final long serialVersionUID = 1217608913148682444L;

    /** label */
    private List<String> label;

    /** data */
    private List<Long> data;

    /**
     * Getter method for property label.
     *
     * @return property value of label
     */
    public List<String> getLabel() {
        return label;
    }

    /**
     * Setter method for property label.
     *
     * @param label value to be assigned to property label
     */
    public void setLabel(List<String> label) {
        this.label = label;
    }

    /**
     * Getter method for property data.
     *
     * @return property value of data
     */
    public List<Long> getData() {
        return data;
    }

    /**
     * Setter method for property data.
     *
     * @param data value to be assigned to property data
     */
    public void setData(List<Long> data) {
        this.data = data;
    }
}