package dsa.old.practices.sample;

import java.util.Scanner;

public class _09_ArmstrongNumber {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1 = scanner.nextInt();
        System.out.println("Enter Number2");
        int num2 = scanner.nextInt();
        getArmstrongNumber(num1, num2);
    }

    private static void getArmstrongNumber(int num1, int num2) {
        for(int i = num1; i <= num2; i++) {
            findArmstrong(i);
        }
    }

    private static void findArmstrong(int num){
        int sum = 0;
        int remainder;
        int original = num;

        int power = digitsOfNumber(num);
        while (num > 0) {
            remainder = num % 10;
            sum = sum + ((int) Math.pow(remainder, power));
            num = num / 10;
        }
        if(original == sum){
            System.out.println(original + " is Armstrong Number");
        }
    }

    private static int digitsOfNumber(int num){
        String number = Integer.toString(num);
        return number.length();
    }
}
