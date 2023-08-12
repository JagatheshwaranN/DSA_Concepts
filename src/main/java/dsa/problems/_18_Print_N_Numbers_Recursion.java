package dsa.problems;

import java.util.Scanner;

public class _18_Print_N_Numbers_Recursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to print till that number");
        int number = scanner.nextInt();
        printNumberAsc(number);
        System.out.println("=============");
        printNumberDesc(number);
        System.out.println("=============");
        printNumber(number);
    }

    private static void printNumberDesc(int number) {
        if(number == 0)
            return;
        System.out.println(number);
        printNumberDesc(number - 1);
    }

    private static void printNumberAsc(int number) {
        if(number == 0)
            return;
        printNumberAsc(number-1);
        System.out.println(number);
    }

    private static void printNumber(int number) {
        if(number == 0)
            return;
        System.out.println(number);
        printNumber(number-1);
        System.out.println(number);
    }
}
