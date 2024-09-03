package dsa.old.practices.conditional_loops;

import java.util.Scanner;

public class _17_FutureInvestmentValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the asset / investment value");
        double investOrAsset = scanner.nextFloat();
        System.out.println("Enter the rate of interest");
        double rateOfInterest = scanner.nextFloat();
        System.out.println("Enter the number of years");
        double numberOfYears = scanner.nextFloat();

        System.out.println("FIV value using SI : "+fivCalcUsingSimpleInterest(investOrAsset, rateOfInterest, numberOfYears));
        System.out.printf("FIV value using CI : %.1f", fivCalcUsingCompoundInterest(investOrAsset, rateOfInterest, numberOfYears));
    }

    private static double fivCalcUsingSimpleInterest(double investOrAsset, double rateOfInterest, double numberOfYears) {
        return investOrAsset * (1 + (rateOfInterest / 100) * numberOfYears);
    }

    private static double fivCalcUsingCompoundInterest(double investOrAsset, double rateOfInterest, double numberOfYears) {
        return investOrAsset * Math.pow((1 + rateOfInterest/100), numberOfYears);
    }
}
