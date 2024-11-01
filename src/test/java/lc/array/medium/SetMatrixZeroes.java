package lc.array.medium;

import java.util.HashSet;

/**
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
 * You must do it in place.
 * <p>
 * Example 1:
 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 * <p>
 * Example 2:
 * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */
@SuppressWarnings("All")
public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] numbers = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(numbers);
        System.out.println();
        int[][] numbers1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes1(numbers1);
    }

    // Execution Time: 2ms
    public static void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        HashSet<Integer> rowsToZero = new HashSet<>();
        HashSet<Integer> columnsToZero = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowsToZero.add(i);
                    columnsToZero.add(j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rowsToZero.contains(i) || columnsToZero.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
        printMatrix(matrix);
    }

    // Execution Time: 1ms
    public static void setZeroes1(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] val : matrix) {
            for (int i : val) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
