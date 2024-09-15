package gfg.array.advanced;

/**
 * Print the boundary elements of the matrix.
 * <p>
 * Input: {
 *         {1, 2, 3},
 *         {4, 5, 6},
 *         {7, 8, 9}};
 * Output: {
 *          {1, 2, 3},
 *          {4     6},
 *          {7, 8, 9}};
 */
@SuppressWarnings("All")
public class PrintMatrixBorder {

    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        printBorder(numbers);
        numbers = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 1, 2, 3}};
        printBorder(numbers);
    }

    /**
     * The time complexity of the code is O(n^2). This is because the code iterates over
     * each element of the input matrix using two nested loops, where n is the number of
     * rows or columns in the matrix.
     * <p>
     * The space complexity of the provided code is O(1). This is because the code only
     * uses a constant amount of additional space to store the variables i, j, and the
     * input array itself, regardless of the size of the input matrix. The space required
     * to store these variables does not depend on the size of the input.
     */
    private static void printBorder(int[][] input) {
        if(input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        for(int i =  0; i < input.length; i++) {
            for( int j = 0; j < input[i].length; j++) {
                if(i == 0 || j == 0 || i ==  input.length - 1 || j == input[i].length - 1) {
                    System.out.print(input[i][j] +" ");
                } else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }

}
