package gfg.array.advanced;

/**
 * Interchange the first and last column of the matrix.
 * <p>
 * Input: {{1, 2, 3},
 *         {4, 5, 6},
 *         {7, 8, 9}}
 * <p>
 * Output: {{3, 2, 1},
 *          {6, 5, 4},
 *          {9, 8, 7}}
 */

@SuppressWarnings("All")
public class ArrayMatrixColumnInterChange {

    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        changeFirstAndLastColumnInMatrix(numbers);
    }

    /**
     * The time complexity of the code is O(m), where m is the number of rows in the matrix.
     * This is because the loop iterates over each row in the matrix, performing a constant time
     * swap for the first and last columns of each row.
     * <p>
     * The space complexity is O(1), as the algorithm only uses a constant amount of extra space
     * (the temporary variable `temp` for swapping the column elements).
     */
    private static void changeFirstAndLastColumnInMatrix(int[][] input) {
        printMatrix(input);
        if(input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        for(int i = 0; i < input.length; i++) {
            int temp = input[i][0];
            input[i][0] = input[i][input.length - 1];
            input[i][input.length - 1] = temp;
        }
        printMatrix(input);
    }

    private static void printMatrix(int[][] matrix) {
        for(int[] arr : matrix) {
            for(int val : arr) {
                System.out.print(STR."\{val} ");
            }
            System.out.println();
        }
        System.out.println();
    }

}


