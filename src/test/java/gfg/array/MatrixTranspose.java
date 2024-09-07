package gfg.array;

/**
 * Find the transpose of the given matrix
 * <p>
 * Input: { {1, 2},
 *          {3, 4}};
 * Output: { {1, 3}
 *           {2, 4}};
 * Input: { {1, 2, 3},
 *          {4, 5, 6}};
 * Output: { {1, 4},
 *           {2, 5},
 *           {3, 6}};
 */
@SuppressWarnings("All")
public class MatrixTranspose {

    public static void main(String[] args) {
        int[][] numbers1 = { {1, 2},
                             {3, 4}};
        transposeMatrix(numbers1);
        int[][] numbers2 = { {1, 2, 3},
                             {4, 5, 6}};
        transposeRectMatrix(numbers2, 2, 3);

    }

    // TC: O(m * n)
    // SC: O(m * n)
    private static void transposeMatrix(int[][] input) {
        int[][] transMatrix = new int[input.length][input[0].length];
        for(int i = 0; i < input.length; i++) {
            for( int j = 0; j < input[i].length; j++) {
                transMatrix[j][i] = input[i][j];
            }
        }
        printMatrix(transMatrix);
    }

    // TC: O(m * n)
    // SC: O(m * n)
    private static void transposeRectMatrix(int[][] input, int rows, int cols) {
        int[][] transMatrix = new int[cols][rows];
        for(int i = 0; i < cols; i++) {
            for( int j = 0; j < rows; j++) {
                transMatrix[i][j] = input[j][i];
            }
        }
        printMatrix(transMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++ ) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}

