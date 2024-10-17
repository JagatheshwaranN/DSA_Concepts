package gfg.math;

/**
 * Find the fibonacci sum of event indices for the given number.
 * <p>
 * Input: 5
 * Output: 0 1 1 2 3 5 8 13 21 34 55
 *      => 88
 * <p>
 * Using array approach
 * Using wihtout array approach
 */
@SuppressWarnings("All")
public class FibonacciSeries {

    public static void main(String[] args) {
        int value = 5;
        getFibonacciSumAtEvenIndex(value);
        getFibonacciSumAtEvenIndexWithoutArray(value);
    }

    /**
     * Time Complexity: O(n) - The loop runs for '2 * input' iterations, so it is proportional
     * to 'n' (where n = input).
     * Space Complexity: O(n) - The array fibonacci[] stores '2 * input + 1' elements, so space
     * usage is proportional to 'n'.
     */
    private static void getFibonacciSumAtEvenIndex(int input) {
        if (input < 0) {
            System.out.println("Input is invalid.");
            return;
        }

        // Array to store Fibonacci numbers up to the 2 * input index
        int[] fibonacci = new int[2 * input + 1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Output the first two Fibonacci numbers
        System.out.print(fibonacci[0] + " ");
        System.out.print(fibonacci[1] + " ");

        // Variable to store the sum of Fibonacci numbers at even indices
        int sum = 0;

        // Loop runs for '2 * input' iterations
        for (int i = 2; i <= 2 * input; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];  // Calculate next Fibonacci number
            System.out.print(fibonacci[i] + " ");

            // Add to sum if the index is even
            if (i % 2 == 0) {
                sum += fibonacci[i];
            }
        }
        System.out.println();
        System.out.println(sum);  // Output the sum of Fibonacci numbers at even indices
    }

    /**
     * Time Complexity: O(n) - The loop still runs for '2 * input' iterations, so the time
     * complexity remains O(n).
     * Space Complexity: O(1) - We only store a constant amount of variables (sum, a, b, and next),
     * so space complexity is constant.
     */
    private static void getFibonacciSumAtEvenIndexWithoutArray(int input) {
        if (input < 0) {
            System.out.println("Input is invalid.");
            return;
        }

        // Initial Fibonacci numbers
        int a = 0, b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");

        // Variable to store the sum of Fibonacci numbers at even indices
        int sum = a; // Start with 0, which is the Fibonacci number at index 0.

        // Loop runs for '2 * input - 1' times, since we already printed the first two numbers
        for (int i = 2; i <= 2 * input; i++) {
            int next = a + b;  // Calculate the next Fibonacci number
            System.out.print(next + " ");

            // Add to sum if the index is even
            if (i % 2 == 0) {
                sum += next;
            }

            // Update the previous two Fibonacci numbers
            a = b;
            b = next;
        }
        System.out.println();
        System.out.println(sum);  // Output the sum of Fibonacci numbers at even indices
    }

}
