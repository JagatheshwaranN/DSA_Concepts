package gfg.array.advanced;

/**
 * Interchange the first and last row of the matrix.
 * <p>
 * Input: {{1, 2, 3},
 *         {4, 5, 6},
 *         {7, 8, 9}}
 * <p>
 * Output: {{7, 8, 9},
 *          {4, 5, 6},
 *          {1, 2, 3}}
 */
@SuppressWarnings("preview")
public class ArrayMatrixRowInterChange {

    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        changeListAndRowInMatrix(numbers);
    }

    /**
     * The time complexity of the code is O(n), where n is the number of columns in the matrix.
     * This is because the loop iterates over the columns of the first and last rows of the matrix,
     * performing a constant time swap for each column.
     * <p>
     * The space complexity is O(1), as the algorithm only uses a constant amount of extra space
     * (the temporary variable `temp` for swapping the row elements).
     */
    private static void changeListAndRowInMatrix(int[][] input) {
        printMatrix(input);
        if(input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        int rows = input.length;
        for( int i = 0; i < input[0].length; i++) {
            int temp = input[0][i];
            input[0][i] = input[rows - 1][i];
            input[rows - 1][i] = temp;
        }
        printMatrix(input);
    }

    private static void printMatrix(int[][] matrix) {
        for(int[] arr : matrix) {
            for (int i : arr) {
                System.out.print(STR."\{i} ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
