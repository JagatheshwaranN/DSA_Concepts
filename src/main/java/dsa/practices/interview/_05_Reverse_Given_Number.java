package dsa.practices.interview;

import java.util.Scanner;

public class _05_Reverse_Given_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int number = scanner.nextInt();
        findReverse(number);
    }
    private static void findReverse(int number) {
        int num = number;
        int reverse = 0;
        while(number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("The reverse of the number "+num+" is "+reverse);
    }
}
