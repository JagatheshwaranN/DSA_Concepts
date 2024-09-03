package dsa.old.problems;

import java.util.Scanner;

public class _24_Palindrome_Number_Recursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check whether its palindrome or not");
        int number = scanner.nextInt();
        if(number == reverseNumber(number)){
            System.out.println("The number "+number+" is palindrome");
        } else{
            System.out.println("The number "+number+" is not palindrome");
        }
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
