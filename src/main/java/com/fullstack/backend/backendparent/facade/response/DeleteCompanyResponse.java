
package com.fullstack.backend.backendparent.facade.response;

/**
 * @author firzagustama
 * @version $Id: DeleteCompanyResponse.java, v 0.1 2021-07-12 20.08 firzagustama Exp $$
 */
public class DeleteCompanyResponse extends BaseResponse {
    /** serialVersionUID */
    private static final long serialVersionUID = 2652624259125349575L;

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