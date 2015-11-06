package kz.epam.lab1.item;


import java.util.ArrayList;
import java.util.List;
import kz.epam.lab1.plan.RatePlan;

/**
 * This class contains methods for setting and returning a RatePlans
 * which mobile operator has.
 *
 */
public class MobileProvider  {

        public String name;
        public List<RatePlan> ratePlans;

        public MobileProvider (String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<RatePlan> getRatePlans() {
            return ratePlans;
        }

        public void setRatePlans(List<RatePlan> ratePlans) {
            this.ratePlans = ratePlans;
        }

        public void addRatePlan(RatePlan ratePlan) {
            if (ratePlan == null) {
                ratePlans = new ArrayList<RatePlan>();
            }

            if (ratePlan != null) {
                ratePlans.add(ratePlan);
            }
        }

}


