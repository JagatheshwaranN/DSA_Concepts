package dsa.old.practices.functions;

import java.util.Scanner;

public class _03_SumOfNaturalNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the natural to find the sum of it!");
        int number = scanner.nextInt();
        findSumOfNaturalNumber(number);
    }

    private static void findSumOfNaturalNumber(int number) {
        if(number == 0){
            System.out.println(0+ " is not a natural number. It is a whole number.");
        }
        int sum = ((number * number) + number) / 2;
        System.out.println("The sum of natural number "+ number +" is "+ sum);
    }
}
