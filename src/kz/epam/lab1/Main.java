package kz.epam.lab1;


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import kz.epam.lab1.item.MonthlyFeeSort;
import kz.epam.lab1.plan.*;
import kz.epam.lab1.item.MobileProvider;



public class Main {
    public static void main(String[] args) {

        MobileProvider mobileProvider = new MobileProvider("Kcell");
        System.out.println(mobileProvider);

        /** Creating a collection of rateplans for mobile company
         */
        public List<RatePlan> rateplan= new ArrayList<>();
        RatePlan simple = new RatePlan("Simple", "Local", 2000, 19000, 200);
        RatePlan premium = new RatePlan("Premium", "National", 15000, 7000, 15);
        RatePlan longCall = new RatePlan("LongCall", "National", 8000, 5000, 1000);
        RatePlan threeCountries = new RatePlan("ThreeCountries", "National", 10000, 11000, "Russia,Turkey,China");

        mobileProvider.addRatePlan(simple);
        mobileProvider.addRatePlan(premium);
        mobileProvider.addRatePlan(longCall);
        mobileProvider.addRatePlan(threeCountries);

        /** Showing the list of rate plans with parametrs*/
        System.out.println("Список тарифов:");
        for (RatePlan i : mobileProvider) {
            System.out.println("Name: " + i.getPlanName() +
                    "planType: " + i.getPlanType() +
                    "monthlyFee: " + i.getMonthlyFee() +
                    "customerAmount: " + i.getCustomerAmount());
        }

        System.out.println("------------------------------------------------------------------");

        /** Showing the list of sorted rateplans by monthly fee*/
        System.out.println("Сортировка тарифных планов по абонентской оплате: ");
        Collections.sort((List<RatePlan>) RatePlan, new MonthlyFeeSort());
        for (RatePlan i : mobileProvider) {
            System.out.println("Name: " + i.getPlanName() +
                    "planType: " + i.getPlanType() +
                    "monthlyFee: " + i.getMonthlyFee() +
                    "customerAmount: " + i.getCustomerAmount());
        }

        System.out.println("------------------------------------------------------------------");

        /** Showing the list of sorted rateplans by customer's number*/
        System.out.println("Поиск тарифных планов по количеству клиентов: ");
        for (RatePlan i : mobileProvider) {
            if (i.getCustomerAmount() >= 8000 && i.getCustomerAmount() <= 20000)
                System.out.println(i.getPlanName() + "");

        }