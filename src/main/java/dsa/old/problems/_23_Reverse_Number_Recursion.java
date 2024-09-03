package dsa.old.problems;

import java.util.Scanner;

public class _23_Reverse_Number_Recursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int number = scanner.nextInt();
        System.out.println("The reverse of the number "+number+" is "+reverseNumber(number));
    }
    private static int reverseNumber(int number) {

        int digits = (int)(Math.log10(number)) + 1;
        return reverseNum(number, digits);
    }
    private static int reverseNum(int number, int digits) {

        if(number % 10 == number)
            return number;

        int remainder = number % 10;
        return remainder * (int)(Math.pow(10, digits - 1)) + reverseNum(number / 10, digits - 1);
    }
}
