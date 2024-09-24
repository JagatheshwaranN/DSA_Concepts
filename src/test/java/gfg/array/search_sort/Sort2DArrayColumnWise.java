package gfg.array.search_sort;

import java.util.Arrays;

/**
 * Sort the 2D array.
 * <p>
 * Input: {{5, 8, 1},
 * {3, 7, 4},
 * {6, 2, 9}};
 * <p>
 * Output: {{3, 2, 1},
 * {5, 7, 4},
 * {6, 8, 9}};
 */
@SuppressWarnings("All")
public class Sort2DArrayColumnWise {

    public static void main(String[] args) {
        int[][] numbers = {
                {5, 8, 1},
                {3, 7, 4},
                {6, 2, 9}
        };
        sort2DArrayColumnWise(numbers);
    }

    /**
     * The time complexity of the code is O(n * log n * m), where n is the number of rows and m is the number
     * of columns. This is because sorting each column takes O(n log n) time (using `Arrays.sort()`),
     * and we do this for m columns, resulting in O(m * n log n) time.
     *
     * The space complexity is O(n) for each column, as we use a temporary array to store the column values.
     * The overall space complexity is O(n * m) due to the input 2D array itself.
     */
    private static void sort2DArrayColumnWise(int[][] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        printArray(input);
        int rows = input.length;
        int cols = input[0].length;
        int[] temp = new int[rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                temp[j] = input[j][i];
            }
            Arrays.sort(temp);
            for (int k = 0; k < rows; k++) {
                input[k][i] = temp[k];
            }
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
