package dsa.old.problems;

import java.util.Scanner;

public class _21_Sum_Digits_Recursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the sum");
        int number = scanner.nextInt();
        System.out.println("The sum of number "+number+" is "+digitSum(number));
    }

    private static int digitSum(int number) {
        if(number == 0)
            return 0;
        return (number % 10) + digitSum(number / 10);
    }
}
