package dsa.old.problems;

import java.util.Scanner;

public class _17_GCD_And_LCM_Of_Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number to find the GCD / LCM");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number to find the GCD / LCM");
        int number2 = scanner.nextInt();
        System.out.println("The GCD of numbers "+number1+" and "+number2+" is "+findGCD(number1, number2));
        System.out.println("The LCM of numbers "+number1+" and "+number2+" is "+findLCM(number1, number2));
    }

    private static int findGCD(int number1, int number2) {

        if(number1 == 0){
            return number2;
        }
        return findGCD(number2 % number1, number1);
    }

    private static int findLCM(int number1, int number2) {
        return number1 * number2 / findGCD(number1, number2);
    }

}
