package dsa.practices.conditional_loops;

import java.util.Scanner;

public class _15_Vowel_Consonant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input to find the vowels and consonants");
        String input = scanner.next();

        if(input.charAt(0)=='A'||input.charAt(0)=='a' ||
                input.charAt(0)=='E'||input.charAt(0)=='e'||
                input.charAt(0)=='I'||input.charAt(0)=='i' ||
                input.charAt(0)=='O'||input.charAt(0)=='o' ||
                input.charAt(0)=='U'||input.charAt(0)=='u'
        ){
            System.out.println("The input " + "'" + input.charAt(0) + "'" + " is vowel");
        }else{
            System.out.println("The input " + "'" + input.charAt(0) + "'" + " is consonant");
        }
    }
}
