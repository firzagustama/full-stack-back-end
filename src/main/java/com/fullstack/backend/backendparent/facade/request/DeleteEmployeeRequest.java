
package com.fullstack.backend.backendparent.facade.request;

/**
 * @author firzagustama
 * @version $Id: DeleteEmployeeRequest.java, v 0.1 2021-07-12 19.17 firzagustama Exp $$
 */
public class DeleteEmployeeRequest extends BaseRequest {
    /** serialVersionUID */
    private static final long serialVersionUID = 434592055444783720L;

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