package dsa.practices.interview;

import java.util.Scanner;

public class _10_Palindrome_String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to find whether its Palindrome or not");
        String input = scanner.next();
        findPalindrome(input);
    }
    private static void findPalindrome(String input) {
        input = input.toLowerCase();
        String reverse = "";
        for(int i = input.length() - 1; i >= 0; i--){
            reverse += input.charAt(i);
        }
        System.out.println(input);
        System.out.println(reverse);
        if(input.equals(reverse)){
            System.out.println("The word "+input+" is palindrome");
        }else{
            System.out.println("The word "+input+" is not palindrome");
        }
    }
}
