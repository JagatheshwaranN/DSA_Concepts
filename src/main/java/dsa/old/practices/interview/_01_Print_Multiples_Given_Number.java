package dsa.old.practices.interview;

import java.util.Scanner;

public class _01_Print_Multiples_Given_Number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start value");
        int start = scanner.nextInt();
        System.out.println("Enter the end value");
        int end = scanner.nextInt();
        System.out.println("Enter the multiple value");
        int multiply = scanner.nextInt();
        System.out.println("The multiples of "+multiply+ " from "+start+" to "+end);
        printMultiplesOfNumber(start, end, multiply);
    }

    private static void printMultiplesOfNumber(int number1, int number2, int multiply) {
        for(int i = number1; i <= number2;  i++){
            if(i % multiply == 0){
                System.out.println(i);
            }
        }
    }
}
