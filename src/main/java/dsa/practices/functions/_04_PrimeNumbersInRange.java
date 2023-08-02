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
        if(start < 2){
            start = 2;
        }
        for(int i = start; i <= end; i++){
            flag = false;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                //System.out.print(i + " is a prime number");
                System.out.print(i + " ");
            }
        }
    }
}
