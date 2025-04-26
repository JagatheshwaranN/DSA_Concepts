package practice;

import java.util.Scanner;

public class PrintNumberByTakingInputFromUserWithCondition {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = scanner.nextInt();
        printNumbersUsingWhile(input);
        printNumbersUsingDoWhile(input);
        printNumbersUsingFor(input);
    }


    static void printNumbersUsingWhile(int number) {
        if (number <= 0) {
            throw new RuntimeException("Invalid Input");
        }
        int val = 0;
        while (val < number) {
            if (val == 100) {
                break;
            }
            val++;
            if (val % 10 == 0) {
                continue;
            }
            System.out.println(val);
        }
    }

    static void printNumbersUsingDoWhile(int number) {
        if (number <= 0) {
            throw new RuntimeException("Invalid Input");
        }
        int val = 0;
        do {
            if (val == 100) {
                break;
            }
            val++;
            if (val % 10 == 0) {
                continue;
            }
            System.out.println(val);
        } while (val < number);
    }

    static void printNumbersUsingFor(int number) {
        if (number <= 0) {
            throw new RuntimeException("Invalid Input");
        }
        for (int val = 0; val < number; val++) {
            if (val == 100) {
                break;
            }
            if (val % 10 == 0) {
                continue;
            }
            System.out.println(val);
        }
    }

}


