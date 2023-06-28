package dsa.practices.conditional_loops;

import java.util.Scanner;

public class _02_Factors_Of_Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the factors");
        int num = scanner.nextInt();
        findFactors(num);
    }

    private static void findFactors(int num){

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println("The number "+num+"'s factor is "+i);
            }
        }
    }
}
