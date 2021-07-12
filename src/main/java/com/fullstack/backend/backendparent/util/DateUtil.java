
package com.fullstack.backend.backendparent.util;

import com.fullstack.backend.backendparent.enums.ErrorEnum;
import com.fullstack.backend.backendparent.util.constants.DateConstants;
import com.fullstack.backend.backendparent.util.exception.BaseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author firzagustama
 * @version $Id: DateUtil.java, v 0.1 2021-07-12 19.36 firzagustama Exp $$
 */
public class DateUtil {

    /** logger */
    private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);

    /**
     * convert String to Date using default date format
     *
     * @see {@link DateConstants#DEFAULT_DATE_FORMAT}
     * @param date
     * @return
     */
    public static Date fromString(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DateConstants.DEFAULT_DATE_FORMAT);
        Date dateResult;
        try {
            dateResult = sdf.parse(date);
        } catch (Exception e) {
            logger.warn("Fail to convert string to date, strDate: " + date + "; using format " + DateConstants.DEFAULT_DATE_FORMAT);
            throw new BaseException(ErrorEnum.UNEXPECTED_ERROR.getErrorCode());
        }
        return dateResult;
    }

}