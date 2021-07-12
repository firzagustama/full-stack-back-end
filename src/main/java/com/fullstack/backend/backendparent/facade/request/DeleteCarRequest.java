
package com.fullstack.backend.backendparent.facade.request;

/**
 * @author firzagustama
 * @version $Id: DeleteCarRequest.java, v 0.1 2021-07-12 20.30 firzagustama Exp $$
 */
public class DeleteCarRequest extends BaseRequest {
    /** serialVersionUID */
    private static final long serialVersionUID = -5410360167896067637L;

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