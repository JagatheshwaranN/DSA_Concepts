package dsa.practices.conditional_loops;

import java.util.Scanner;

public class _11_Calculate_Commission {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sale Price");
        float sale = scanner.nextFloat();
        System.out.println("Enter the Commission Percentage");
        float commission = scanner.nextFloat();

        float commissionAmount = (sale * commission) / 100;
        System.out.println("The Commission Amount is "+commissionAmount);
    }
}
