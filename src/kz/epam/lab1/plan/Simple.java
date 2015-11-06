package kz.epam.lab1.plan;

public class Simple extends RatePlan {

    private int bonusSms;

    /**Inheritanced constructor from RatePlan class
     * with new variable which shows an amount of
     * free bonus SMS for customer   */
    public Simple(String planName, String planType, int monthlyFee, int customerAmount, int bonusSms) {
        super(planName, planType, monthlyFee, customerAmount);
        this.bonusSms = bonusSms;
    }

    public Simple() {
    }


    public int getBonusSms() {
        return bonusSms;
    }

    public void setBonusSms(int bonusSms) {
        this.bonusSms = bonusSms;
    }
}
