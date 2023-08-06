package dsa.problems;

import java.util.Scanner;

public class _11_Find_No_of_SetBits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find its set-bits");
        int number = scanner.nextInt();
        System.out.println("The number "+number+" in binary form is "+Integer.toBinaryString(number));
        int num = number;
        int count = 0;
        // Approach 1
        // while(number > 0){
        //    number = number & (number-1);
        //    count++;
        // }

        // Approach 2
        while(number > 0){
            number -= (number & -number);
            count++;
        }
        System.out.println("The number "+num+"'s set bits count is "+count);
    }
}
