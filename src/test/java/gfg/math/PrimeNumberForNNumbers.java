package gfg.math;

/**
 * Find the prime numbers till the given number.
 * <p>
 * Input: 50
 * Output: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
 * <p>
 * Using Input/2 method
 * Using SquareRoot method
 * Using SieveOfEratosthenes algorithm
 */
@SuppressWarnings("All")
public class PrimeNumberForNNumbers {

    public static void main(String[] args) {
        int value = 50;
        printPrimeUsingInputByTwo(value);
        printPrimeUsingSquareRoot(value);
        printPrimeUsingSieveOfEratosthenes(value);
    }

    /**
     * Time Complexity: O(N^2) - For each number up to N, you check divisors up to N/2
     * Space Complexity: O(1) - No extra space apart from primitive variables
     */
    private static void printPrimeUsingInputByTwo(int input) {
        if (input <= 0) {
            System.out.println("Input is invalid.");
            return;
        }
        // Looping through all numbers from 1 to input
        for (int number = 1; number <= input; number++) {
            if (number == 1)
                continue; // 1 is not a prime
            int flag = 1;
            // Check divisors up to number/2
            for (int d = 2; d <= number / 2; d++) {
                if (number % d == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    /**
     * Time Complexity: O(N * sqrt(N)) - For each number up to N, you check divisors up to √N
     * Space Complexity: O(1) - No extra space apart from primitive variables
     */
    private static void printPrimeUsingSquareRoot(int input) {
        if (input <= 0) {
            System.out.println("Input is invalid.");
            return;
        }
        // Looping through all numbers from 1 to input
        for (int number = 1; number <= input; number++) {
            if (number == 1)
                continue; // 1 is not a prime
            int flag = 1;
            // Check divisors up to sqrt(number)
            for (int d = 2; d * d <= number; d++) {
                if (number % d == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    /**
     * Time Complexity: O(N log log N) - Efficient sieve algorithm for finding all primes up to N
     * Space Complexity: O(N) - Boolean array of size N+1 used to mark primes
     */
    private static void printPrimeUsingSieveOfEratosthenes(int input) {
        if (input <= 0) {
            System.out.println("Input is invalid.");
            return;
        }

        // Boolean array to mark prime numbers
        boolean[] isPrime = new boolean[input + 1];
        // Initialize all numbers as prime
        for (int number = 0; number <= input; number++) {
            isPrime[number] = true;
        }

        // Mark non-prime numbers using sieve method
        for (int p = 2; p * p <= input; p++) {
            if (isPrime[p]) {
                // Mark multiples of p as non-prime
                for (int j = p * p; j <= input; j += p) {
                    isPrime[j] = false;
                }
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= input; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
