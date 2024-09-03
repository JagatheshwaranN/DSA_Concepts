package dsa.old.problems;

import java.util.Scanner;

public class _13_Prime_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start number");
        int start = scanner.nextInt();
        System.out.println("Enter the end number");
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            boolean flag = findPrimeNumber(i);
            if(flag){
                System.out.println(i+" Prime Number");
            }else{
                System.out.println(i+" Not Prime Number");
            }
        }
    }
    private static boolean findPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        int check = 2;
        while (check * check <= number) {
            if (number % check == 0) {
                return false;
            }
            check++;
        }
        return true;
    }
}

