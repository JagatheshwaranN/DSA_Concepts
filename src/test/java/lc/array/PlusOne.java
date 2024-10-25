package lc.array;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i]
 * is the ith digit of the integer. The digits are ordered from most significant to least
 * significant in left-to-right order. The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 * <p>
 * Example 1:
 * <p>
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * Example 2:
 * <p>
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * Example 3:
 * <p>
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(plusOne(numbers)));
    }

    // The below code will fail with when the value exceeds the integer range.
    private static int[] plusOneIssue(int[] digits) {
        if (digits.length == 0) {
            return new int[]{-1};
        }
        StringBuilder number = new StringBuilder();
        for (int digit : digits) {
            number.append(digit);
        }
        int numberFromStr = Integer.parseInt(number.toString());
        numberFromStr = numberFromStr + 1;
        int count = 0;
        int resultNumber = numberFromStr;
        while (resultNumber != 0) {
            resultNumber /= 10;
            count++;
        }
        int[] result = new int[count];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = numberFromStr % 10;
            ;
            numberFromStr /= 10;
        }
        return result;
    }

    // BigInteger is not accepted
    private static int[] plusOneIssue2(int[] digits) {
        if (digits.length == 0) {
            return new int[]{-1};
        }
        StringBuilder number = new StringBuilder();
        for (int digit : digits) {
            number.append(digit);
        }
        BigInteger bigInteger = new BigInteger(number.toString());
        bigInteger = bigInteger.add(BigInteger.ONE);
        String resultNumberStr = bigInteger.toString();
        int[] result = new int[resultNumberStr.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultNumberStr.charAt(i) - '0';
        }
        return result;
    }

    private static int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return new int[]{0, 0};
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

}
