package dsa.problems;

import java.util.Scanner;

public class _22_Product_Digits_Recursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the product");
        int number = scanner.nextInt();
        System.out.println("The product of number "+number+" is "+digitProduct(number));
    }

    private static int digitProduct(int number) {
        if(number % 10 == number)
            return number;
        return (number % 10) * digitProduct(number / 10);
    }
}
