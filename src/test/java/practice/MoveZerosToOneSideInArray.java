package practice;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class MoveZerosToOneSideInArray {

    public static void main(String[] args) {
        int[] numbers = {5, 0, 8, 0, 1};
        moveZeroToRight(numbers);
        moveZeroToRightWithoutNewArray(numbers);
        moveZeroToLeft(numbers);
        moveZeroToLeftWithoutNewArray(numbers);
    }

    // With New Array
    private static void moveZeroToRight(int[] input) {
        int[] resultArray = new int[input.length];
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                resultArray[count++] = input[i];
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }

    // Without New Array
    private static void moveZeroToRightWithoutNewArray(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                input[count++] = input[i];
            }
        }
        while (count < input.length) {
            input[count++] = 0;
        }
        System.out.println(Arrays.toString(input));
    }

    // With New Array
    private static void moveZeroToLeft(int[] input) {
        int[] resultArray = new int[input.length];
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] <= 0) {
                resultArray[count++] = input[i];
            }
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                resultArray[count++] = input[i];
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }

    // Without New Array
    private static void moveZeroToLeftWithoutNewArray(int[] input) {
        int count = input.length - 1;
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] > 0) {
                input[count--] = input[i];
            }
        }
        while (count >= 0) {
            input[count--] = 0;
        }
        System.out.println(Arrays.toString(input));
    }

}
