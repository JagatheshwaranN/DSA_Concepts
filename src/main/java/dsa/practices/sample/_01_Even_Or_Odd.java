package dsa.practices.sample;

import java.util.Scanner;

public class _01_Even_Or_Odd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check whether it's Even or Odd");
        int num = scanner.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }
    }
}
