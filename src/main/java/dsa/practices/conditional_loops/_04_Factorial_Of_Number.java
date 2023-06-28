package dsa.practices.conditional_loops;

import java.util.Scanner;

public class _04_Factorial_Of_Number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        int input = scanner.nextInt();
        System.out.println("The factorial of "+input+ " is "+findFactorial(input));
    }

    private static int findFactorial(int num){

        int factorial = 1;
        while(num > 0){
            factorial = factorial * num;
            num = num -1;
        }
        return factorial;
    }
}
