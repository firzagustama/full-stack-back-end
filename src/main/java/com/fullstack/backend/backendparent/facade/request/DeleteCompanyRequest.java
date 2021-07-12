
package com.fullstack.backend.backendparent.facade.request;

/**
 * @author firzagustama
 * @version $Id: DeleteCompanyRequest.java, v 0.1 2021-07-12 20.07 firzagustama Exp $$
 */
public class DeleteCompanyRequest extends BaseRequest {
    /** serialVersionUID */
    private static final long serialVersionUID = -8135509365212250390L;

    /** id */
    private int id;

    /**
     * Getter method for property id.
     *
     * @return property value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for property id.
     *
     * @param id value to be assigned to property id
     */
    public void setId(int id) {
        this.id = id;
    }
}