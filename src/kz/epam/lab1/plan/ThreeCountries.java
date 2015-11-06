package kz.epam.lab1.plan;

public class ThreeCountries extends RatePlan {

    private String bonusCountriesCall;

    /**Inheritanced constructor from RatePlan class
     * with new variable 'bonusCountriesCall'
     * which shows what countries customer can call unlimited  */
    public ThreeCountries(String planName, String planType, int monthlyFee,
                          int customerAmount, String bonusCountriesCall) {
        super(planName, planType, monthlyFee, customerAmount);
        this.bonusCountriesCall = bonusCountriesCall;
    }

    public ThreeCountries(){
    }

    public String getBonusCountriesCall() {
        return bonusCountriesCall;
    }

    public void setBonusCountriesCall(String bonusCountriesCall) {
        this.bonusCountriesCall = bonusCountriesCall;
    }
}
