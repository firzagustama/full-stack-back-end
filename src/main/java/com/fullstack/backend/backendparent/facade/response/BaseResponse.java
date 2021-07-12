
package com.fullstack.backend.backendparent.facade.response;

import java.io.Serializable;

/**
 * @author firzagustama
 * @version $Id: BaseResponse.java, v 0.1 2021-07-10 23.56 firzagustama Exp $$
 */
public class BaseResponse implements Serializable {
    /** serialVersionUID */
    private static final long serialVersionUID = 5831211459178557834L;

    /** success */
    private boolean success;

    /** errorCode */
    private String errorCode;

    /** errorMsg */
    private String errorMsg;

    /**
     * Getter method for property success.
     *
     * @return property value of success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Setter method for property success.
     *
     * @param success value to be assigned to property success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Getter method for property errorCode.
     *
     * @return property value of errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Setter method for property errorCode.
     *
     * @param errorCode value to be assigned to property errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter method for property errorMsg.
     *
     * @return property value of errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Setter method for property errorMsg.
     *
     * @param errorMsg value to be assigned to property errorMsg
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}