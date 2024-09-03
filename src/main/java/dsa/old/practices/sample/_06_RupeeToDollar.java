package dsa.old.practices.sample;

import java.util.Scanner;

public class _06_RupeeToDollar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in rupee");
        int rupee = scanner.nextInt();
        double dollar = rupee / 82.00;
        System.out.println("The amount in dollar equivalent to rupee is "+String.format("%.2f", dollar));
    }
}
