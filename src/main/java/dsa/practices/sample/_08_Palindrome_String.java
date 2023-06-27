package dsa.practices.sample;

import java.util.Arrays;
import java.util.Scanner;

public class _08_Palindrome_String {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to check whether it's Palindrome or not");
        String input = scanner.next();
        System.out.println(checkPalindrome(input.toLowerCase()));
        System.out.println(checkPalindrome1(input.toLowerCase()));
    }

    private static boolean checkPalindrome(String value){

        char startLetter = value.charAt(0);
        char endLetter = value.charAt(value.length()-1);
        return startLetter == endLetter;
    }

    private static boolean checkPalindrome1(String value){

        char[] values = value.toCharArray();
        char[] reverse = new char[value.length()];
        for(int i = values.length-1, j = 0; i >=0 && j <= values.length-1; i--,j++){
            reverse[j] = values[i];
        }
        return Arrays.toString(values).equalsIgnoreCase(Arrays.toString(reverse));
    }





}
