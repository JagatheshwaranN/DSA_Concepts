package dsa.practices.functions;

import java.util.Scanner;

public class _04_PrimeNumbersInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start number to check prime numbers in range");
        int start = scanner.nextInt();
        System.out.println("Enter the end number to check prime numbers in range");
        int end = scanner.nextInt();
        findPrimeNumbersInRange(start, end);
    }

    private static void findPrimeNumbersInRange(int start, int end) {
        boolean flag = false;
        for(int i = start; i <= end; i++){

            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    System.out.println(i + " is not a prime number");
                    flag = true;
                    break;
                }
            }

            if(flag == false){
                System.out.println(i + " is a prime number");
            }
        }
    }
}
