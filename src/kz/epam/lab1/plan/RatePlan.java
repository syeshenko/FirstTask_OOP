package kz.epam.lab1.plan;

/** Parent class containing the main fields,
 * which is needed to create new subsidiary classes
 */
public class RatePlan  {

    private String planName;
    private String planType;
    private int monthlyFee;
    private int customerAmount;

    /**
     * Constructor with 4 parametrs for
     * creating a rateplan
     *
     * @param planName RatePlan name
     * @param planType RatePlan type
     * @param monthlyFee RatePlan fee
     * @param customerAmount Number of customers
     */
    public RatePlan (String planName, String planType, int monthlyFee, int customerAmount){
        this.planName = planName;
        this.planType = planType;
        this.monthlyFee = monthlyFee;
        this.customerAmount = customerAmount;
    }

    public RatePlan() {
    }

    public RatePlan(String simple, String local, int i, int i1, int i2) {
    }

    public RatePlan(String threeCountries, String national, int i, int i1, String s) {
    }

    /**
     * Return Rateplan name
     *
     * @return name
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * Method for setting rateplan name
     *
     * @param planName
     */
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    /**
     * Return Rateplan type
     *
     * @return type
     */
    public String getPlanType() {
        return planType;
    }

    /**
     * Set rateplan type
     *
     * @param planType
     */
    public void setPlanType(String planType) {
        this.planType = planType;
    }

    /**
     * Return Rateplan month fee
     *
     * @return monthly fee
     */
    public int getMonthlyFee() {
        return monthlyFee;
    }

    /**
     * Set rateplan month fee
     *
     * @param monthlyFee
     */
    public void setMonthlyFee(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    /**
     * Return rateplan's number of customer
     *
     * @return customer amount
     */
    public int getCustomerAmount() {
        return customerAmount;
    }

    /**
     * Set rateplan's number of customer
     *
     * @param customer amount
     */
    public void setCustomerAmount(int customerAmount) {
        this.customerAmount = customerAmount;
    }

    /** Overrided method, which translates into
     * a string type value
     * @return string type data
     */
    @Override
    public String toString() {
        return "RatePlan{" +
                "planName='" + planName + '\'' +
                ", planType='" + planType + '\'' +
                ", monthlyFee=" + monthlyFee +
                ", customerAmount=" + customerAmount +
                '}';
    }
}

