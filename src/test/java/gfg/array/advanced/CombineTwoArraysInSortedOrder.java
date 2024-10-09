package gfg.array.advanced;

import java.util.Arrays;

/**
 * Sort the given arrays and combine them to form a single array.
 * <p>
 * Input1: [4, 3, 1, 2]
 * Input2: [8, 7, 6, 5]
 * Output: [1, 2, 3, 4, 5, 6, 7, 8]
 * <p>
 * Using iterative method
 * Using builtin methods
 */
@SuppressWarnings("All")
public class CombineTwoArraysInSortedOrder {

    public static void main(String[] args) {
        int[] numbers1 = {4, 3, 1, 2};
        int[] numbers2 = {8, 7, 6, 5};
        combineArraysInSortedOrderUsingLoop(numbers1, numbers2);
        combineArraysInSortedOrderUsingBuiltIn(numbers1, numbers2);
    }

    /**
     * Time Complexity: O(n^2 + m^2) due to the manual sorting (sortArray is O(n^2) for both arrays).
     * Space Complexity: O(n + m) for the combined array.
     */
    private static void combineArraysInSortedOrderUsingLoop(int[] input1, int[] input2) {

        if (input1.length == 0 || input2.length == 0) {
            System.out.println("One of the inputs is null.");
            return;
        }
        // Sort input1 - O(n^2) due to nested loops in sortArray
        sortArray(input1);
        // Sort input2 - O(m^2)
        sortArray(input2);

        // Combined array creation - O(n + m) space
        int[] combinedArray = new int[input1.length + input2.length];

        // Copy elements from input1 - O(n) time
        for (int i = 0; i < input1.length; i++) {
            combinedArray[i] = input1[i];
        }

        // Copy elements from input2 - O(m) time
        for (int i = 0; i < input2.length; i++) {
            combinedArray[i + input1.length] = input2[i];
        }

        // Print array - O(n + m) time
        System.out.println(Arrays.toString(combinedArray));
    }

    /**
     * Time Complexity: O(n log n + m log m) because Arrays.sort() has a time complexity of O(n log n).
     * Space Complexity: O(n + m) for the combined array.
     */
    private static void combineArraysInSortedOrderUsingBuiltIn(int[] input1, int[] input2) {

        if (input1.length == 0 || input2.length == 0) {
            System.out.println("One of the inputs is null.");
            return;
        }

        // Sort input1 - O(n log n) using Arrays.sort
        Arrays.sort(input1);

        // Sort input2 - O(m log m) using Arrays.sort
        Arrays.sort(input2);

        // Combined array creation - O(n + m) space
        int[] combinedArray = new int[input1.length + input2.length];

        // System.arraycopy is O(n) + O(m) for copying both arrays
        System.arraycopy(input1, 0, combinedArray, 0, input1.length);  // O(n)
        System.arraycopy(input2, 0, combinedArray, input1.length, input2.length);  // O(m)

        // Print array - O(n + m)
        System.out.println(Arrays.toString(combinedArray));
    }

    // Bubble sort algorithm - O(n^2) time complexity, O(1) space complexity
    // In the worst case, every element compares with every other element.
    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    // Swap elements - O(1)
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
