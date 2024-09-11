package gfg.array;

/**
 * Find the sum of the  diagonals of the matrix array.
 * <p>
 * Input: {
 *                 {1, 2, 3, 4},
 *                 {5, 6, 7, 8},
 *                 {9, 0, 2, 4},
 *                 {6, 8, 1, 3} };
 * Output: Principal Diagonal: 12
 *         Secondary Diagonal: 17
 * <p>
 * The principal diagonal is constituted by the elements a00, a11, a22, a33, and
 * the row-column condition for the principal diagonal is: row = column
 * <p>
 * However, the secondary diagonal is constituted by the elements a03, a12, a21,
 * a30, and the row-column condition for the Secondary diagonal is: row + column = N – 1
 */
@SuppressWarnings("All")
public class ArrayMatrixDiagonal {

    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 2, 4},
                {6, 8, 1, 3} };
        findMatrixArrayDiagonal(numbers);
        findMatrixDiagonalAdvanced(numbers);
    }

    /**
     * The time complexity of the code is O(n^2). This is because the code iterates over
     * each element of the input matrix using two nested loops, where n is the number of
     * rows or columns in the matrix.
     * <p>
     * The space complexity of the code is O(1). This is because the code only uses a
     * constant amount of additional space to store the variables principalDiagonal and
     * secondaryDiagonal, regardless of the size of the input matrix.
     */
    private static void findMatrixArrayDiagonal(int[][] input) {
        int principalDiagonal = 0;
        int secondaryDiagonal = 0;
        if(input.length == 0){
            System.out.println("Input array is null.");
            return;
        }
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input.length; j++) {
                if(i == j) {
                    principalDiagonal += input[i][j];
                }
                if((i+j) == input.length - 1) {
                    secondaryDiagonal += input[i][j];
                }
            }
        }
        System.out.println("Principal Diagonal: "+principalDiagonal);
        System.out.println("Secondary Diagonal: "+secondaryDiagonal);
    }

    /**
     * The time complexity of the code is still O(n), as it only iterates through the
     * elements on the principal and secondary diagonals, which are both of length n.
     * <p>
     * The space complexity of the improved code is also O(1), as it only uses a constant
     * amount of additional space to store the variables principalDiagonal and secondaryDiagonal.
     */
    private static void findMatrixDiagonalAdvanced(int[][] input) {
        int principalDiagonal = 0;
        int secondaryDiagonal = 0;
        if(input.length == 0){
            System.out.println("Input array is null.");
            return;
        }
        for(int i = 0; i < input.length; i++) {
            principalDiagonal += input[i][i];
            secondaryDiagonal += input[i][input.length - (i+ 1)];
        }
        System.out.println("Principal Diagonal: "+principalDiagonal);
        System.out.println("Secondary Diagonal: "+secondaryDiagonal);
    }

}

