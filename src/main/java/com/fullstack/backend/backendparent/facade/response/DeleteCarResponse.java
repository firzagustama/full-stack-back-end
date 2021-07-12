
package com.fullstack.backend.backendparent.facade.response;

/**
 * @author firzagustama
 * @version $Id: DeleteCarResponse.java, v 0.1 2021-07-12 20.30 firzagustama Exp $$
 */
public class DeleteCarResponse extends BaseResponse {
    /** serialVersionUID */
    private static final long serialVersionUID = 3265242852520981457L;

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