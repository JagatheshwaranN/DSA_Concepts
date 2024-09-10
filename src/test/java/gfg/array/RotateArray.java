package gfg.array;

import java.util.Arrays;

/**
 * Rotate the array elements to the left by d positions.
 * <p>
 * Input: arr[] = [1, 2, 3, 4, 5, 6, 7], position = 2
 * Output: [3, 4, 5, 6, 7, 1, 2]
 * <p>
 * Using temporary array
 * Using one by one element rotate
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int position = 2;
        arrayRotateUsingTempArray(numbers, position);
        numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
        position = 3;
        arrayRotateUsingElementRotate(numbers, position);
    }

    /**
     * The time complexity of this program is also O(n), where n is the length of the input
     * array. This is because the program iterates through the array twice, once to copy the
     * elements from position to the end to the temporary array, and once to copy the elements
     * from 0 to position-1 to the temporary array. The final System.arraycopy call also takes
     * O(n) time.
     * <p>
     * The space complexity of this program is O(n) as it creates a temporary array of the same
     * size as the input array to store the rotated elements.
     */
    private static void arrayRotateUsingTempArray(int[] input, int position) {
        int[] tempArray = new int[input.length];
        int k = 0;
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        for (int i = position; i < input.length; i++) {
            tempArray[k++] = input[i];
        }
        for (int i = 0; i < position; i++) {
            tempArray[k++] = input[i];
        }
        System.arraycopy(tempArray, 0, input, 0, tempArray.length);
        System.out.println(Arrays.toString(input));
    }

    /**
     * The time complexity of this program is O(n * d), where n is the length of the input
     * array and d is the number of positions to rotate. This is because the outer loop iterates
     * d times, and the inner loop iterates n-1 times in each iteration.
     * <p>
     * The space complexity is O(1) as the program only uses a constant amount of extra space to
     * store variables like currentPosition and last.
     */
    private static void arrayRotateUsingElementRotate(int[] input, int position) {
        int currentPosition = 1;
        if(input.length == 0){
            System.out.println("Input array is null.");
            return;
        }
        while(currentPosition <= position) {
            int last = input[0];
            for(int i = 0; i < input.length - 1; i++) {
                input[i] = input[i+1];
            }
            input[input.length-1] = last;
            currentPosition++;
        }
        System.out.println(Arrays.toString(input));
    }

}
