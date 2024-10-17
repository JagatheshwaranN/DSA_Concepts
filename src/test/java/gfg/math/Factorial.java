package gfg.math;

/**
 * Find the factorial of the given number.
 * <p>
 * Input: 5
 * Output: 120
 * <p>
 * Using loop
 * Using Ternary Operator
 * Using Recursion
 */
public class Factorial {

    public static void main(String[] args) {
        int value = 5;
        getFactorial(value);  // Iterative approach
        System.out.println(getFactorialUsingTernaryOps(value));  // Ternary operator with recursion
        System.out.println(getFactorialUsingRecursion(value));  // Recursive approach
    }

    /**
     * Time Complexity: O(n) - The loop runs 'input' times, so the time is proportional to 'n'.
     * Space Complexity: O(1) - Only a few variables (factorial, i) are used, so space is constant.
     */
    private static void getFactorial(int input) {
        if (input < 0) {
            System.out.println("Input is invalid.");
            return;
        }
        if (input == 0) {
            System.out.println(1);
            return;
        }
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    /**
     * Time Complexity: O(n) - The recursive calls happen 'input' times.
     * Space Complexity: O(n) - Each recursive call adds a new frame to the call stack,
     * so space grows with 'input'.
     */
    private static int getFactorialUsingTernaryOps(int input) {
        if (input < 0) {
            System.out.println("Input is invalid.");
            return -1;
        }
        return (input == 0 || input == 1) ? 1 : input * getFactorialUsingTernaryOps(input - 1);
    }

    /**
     * Time Complexity: O(n) - The recursive calls happen 'input' times.
     * Space Complexity: O(n) - Each recursive call adds a new frame to the call stack,
     * so space grows with 'input'.
     */
    private static int getFactorialUsingRecursion(int input) {
        if (input < 0) {
            System.out.println("Input is invalid.");
            return -1;
        }
        if (input == 0) {
            return 1;
        }
        return input * getFactorialUsingRecursion(input - 1);
    }

}
