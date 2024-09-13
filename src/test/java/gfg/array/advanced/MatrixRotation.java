package gfg.array.advanced;

/**
 * Rotate the given matrix in clockwise direction.
 * <p>
 * Input: {
 *         {7, 8, 9},
 *         {10, 11, 12},
 *         {2, 3, 4}};
 * Output: {
 *          {2, 10, 7},
 *          {3, 11, 8},
 *          {4, 12, 9}};
 */
@SuppressWarnings("All")
public class MatrixRotation {

    public static void main(String[] args) {
        int[][] numbers = {
                {7, 8, 9},
                {10, 11, 12},
                {2, 3, 4}};
        System.out.println("Original Matrix");
        printMatrix(numbers);
        System.out.println("Rotated Matrix");
        rotateMatrix(numbers);
    }

    /**
     * The time complexity of the code is O(n^2), where n is the number of rows or
     * columns in the matrix. This is because the nested for loops iterate through
     * each element of the input matrix once.
     * <p>
     * The space complexity is also O(n^2) due to the creation of the rotatedMatrix
     * array, which has the same dimensions as the input matrix.
     */
    private static void rotateMatrix(int[][] input) {
        int rows = input.length;
        int[][] rotatedMatrix = new int[input.length][input[0].length];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < input[i].length; j++) {
                rotatedMatrix[j][rows - 1 - i] = input[i][j];
            }
        }
        printMatrix(rotatedMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        for(int[] arr : matrix) {
            for(int val : arr) {
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

}