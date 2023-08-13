package dsa.problems;

import java.util.Scanner;

public class _19_Factorial_Recursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        int number = scanner.nextInt();
        System.out.println("The factorial of number "+number+" is "+findFact(number));
    }

    private static int findFact(int number) {
        if(number <= 1 ){
            return 1;
        }
        return number * findFact(number - 1);
    }
}
