package dsa.practices.flow_control;

import java.util.Scanner;

public class _03_HCF_Of_Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2");
        int num2 = scanner.nextInt();
        System.out.println("The HCF of above two numbers is " + findHCFType1(num1, num2));
        System.out.println("The HCF of above two numbers is " + findHCFType2(num1, num2));
    }

    private static int findHCFType1(int num1, int num2) {

        int divisor = 0;
        int dividend = 0;

        if (num1 > num2) {
            dividend = num1;
            divisor = num2;
        } else {
            dividend = num2;
            divisor = num1;
        }

        while (dividend > divisor) {
            int remainder = dividend % divisor;
            if (remainder == 0) {
                return divisor;
            } else {
                dividend = divisor;
                divisor = remainder;
            }
        }

        return -1;
    }

    private static int findHCFType2(int num1, int num2) {
        int gcd = 0;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
