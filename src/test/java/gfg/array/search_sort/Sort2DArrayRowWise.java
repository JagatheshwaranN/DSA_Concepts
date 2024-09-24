package gfg.array.search_sort;

import java.util.Arrays;

/**
 * Sort the 2D array in each row.
 * <p>
 * Input: {{5, 8, 1},
 * {3, 7, 4},
 * {6, 2, 9}};
 * <p>
 * Output: {{1, 5, 8},
 * {3, 4, 7},
 * {2, 6, 9}};
 */
@SuppressWarnings("All")
public class Sort2DArrayRowWise {

    public static void main(String[] args) {
        int[][] numbers = {
                {5, 8, 1},
                {3, 7, 4},
                {6, 2, 9}
        };
        sort2DArrayRowWise(numbers);
    }

    /**
     * The time complexity of the code is O(n * m log m), where n is the number of rows and m is the number
     * of columns in the 2D array. This is because sorting each row individually using `Arrays.sort()`
     * takes O(m log m) time, and we perform this operation for n rows.
     * <p>
     * The space complexity is O(1) for sorting since `Arrays.sort()` operates in-place for each row.
     * The overall space complexity is O(n * m) due to the input 2D array itself.
     */
    private static void sort2DArrayRowWise(int[][] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        printArray(input);
        int rows = input.length;
        int cols = input[0].length;
        for (int[] arr : input) {
            Arrays.sort(arr);
        }
        printArray(input);
    }

    private static void printArray(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int val : arr) {
                System.out.print(STR."\{val} ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
