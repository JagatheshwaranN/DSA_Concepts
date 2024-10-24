package lc.array;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] numbers = {99};
        System.out.println(Arrays.toString(plusOne(numbers)));
    }

    private static int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return new int[]{-1};
        }
        StringBuilder number = new StringBuilder();
        for (int digit : digits) {
            number.append(digit);
        }
        int numberFromStr = Integer.parseInt(number.toString());
        numberFromStr = numberFromStr + 1;
        System.out.println(numberFromStr);
        int rem;
        for (int i = digits.length - 1; i >= 0; i--) {
            rem = numberFromStr % 10;
            digits[i] = rem;
            numberFromStr /= 10;
        }
        return digits;
    }
}
