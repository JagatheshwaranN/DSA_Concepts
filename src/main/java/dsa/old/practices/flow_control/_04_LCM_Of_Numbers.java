package dsa.old.practices.flow_control;

import java.util.Scanner;

public class _04_LCM_Of_Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2");
        int num2 = scanner.nextInt();
        System.out.println("The LCM of above two numbers is " + findLCM(num1, num2));
    }

    private static int findLCM(int num1, int num2) {
        int gcd = findHCF(num1, num2);
        return (num1 * num2) / gcd;
    }

    private static int findHCF(int num1, int num2) {
        int gcd = 0;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
