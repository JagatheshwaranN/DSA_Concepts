package gfg.math;

@SuppressWarnings("All")
public class PrimeNumber {

    public static void main(String[] args) {
        int number = 3;
        checkPrimeForNTimes(number);
    }

    /**
     * Time Complexity: O(n) - Loop runs at most n-2 times (where n is the value of input)
     * Space Complexity: O(1) - Only primitive variables (i and input) are used
     */
    private static void checkPrimeForNTimes(int input) {
        // Time Complexity: O(1) - Constant time check for zero or negative input
        // Space Complexity: O(1) - No additional space is used
        if (input <= 0) {
            System.out.println("Input is zero or negative");
            return;
        }
        // Time Complexity: O(1) - Constant time check for input equal to 1
        // Space Complexity: O(1) - No additional space is used
        if (input == 1) {
            System.out.println(input + " is not a prime number");
            return;
        }
        // Time Complexity: O(n) - Loop runs at most n-2 times (where n is the value of input)
        // Space Complexity: O(1) - Only primitive variables (i and input) are used
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                System.out.println(input + " is not a prime number");
                return;
            }
        }
        System.out.println(input + " is a prime number");
    }

    /**
     * Time Complexity: O(√n) - The loop runs at most √n times
     * Space Complexity: O(1) - Only primitive variables (i and input) are used
     */
    private static void checkPrimeForSquareRootTimes(int input) {
        // Time Complexity: O(1) - Constant time check for zero or negative input
        // Space Complexity: O(1) - No additional space is used
        if (input <= 0) {
            System.out.println("Input is zero or negative");
            return;
        }
        // Time Complexity: O(1) - Constant time check for input equal to 1
        // Space Complexity: O(1) - No additional space is used
        if (input == 1) {
            System.out.println(input + " is not a prime number");
            return;
        }
        // Optimized loop: Checking divisors up to √input
        // Time Complexity: O(√n) - The loop runs at most √n times
        // Space Complexity: O(1) - Only primitive variables (i and input) are used
        for (int i = 2; i * i <= input; i++) {
            if (input % i == 0) {
                System.out.println(input + " is not a prime number");
                return;
            }
        }
        System.out.println(input + " is a prime number");
    }

    /**
     * The Idea Behind the Optimization:
     * =================================
     * When you're checking if a number is prime, the goal is to see if it has any divisors
     * other than 1 and itself. Normally, you might check every number from 2 up to n-1
     * (for a number n). However, we can make this much more efficient.
     *
     * Why Only Check Up to the Square Root?
     * Divisors Come in Pairs:
     *
     * When you divide a number n, the result of the division will always involve two numbers
     * (a pair).
     *
     * For example, if n = 36, it has divisors like:
     * 2 * 18 = 36
     * 3 * 12 = 36
     * 4 * 9 = 36
     * 6 * 6 = 36 (this is where both factors are the same)
     * 9 * 4 = 36
     * 12 * 3 = 36
     * 18 * 2 = 36
     *
     * Notice how as you move past 6 (the square root of 36), the pairs "flip." Once you've
     * checked up to the square root, you've already checked all possible divisors because
     * divisors after the square root are just the reverse of the ones before it.
     */

}
