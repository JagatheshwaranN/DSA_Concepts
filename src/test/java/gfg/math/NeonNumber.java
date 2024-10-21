package gfg.math;

/**
 * Find the given number is neon or not.
 * <p>
 * Input1: 9
 * Output1: 9 is a neon number
 * Input2: 8
 * Output2: 8 is not a neon number
 * <p>
 * Using Iterative Approach
 * Using Recursive Approach
 */
@SuppressWarnings("All")
public class NeonNumber {

    public static void main(String[] args) {
        int number = 9;
        checkNeonUsingLoop(number);
        checkNeonUsingRecursive(number);
        number = 8;
        checkNeonUsingLoop(number);
        checkNeonUsingRecursive(number);
    }

    /**
     * Time Complexity: O(d), where d is the number of digits in the square of the input
     * This is because we are iterating through each digit of the squared number.
     * <p>
     * Space Complexity: O(1) - We are using a constant amount of extra space
     */
    private static void checkNeonUsingLoop(int input) {
        if (input <= 0) {
            System.out.println("Input is invalid.");
            return;
        }
        int square = input * input;
        int digit;
        int sum = 0;
        while (square != 0) {
            digit = square % 10;
            sum += digit;
            square = square / 10;
        }
        if (sum == input) {
            System.out.println(input + " is a neon number");
            return;
        }
        System.out.println(input + " is not a neon number");
    }

    /**
     * Time Complexity: O(d), where d is the number of digits in the square of the input
     * This is because the recursion will be called once for each digit of the squared number.
     * <p>
     * Space Complexity: O(d) - Due to recursive calls, the space complexity is proportional
     * to the depth of the recursion, which is the number of digits in the square.
     */
    private static void checkNeonUsingRecursive(int input) {
        if (input <= 0) {
            System.out.println("Input is invalid.");
            return;
        }
        int square = input * input;
        if (isNeonNumber(square, input)) {
            System.out.println(input + " is a neon number");
            return;
        }
        System.out.println(input + " is not a neon number");
    }

    private static boolean isNeonNumber(int square, int number) {
        if (square == 0) {
            return number == 0;
        } else {
            int digit = square % 10;
            return isNeonNumber(square / 10, number - digit);
        }
    }

}
