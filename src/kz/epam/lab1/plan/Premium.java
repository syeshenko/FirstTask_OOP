package kz.epam.lab1.plan;

public class Premium extends RatePlan {

    private int extraInternetTraffic;

    /**Inheritanced constructor from RatePlan class
     * with new variable 'extraInternetTraffic'
     * which shows an amount of free internet traffic for customer   */
    public Premium(String planName, String planType,
                   int monthlyFee, int customerAmount, int extraInternetTraffic) {
        super(planName, planType, monthlyFee, customerAmount);
        this.extraInternetTraffic = extraInternetTraffic;
    }

    public Premium () {
    }

    public int getExtraInternetTraffic() {
        return extraInternetTraffic;
    }

    public void setExtraInternetTraffic(int extraInternetTraffic) {
        this.extraInternetTraffic = extraInternetTraffic;
    }
}
