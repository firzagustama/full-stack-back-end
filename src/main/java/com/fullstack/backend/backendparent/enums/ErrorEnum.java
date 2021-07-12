
package com.fullstack.backend.backendparent.enums;

/**
 * @author firzagustama
 * @version $Id: ErrorEnum.java, v 0.1 2021-07-11 00.25 firzagustama Exp $$
 */
public enum ErrorEnum {
    /**
     * login failed
     */
    USER_NOT_EXISTS("100", "User doesn't exists, Please register first", "failed to login user doesn't exists"),
    PASSWORD_NOT_MATCH("101", "Wrong password, please try again or reset your password", "password not match"),

    /**
     * register failed
     */
    USERNAME_EXISTS("110", "This username is already taken, please use another username", "failed register username must be unique"),
    EMAIL_EXISTS("111", "This email is already taken, please use another email", "failed register email must be unique"),
    PASSWORD_TOO_SHORT("112", "Password length must be above 8", "password length fail"),

    /**
     * data related
     */
    UPDATE_DATA_NOT_EXISTS("200", "Your data that will be updated is not exists, check your id", "data not exists"),

    /**
     * general error
     */
    UNEXPECTED_ERROR("500", "System busy. Please try again later", "unexpected error please dev to check"),
    SESSION_EXPIRED("510", "Session expire, Please login", "user need to login"),
    PARAM_ILLEGAL("550", "Parameter Illegal. %s", "request body not expected");

    /**
     * errorCode
     */
    private String errorCode;

    /**
     * errorMsg
     */
    private String errorMsg;

    /**
     * description
     */
    private String description;

    /**
     * Default Constructor
     *
     * @param errorCode
     * @param errorMsg
     * @param description
     */
     ErrorEnum(String errorCode, String errorMsg, String description) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.description = description;
    }

    /**
     * getByCode
     * @param errorCode
     */
    public static ErrorEnum getByCode(String errorCode) {
        for (ErrorEnum e : ErrorEnum.values()) {
            if (e.errorCode.equals(errorCode)) {
                return e;
            }
        }

        return UNEXPECTED_ERROR;
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
     * Getter method for property errorMsg.
     *
     * @return property value of errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Getter method for property description.
     *
     * @return property value of description
     */
    public String getDescription() {
        return description;
    }
}