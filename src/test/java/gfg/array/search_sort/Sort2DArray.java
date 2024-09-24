package gfg.array.search_sort;

import java.util.Arrays;

/**
 * Sort the 2D array.
 * <p>
 * Input: {{5, 8, 1},
 * {3, 7, 4},
 * {6, 2, 9}};
 * <p>
 * Output: {{1, 2, 3},
 * {4, 5, 6},
 * {7, 8, 9}};
 */
@SuppressWarnings("All")
public class Sort2DArray {

    public static void main(String[] args) {
        int[][] numbers = {
                {5, 8, 1},
                {3, 7, 4},
                {6, 2, 9}
        };
        sort2DArray(numbers);
    }

    /**
     * The time complexity of the code is O((n * m) * log(n * m)), where n is the number of rows and m is the
     * number of columns in the 2D array. This is because flattening the 2D array into a 1D array takes O(n * m),
     * and sorting the 1D array with `Arrays.sort()` takes O((n * m) * log(n * m)) using a comparison-based
     * sorting algorithm. Finally, reshaping the sorted 1D array back into a 2D array takes O(n * m).
     * <p>
     * The space complexity is O(n * m). The sorting is done in-place for the 1D array, so sorting itself
     * uses O(1) extra space. However, we allocate an additional 1D array to store the flattened elements,
     * which requires O(n * m) space where n is the number of rows and m is the number of columns.
     */
    private static void sort2DArray(int[][] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        printArray(input);
        int rows = input.length;
        int cols = input[0].length;
        int index = 0;
        int[] flatArray = new int[rows * cols];
        for (int[] arr : input) {
            for (int val : arr) {
                flatArray[index++] = val;
            }
        }
        Arrays.sort(flatArray);
        int position = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] = flatArray[position++];
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
