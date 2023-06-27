package dsa.practices.sample;

import java.util.Scanner;

public class _07_Fibonacci_Series {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number up to which fibonacci series to generate");
        int number = scanner.nextInt();
        generateFibonacci(number);
    }

    private static void generateFibonacci(int num){

        int x1 = -1;
        int x2 = 1;
        int x3;
        int counter = 0;
        while (counter < num){
            x3 = x1 + x2;
            System.out.println(x3);
            x1 = x2;
            x2 = x3;
            counter++;
        }
    }
}
