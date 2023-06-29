package dsa.practices.conditional_loops;

import java.util.Scanner;

public class _05_ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to be reversed");
        String input = scanner.next();
        System.out.println(reverseString(input));
    }

    private static String reverseString(String value){
        String reverse = "";
        char[] value_array = value.toCharArray();
        for(int i = value_array.length-1; i >= 0; i--){
            reverse = reverse + value_array[i];
        }
        return reverse;
    }
}
