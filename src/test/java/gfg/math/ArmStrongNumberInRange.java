package gfg.math;

/**
 * Find the Armstrong number between the given range.
 * <p>
 * Input: 100, and 500
 * Output: 153, 370, 371, 407
 */
public class ArmStrongNumberInRange {

    public static void main(String[] args) {
        int value1 = 100;
        int value2 = 500;
        findArmstrongNumber(value1, value2);
        value1 = 1000;
        value2 = 10000;
        findArmstrongNumber(value1, value2);
    }

    /**
     * Time Complexity: O(n * d)
     * Where n is the range between input1 and input2 (input2 - input1),
     * and d is the number of digits in the number (log(input2) for maximum digits).
     * For each number, we calculate the number of digits and then compute the sum of
     * each digit raised to the power of the number of digits.
     * <p>
     * Space Complexity: O(1)
     * We are using a constant amount of extra space to store variables like 'number',
     * 'sum', 'digit', etc.
     */
    private static void findArmstrongNumber(int input1, int input2) {
        if (input1 <= 0 || input2 <= 0) {
            System.out.println("One of the inputs is invalid");
            return;
        }
        for (int i = input1 + 1; i <= input2; i++) {
            int number = i;
            int pow = 0;
            int sum = 0;

            // Find the number of digits in the number
            while (number != 0) {
                number /= 10;
                pow++;
            }

            // Reset number for the next calculation
            int digit = 0;
            number = i;

            // Calculate the Armstrong sum
            while (number != 0) {
                digit = number % 10;
                sum += (int) Math.pow(digit, pow);
                number /= 10;
            }

            // If the sum equals the original number, it's an Armstrong number
            if (sum == i) {
                System.out.println(sum);
            }
        }
    }
}
