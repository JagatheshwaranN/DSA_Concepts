package gfg.math;

/**
 * Swap the given two numbers.
 * <p>
 * Input1: number1 = 10, number2 = 5
 * Output: number1 = 5, number2 = 10
 * <p>
 * Using third variable
 * Using wihout third variable
 * Using expression formula
 * Using XOR operator
 */
@SuppressWarnings("All")
public class SwapNumbers {

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;
        swapUsingThirdVar(number1, number2);
        swapWithoutUsingThirdVar(number1, number2);
        swapUsingExpression(number1, number2);
        swapUsingXOR(number1, number2);
    }

    /**
     * Time Complexity: O(1) - The number of operations does not depend on the input size.
     * Space Complexity: O(1) - A constant amount of extra space (one variable `temp`) is used.
     */
    private static void swapUsingThirdVar(int input1, int input2) {
        if (input1 <= 0 || input2 <= 0) {
            System.out.println("One of the inputs is invalid");
            return;
        }
        System.out.println("Input1 before swap: " + input1);
        System.out.println("Input2 before swap: " + input2);
        int temp = input1;
        input1 = input2;
        input2 = temp;
        System.out.println("Input1 after swap: " + input1);
        System.out.println("Input2 after swap: " + input2);
    }

    /**
     * Time Complexity: O(1) - The number of operations is constant and does not depend on input size.
     * Space Complexity: O(1) - No additional space is used apart from input variables.
     */
    private static void swapWithoutUsingThirdVar(int input1, int input2) {
        if (input1 <= 0 || input2 <= 0) {
            System.out.println("One of the inputs is invalid");
            return;
        }
        System.out.println("Input1 before swap: " + input1);
        System.out.println("Input2 before swap: " + input2);
        // a = a + b; b = a - b; a = a - b;
        input1 = input1 + input2;
        input2 = input1 - input2;
        input1 = input1 - input2;
        System.out.println("Input1 after swap: " + input1);
        System.out.println("Input2 after swap: " + input2);
    }

    /**
     * Time Complexity: O(1) - The number of operations is constant.
     * Space Complexity: O(1) - No additional space is required.
     */
    private static void swapUsingExpression(int input1, int input2) {
        if (input1 <= 0 || input2 <= 0) {
            System.out.println("One of the inputs is invalid");
            return;
        }
        System.out.println("Input1 before swap: " + input1);
        System.out.println("Input2 before swap: " + input2);
        // a = (a + b) - (b = a);
        input1 = (input1 + input2) - (input2 = input1);
        System.out.println("Input1 after swap: " + input1);
        System.out.println("Input2 after swap: " + input2);
    }

    /**
     * Time Complexity: O(1) - XOR swap has a constant number of operations.
     * Space Complexity: O(1) - Only the input variables are used; no extra space is required.
     */
    private static void swapUsingXOR(int input1, int input2) {
        if (input1 <= 0 || input2 <= 0) {
            System.out.println("One of the inputs is invalid");
            return;
        }
        System.out.println("Input1 before swap: " + input1);
        System.out.println("Input2 before swap: " + input2);
        input1 = input1 ^ input2;
        input2 = input1 ^ input2;
        input1 = input1 ^ input2;
        System.out.println("Input1 after swap: " + input1);
        System.out.println("Input2 after swap: " + input2);
    }

}
