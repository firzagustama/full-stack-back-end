
package com.fullstack.backend.backendparent.facade.request;

/**
 * @author firzagustama
 * @version $Id: BasePaginationRequest.java, v 0.1 2021-07-10 22.12 firzagustama Exp $$
 */
public class BasePaginationRequest extends BaseRequest {
    /** serialVersionUID */
    private static final long serialVersionUID = 1023125524853530998L;

    /** page */
    private int page;

    /** size */
    private int size;


    /**
     * Getter method for property page.
     *
     * @return property value of page
     */
    public int getPage() {
        return page;
    }

    /**
     * Setter method for property page.
     *
     * @param page value to be assigned to property page
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * Getter method for property size.
     *
     * @return property value of size
     */
    public int getSize() {
        return size;
    }

    /**
     * Setter method for property size.
     *
     * @param size value to be assigned to property size
     */
    public void setSize(int size) {
        this.size = size;
    }
}