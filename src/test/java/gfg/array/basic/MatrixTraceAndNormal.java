package gfg.array.basic;

/**
 * Find the Normal and Trace of a Matrix.
 * <p>
 * For a given 2D matrix, the purpose is to find the Trace and Normal of the matrix.
 * <p>
 * Normal of a matrix is defined as the square root of the sum of squares of all the
 * elements of the matrix.
 * <p>
 * Trace of a given square matrix is defined as the sum of all the elements in the diagonal.
 * Input : matrix[][] = {{1, 2, 3},
 *                       {4, 5, 6},
 *                       {7, 8, 9}};
 * Output : Normal = 6
 *          Trace  = 15
 */
@SuppressWarnings("All")
public class MatrixTraceAndNormal {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        int size = 3;
        findTraceAndNormal(matrix, size);
    }

    private static void findTraceAndNormal(int[][] input, int size) {
        int squareRootSum = 0;
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                squareRootSum +=input[i][j];
            }
        }
        System.out.println("Normal = "+(int)Math.sqrt(squareRootSum));

        int diagonalSum = 0;
        for(int i = 0; i < size; i++) {
            diagonalSum += input[i][i];
        }
        System.out.println("Trace = "+diagonalSum);
    }

}
