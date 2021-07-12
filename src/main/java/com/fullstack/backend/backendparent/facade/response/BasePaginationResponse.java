
package com.fullstack.backend.backendparent.facade.response;

/**
 * @author firzagustama
 * @version $Id: BasePaginationResponse.java, v 0.1 2021-07-10 22.10 firzagustama Exp $$
 */
public class BasePaginationResponse extends BaseResponse {
    /** serialVersionUID */
    private static final long serialVersionUID = -5806974278491413434L;

    /** count */
    private long count;

    /** hasMore */
    private boolean hasMore;

    /**
     * Getter method for property count.
     *
     * @return property value of count
     */
    public long getCount() {
        return count;
    }

    /**
     * Setter method for property count.
     *
     * @param count value to be assigned to property count
     */
    public void setCount(long count) {
        this.count = count;
    }

    /**
     * Getter method for property hasMore.
     *
     * @return property value of hasMore
     */
    public boolean isHasMore() {
        return hasMore;
    }

    /**
     * Setter method for property hasMore.
     *
     * @param hasMore value to be assigned to property hasMore
     */
    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }
}