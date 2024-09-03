package dsa.old.practices.sample;

import java.util.Scanner;

public class _05_LargestOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1 = scanner.nextInt();
        System.out.println("Enter Number2");;
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println("Largest number is "+ num1);
        }else{
            System.out.println("Largest number is "+ num2);
        }
    }
}
