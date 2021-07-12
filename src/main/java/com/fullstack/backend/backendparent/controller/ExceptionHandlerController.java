
package com.fullstack.backend.backendparent.controller;

import com.fullstack.backend.backendparent.enums.ErrorEnum;
import com.fullstack.backend.backendparent.facade.response.BaseResponse;
import com.fullstack.backend.backendparent.util.exception.BaseException;
import com.fullstack.backend.backendparent.util.exception.ParameterIllegalException;
import com.fullstack.backend.backendparent.util.exception.SessionExpireException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author firzagustama
 * @version $Id: ExceptionHandlerController.java, v 0.1 2021-07-11 00.19 firzagustama Exp $$
 */
@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

    /** logger */
    private final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandlerController.class);

    @ExceptionHandler(value = {SessionExpireException.class})
    protected ResponseEntity<BaseResponse> handleSessionExpire(SessionExpireException exception) {
        ErrorEnum errorEnum = ErrorEnum.PARAM_ILLEGAL;

        logger.warn(exception, exception);

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setSuccess(false);
        baseResponse.setErrorCode(errorEnum.getErrorCode());
        baseResponse.setErrorMsg(errorEnum.getErrorMsg());
        return new ResponseEntity<>(baseResponse, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(value = {BaseException.class})
    protected ResponseEntity<BaseResponse> handleConflict(BaseException exception, WebRequest request) {
        ErrorEnum errorEnum = ErrorEnum.getByCode(exception.getErrorCode());

        logger.warn(exception, exception);

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setSuccess(false);
        baseResponse.setErrorCode(errorEnum.getErrorCode());
        baseResponse.setErrorMsg(errorEnum.getErrorMsg());

        return new ResponseEntity<>(baseResponse, HttpStatus.EXPECTATION_FAILED);
    }

    @ExceptionHandler(value = {ParameterIllegalException.class})
    protected ResponseEntity<BaseResponse> handleParamIllegal(ParameterIllegalException exception) {
        ErrorEnum errorEnum = ErrorEnum.PARAM_ILLEGAL;
        String errorFieldMsg = exception.getErrorFieldMsg();

        logger.warn(exception, exception);

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setSuccess(false);
        baseResponse.setErrorCode(errorEnum.getErrorCode());
        baseResponse.setErrorMsg(String.format(errorEnum.getErrorMsg(), errorFieldMsg));
        return new ResponseEntity<>(baseResponse, HttpStatus.BAD_REQUEST);
    }
}