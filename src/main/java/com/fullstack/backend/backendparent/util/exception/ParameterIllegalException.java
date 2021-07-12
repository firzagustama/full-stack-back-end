
package com.fullstack.backend.backendparent.util.exception;

/**
 * @author firzagustama
 * @version $Id: ParameterIllegalException.java, v 0.1 2021-07-11 00.41 firzagustama Exp $$
 */
public class ParameterIllegalException extends BaseException {
    /** serialVersionUID */
    private static final long serialVersionUID = 541565493875262346L;

    /** errorFieldMsg */
    private String errorFieldMsg;

    public ParameterIllegalException(String errorFieldMsg) {
        super();
        this.errorFieldMsg = errorFieldMsg;
    }

    /**
     * Getter method for property errorFieldMsg.
     *
     * @return property value of errorFieldMsg
     */
    public String getErrorFieldMsg() {
        return errorFieldMsg;
    }

    /**
     * Setter method for property errorFieldMsg.
     *
     * @param errorFieldMsg value to be assigned to property errorFieldMsg
     */
    public void setErrorFieldMsg(String errorFieldMsg) {
        this.errorFieldMsg = errorFieldMsg;
    }
}