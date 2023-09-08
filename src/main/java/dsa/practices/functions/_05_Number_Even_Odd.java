package dsa.practices.functions;

import java.util.Scanner;

public class _05_Number_Even_Odd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number\n");
        int number = scanner.nextInt();
        findEvenOddApproach1(number);
        findEvenOddApproach2(number);

    }

    private static void findEvenOddApproach1(int number) {

        if(number <= 0){
            System.out.println("Not a valid number");
        }
        if(number % 2 == 0){
            System.out.println(number + " is an even number");
        }else{
            System.out.println(number + " is an odd number");
        }
    }

    private static void findEvenOddApproach2(int number) {

        if(number <= 0){
            System.out.println("Not a valid number");
        }
        if((number & 1) == 1){
            System.out.println(number + " is an odd number");
        }else{
            System.out.println(number + " is an even number");
        }
    }
}
