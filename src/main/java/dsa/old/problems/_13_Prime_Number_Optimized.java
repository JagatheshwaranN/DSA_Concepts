package dsa.old.problems;

import java.util.Scanner;

public class _13_Prime_Number_Optimized {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number up to which to generate the prime numbers");
        int number = scanner.nextInt();
        boolean[] primes = new boolean[number+1];
        findPrimeNumbers(number, primes);
    }
    private static void findPrimeNumbers(int number, boolean[] primes) {
        for(int i = 2; i * i <= number; i++){
            if(!primes[i]){
                for(int j = i * 2; j <= number; j += i){
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= number; i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
