package gfg.array.advanced;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Merge the given two arrays into a single array.
 * <p>
 * Input: numbers1 = [1, 2, 3, 4], numbers2 = [5, 6, 7, 8]
 * Output: [1, 2, 3, 4, 5, 6, 7, 8]
 * <p>
 * Using Iterative loop
 * Using System.ArrayCopy method
 * Using Java Streams
 */
@SuppressWarnings("All")
public class MergeArrays {

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4};
        int[] numbers2 = {5, 6, 7, 8};
        joinArraysUsingLoop(numbers1, numbers2);
        joinArraysUsingSystemArrayCopy(numbers1, numbers2);
        joinArraysUsingStream(numbers1, numbers2);
    }

    /**
     * The time complexity of the code is O(n + m), where n is the length of input1
     * and m is the length of input2. This is because we iterate through each element
     * of both input arrays exactly once to copy them into the result array.
     * <p>
     * The space complexity is also O(n + m) due to the creation of the result array,
     * which has a length equal to the combined lengths of input1 and input2.
     */
    private static void joinArraysUsingLoop(int[] input1, int[] input2) {
        if (input1.length == 0 || input2.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        int arr1Length = input1.length;
        int arr2Length = input2.length;
        int[] result = new int[arr1Length + arr2Length];
        for (int i = 0; i < input1.length; i++) {
            result[i] = input1[i];
        }
        for (int i = 0; i < input2.length; i++) {
            result[arr1Length + i] = input2[i];
        }
        System.out.println(Arrays.toString(result));
    }

    /**
     * The time complexity of the code is O(n + m), where n is the length of input1
     * and m is the length of input2. This is because the System.arraycopy method
     * copies elements in O(k) time, where k is the number of elements being copied.
     * Thus, copying both arrays takes O(n + m) time.
     * <p>
     * The space complexity is O(n + m) due to the creation of the result array,
     * which has a length equal to the combined lengths of input1 and input2.
     */
    private static void joinArraysUsingSystemArrayCopy(int[] input1, int[] input2) {
        if (input1.length == 0 || input2.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        int arr1Length = input1.length;
        int arr2Length = input2.length;
        int[] result = new int[arr1Length + arr2Length];
        System.arraycopy(input1, 0, result, 0, arr1Length);
        System.arraycopy(input2, 0, result, arr1Length, arr2Length);
        System.out.println(Arrays.toString(result));
    }

    /**
     * The time complexity of the code is O(n + m), where n is the length of input1
     * and m is the length of input2. This is because the stream operations iterate
     * through each element of both input arrays exactly once, and the concat method
     * processes both arrays in linear time.
     * <p>
     * The space complexity is O(n + m) due to the creation of the result array,
     * which has a length equal to the combined lengths of input1 and input2,
     * and the temporary overhead of the streams.
     */
    private static void joinArraysUsingStream(int[] input1, int[] input2) {
        if (input1.length == 0 || input2.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        int[] result = IntStream.concat(Arrays.stream(input1), Arrays.stream(input2)).toArray();
        System.out.println(Arrays.toString(result));
    }

}
