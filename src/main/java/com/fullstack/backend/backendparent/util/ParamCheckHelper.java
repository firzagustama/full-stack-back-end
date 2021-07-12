
package com.fullstack.backend.backendparent.util;

import com.fullstack.backend.backendparent.util.exception.ParameterIllegalException;

/**
 * @author firzagustama
 * @version $Id: ParamCheckHelper.java, v 0.1 2021-07-11 00.38 firzagustama Exp $$
 */
public class ParamCheckHelper {

    public static void isNotBlank(String fieldValue, String fieldName) {
        if (StringUtil.isNotBlank(fieldValue)) {
            return;
        }

        throw new ParameterIllegalException(fieldName + " must not be blank");
    }

    public static void isNotNull(Object fieldValue, String fieldName) {
        if (fieldValue != null) {
            return;
        }

        throw new ParameterIllegalException(fieldName + "must not be null");
    }

    public static void isExpected(boolean value, String fieldName) {
        if (value) {
            return;
        }

        throw new ParameterIllegalException(fieldName + "is not expected");
    }

    public static void isGreaterThanZero(double fieldValue, String fieldName) {
        if (fieldValue > 0) {
            return;
        }

        throw new ParameterIllegalException(fieldName + " must be greater than 0");
    }

    public static void isNotEitherBlank(String fieldValue1, String fieldName1, String fieldValue2, String fieldName2) {
        if (StringUtil.isNotBlank(fieldValue1) || StringUtil.isNotBlank(fieldValue2)) {
            return;
        }

        throw new ParameterIllegalException(fieldName1 + " and " + fieldName2 + " must not be blank in the same time");
    }
}