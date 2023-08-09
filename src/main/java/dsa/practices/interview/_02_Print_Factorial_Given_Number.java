package dsa.practices.interview;

import java.math.BigInteger;
import java.util.Scanner;

public class _02_Print_Factorial_Given_Number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        long number = scanner.nextLong();
        if(number <= 59){
            findFactorial(number);
        }else{
            findBigFactorial(number);
        }
    }

    /**
     * This method will work fine till number value 65. If the number is greater than 59.
     * It will not work as the long data type's capacity is not enough to hold the result.
     */
    private static void findFactorial(long number) {
        long num = number;
        long fact = 1;
        while(number > 0){
            fact = fact * number;
            number --;
        }
        System.out.println("The factorial of number "+ num+" is "+fact);
    }

    private static void findBigFactorial(long number) {
        BigInteger fact = BigInteger.ONE;
        long num = number;
        while(number > 0){
            fact = fact.multiply(new BigInteger(String.valueOf(number)));
            number--;
        }
        System.out.println("The factorial of number "+ num+" is "+fact);
    }
}
