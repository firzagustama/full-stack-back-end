
package com.fullstack.backend.backendparent.util;

import com.fullstack.backend.backendparent.enums.CurrencyEnum;
import com.fullstack.backend.backendparent.util.domain.MoneyView;

/**
 * @author firzagustama
 * @version $Id: MoneyViewUtil.java, v 0.1 2021-07-10 22.40 firzagustama Exp $$
 */
public class MoneyViewUtil {

    /** default currency */
    private static final CurrencyEnum DEFAULT_CURRENCY = CurrencyEnum.IDR;

    /**
     * convertToMoneyView
     * @param amount
     * @return
     */
    public static MoneyView convertToMoneyView(double amount) {
        ParamCheckHelper.isGreaterThanZero(amount, "amount");

        StringBuilder sb = new StringBuilder(String.format("%.0f",amount)).reverse();
        int ctr = 0;
        for (int i = 0; i < sb.length(); i++) {
            ctr++;
            if (ctr == 3 && i < sb.length() - 1) {
                sb.insert(++i, DEFAULT_CURRENCY.getDivider());
                ctr = 0;
            }
        }
        sb.reverse();

        MoneyView moneyView = new MoneyView();
        moneyView.setCurrency(DEFAULT_CURRENCY.getCurrency());
        moneyView.setAmount(sb.toString());
        return moneyView;
    }
}