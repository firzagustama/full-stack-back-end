
package com.fullstack.backend.backendparent.util;

import com.fullstack.backend.backendparent.util.constants.DateConstants;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author firzagustama
 * @version $Id: StringUtil.java, v 0.1 2021-07-10 23.54 firzagustama Exp $$
 */
public class StringUtil {
    /**
     * isNotBlank
     * @param string
     * @return
     */
    public static boolean isNotBlank(String string) {
        if (string == null || string.equals("")) {
            return false;
        }

        return true;
    }

    /**
     * to String date
     * @param date
     * @return
     */
    public static String fromDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DateConstants.DEFAULT_DATE_FORMAT);
        return sdf.format(date);
    }
}