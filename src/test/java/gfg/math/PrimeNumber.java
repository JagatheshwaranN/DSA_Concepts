package gfg.math;

/**
 * Find whether the given number is prime or not.
 * <p>
 * Input: 5
 * Output: 5 is a prime number
 * Input: 4
 * Output: 4 is not a prime number
 * <p>
 * Using loop execution n times
 * Using loop execution square root times
 */
@SuppressWarnings("All")
public class PrimeNumber {

    public static void main(String[] args) {
        int number = 3;
        checkPrimeForNTimes(number);
        checkPrimeForSquareRootTimes(number);
    }

    /**
     * Time Complexity: O(n) - The loop runs at most n/2 times (where n is the value of input)
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
        // Time Complexity: O(n/2) = O(n) - Loop runs at most n/2 times (where n is the value of input)
        // Space Complexity: O(1) - Only primitive variables (i and input) are used
        for (int i = 2; i <= input / 2; i++) {
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
     * In the code, the value input / 2 is used as an upper limit in the inner for loop to
     * check if a number x is prime. The reason is simple: a non-prime number will always
     * have a factor that is less than or equal to half of the number (except for 1).
     *
     * Here's the explanation:
     * Definition of Prime: A prime number is a number greater than 1 that has no divisors
     * other than 1 and itself. For example, 7 is prime because it's only divisible by 1 and 7,
     * while 6 is not prime because it's divisible by 1, 2, 3, and 6.
     *
     * Why x / 2?: When checking if a number x is divisible by any number, you only need to
     * check up to x / 2. This is because:
     *
     * If x has a divisor larger than x / 2, the corresponding pair (smaller divisor) would
     * have already been checked.
     *
     * For example, if you're checking whether 10 is divisible by any number, after checking
     * 2, 3, 4, and 5 (which are all ≤ 10 / 2), there's no need to check numbers greater than 5.
     *
     * Efficiency: This makes the check faster. If you were to check all the way up to x - 1,
     * it would add unnecessary iterations. So, by limiting the loop to x / 2, you're optimizing
     * the process.
     */

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
