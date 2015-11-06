package kz.epam.lab1.item;

import java.util.Comparator;
import kz.epam.lab1.plan.RatePlan;

/** Compare rateplans by monthly fee
 * Implements interface Comparator
 * @author  Stanislav Yechshenko
 * @version 1.0
 */
public class MonthlyFeeSort implements Comparator <RatePlan> {
    @Override
    public int compare(RatePlan obj1, RatePlan obj2) {
        int monthlyFee1 = obj1.getMonthlyFee();
        int monthlyFee2 = obj2.getMonthlyFee();
        if (monthlyFee1 > monthlyFee2) {
            return 1;
        } else {
            if (monthlyFee1 < monthlyFee2) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}


