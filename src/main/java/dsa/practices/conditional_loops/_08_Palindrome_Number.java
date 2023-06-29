package dsa.practices.conditional_loops;

import java.util.Scanner;

public class _08_Palindrome_Number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = scanner.nextInt();
        System.out.println("The number " +input+ " is Palindrome - "+verifyPalindrome(input));

    }

    private static boolean verifyPalindrome(int num){
        int reverse = 0;
        int digit = 0;
        int original = num;
        boolean flag = false;

        while(num > 0){
            digit = num % 10;
            reverse = (reverse * 10) + digit;
            num = num / 10;
        }

        if(original == reverse){
            flag = true;
        }
        return flag;
    }
}
