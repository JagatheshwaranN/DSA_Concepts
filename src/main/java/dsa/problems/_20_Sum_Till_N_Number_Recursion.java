package dsa.problems;

import java.util.Scanner;

public class _20_Sum_Till_N_Number_Recursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the sum till the number");
        int number = scanner.nextInt();
        System.out.println("The sum of numbers till the number "+number+" is "+findSum(number));
    }

    private static int findSum(int number) {
        if(number <=1 ){
            return 1;
        }
        return number + findSum(number - 1);
    }
}
