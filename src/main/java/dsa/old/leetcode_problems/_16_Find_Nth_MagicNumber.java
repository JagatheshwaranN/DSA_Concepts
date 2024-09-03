package dsa.old.leetcode_problems;

import java.util.Scanner;

/**
 * @Amazon
 */
public class _16_Find_Nth_MagicNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the magic value");
        int number = scanner.nextInt();
        int input = number;
        int result = 0;
        int base = 5;
        while(number > 0){
            int lastDigit = number & 1;
            number = number >> 1;
            result += lastDigit * base;
            base = base * 5;
        }
        System.out.println("The "+input+"th magic number is "+result);
    }
}
