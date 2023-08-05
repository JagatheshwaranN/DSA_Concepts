package dsa.problems;

import java.util.Scanner;

public class _07_NumberOfDigits_In_AnyBase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        System.out.println("Enter the base");
        int base = scanner.nextInt();
        int result = (int)(Math.log(number) / Math.log(base)) + 1;
        System.out.println("The number of digits for "+ number+ " in base "+base+" is "+result);
    }
}
