package dsa.old.practices.interview;

import java.util.Arrays;
import java.util.Scanner;

public class _08_Reverse_Given_Word {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to be reversed");
        String input = scanner.next();
        reverseWord(input);
    }

    private static void reverseWord(String input) {
        String reverse = "";
        for(int i = input.length()-1; i >= 0; i--){
            reverse += input.charAt(i);
        }
        System.out.println(reverse);
    }
}
