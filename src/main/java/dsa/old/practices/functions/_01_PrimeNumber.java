package dsa.old.practices.functions;

import java.util.Scanner;

public class _01_PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check whether its prime or not");
        int input = scanner.nextInt();
        findPrimeNumber(input);
    }

    private static void findPrimeNumber(int input) {
        boolean flag = false;
        if(input == 0 || input == 1){
            System.out.println(input +" is not a prime number");
        }
        int checker = 2;
        while(input > checker) {

            if(input % checker == 0){
                System.out.println(input +" is not a prime number");
                flag = true;
                break;
            }
            checker ++;
        }
        if(!flag){
            System.out.println(input +" is a prime number");
        }
    }
}
