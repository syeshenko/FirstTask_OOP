package kz.epam.lab1.plan;

public class LongCall extends RatePlan {

    private int ExtraMinutesAmount;

    /**Inheritanced constructor from RatePlan class
     * with new variable 'ExtraMinutesAmount'
     * which shows an amount of free extra minutes for customer   */
    public LongCall(String planName, String planType,
                    int monthlyFee, int customerAmount, int ExtraMinutesAmount) {
        super(planName, planType, monthlyFee, customerAmount);
        this.ExtraMinutesAmount = ExtraMinutesAmount;
    }

    public LongCall () {
    }

    public int getExtraMinutesAmount() {
        return ExtraMinutesAmount;
    }

    public void setExtraMinutesAmount(int extraMinutesAmount) {
        ExtraMinutesAmount = extraMinutesAmount;
    }


}
