
package com.fullstack.backend.backendparent.util.exception;

/**
 * @author firzagustama
 * @version $Id: BaseException.java, v 0.1 2021-07-11 00.24 firzagustama Exp $$
 */
public class BaseException extends RuntimeException {
    /** serialVersionUID */
    private static final long serialVersionUID = 4999647522122438015L;

    /** errorCode */
    private String errorCode;

    /** errorMsg */
    private String errorMsg;

    public BaseException() {
        super();
    }

    public BaseException(String errorCode) {
        super();
        this.errorCode = errorCode;
    }

    public BaseException(String errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
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