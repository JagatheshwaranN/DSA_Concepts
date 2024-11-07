package lc.array.medium;

import java.util.Arrays;

/**
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * <p>
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 * <p>
 * Example 1:
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 * <p>
 * Example 2:
 * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 */
public class RotateImage {

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(numbers);
        int[][] numbers1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateUsingNewArray(numbers1);
    }

    public static void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int matrixLength = matrix.length;
        for (int i = 0; i < matrixLength; i++) {
            for (int j = i; j < matrixLength; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrixLength - 1 - j];
                matrix[i][matrixLength - 1 - j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }


    public static void rotateUsingNewArray(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] rotatedMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(rotatedMatrix));

    }
}
