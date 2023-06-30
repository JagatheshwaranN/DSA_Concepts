package dsa.practices.conditional_loops;

import java.util.Scanner;

public class _09_Calculate_Discount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sale price");
        float salePrice = scanner.nextFloat();
        System.out.println("Enter the discount percentage");
        float discountPercentage = scanner.nextFloat();

        System.out.printf("Sale price %.3f",salePrice);
        System.out.println();
        float discount = (salePrice * discountPercentage) / 100;
        System.out.printf("Discount %.3f",discount);
        System.out.println();
        float discountPrice = salePrice - (salePrice * discountPercentage) / 100;
        System.out.printf("Discount price %.3f",discountPrice);
        System.out.println();
        float savings = salePrice - discountPrice;
        System.out.printf("Savings on purchase %.3f",savings);

    }
}
