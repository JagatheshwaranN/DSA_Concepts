package dsa.problems;

import java.util.Scanner;

public class _05_Odd_Even_Using_Bitwise_And_Operator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check its even or odd");
        int number = scanner.nextInt();
        findOddOrEven(number);
    }

    private static void findOddOrEven(int number) {
         if((number & 1) == 1){
             System.out.println(number +" is a odd number");
         }else{
             System.out.println(number +" is a even number");
         }
    }
}
