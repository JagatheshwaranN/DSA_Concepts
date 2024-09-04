package gfg.array;

import java.util.Arrays;

/**
 * Print a 2 D Array or Matrix in Java
 * <p>
 * Input: { { 1, 2, 3, 4 },
 * { 5, 6, 7, 8 },
 * { 9, 10, 11, 12 } };
 * <p>
 * Output: 1 2 3 4 5 6 7 8 9 10 11 12
 * Output: [1, 2, 3, 4]
 * [5, 6, 7, 8]
 * [9, 10, 11, 12]
 * Output: [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
 * <p>
 * We have different methods to print the 2D array as below.
 * Using loop
 * Using for loop
 * Using Arrays.toString()
 * Using Arrays.todeepString()
 */
@SuppressWarnings("ALL")
public class Print2DArray {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        print2DArrayUsingLoop(matrix);
        print2DArrayUsingForLoop(matrix);
        print2DArrayUsingToStringMethod(matrix);
        print2DArrayUsingDeepStringMethod(matrix);
    }

    // TC: O(N*M) - N is no of rows and M is no of columns
    // SC: O(1)
    private static void print2DArrayUsingLoop(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + " ");
            }
        }
        System.out.println();
    }

    // TC: O(N*M) - N is no of rows and M is no of columns
    // SC: O(1)
    private static void print2DArrayUsingForLoop(int[][] input) {
        for (int[] arr : input) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // TC: O(N*M) - N is no of rows and M is no of columns
    // SC: O(1)
    private static void print2DArrayUsingToStringMethod(int[][] input) {
        for(int[] arr : input)
            System.out.println(Arrays.toString(arr));
    }

    // TC: O(N*M) - N is no of rows and M is no of columns
    // SC: O(1)
    private static void print2DArrayUsingDeepStringMethod(int[][] input) {
        System.out.println(Arrays.deepToString(input));
    }

}
