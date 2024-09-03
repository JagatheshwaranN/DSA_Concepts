package dsa.old.practices.conditional_loops;

import java.util.Scanner;

public class _19_Perfect_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check whether its perfect or not");
        int number = scanner.nextInt();
        int factor = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                factor = factor + i;
            }
        }
        if(number == factor){
            System.out.println("The number "+number+ " is a perfect number");
        }else{
            System.out.println("The number "+number+ " is not a perfect number");
        }
    }
}
