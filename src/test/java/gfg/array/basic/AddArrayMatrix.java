package gfg.array.basic;

/**
 * Add the two matrices
 * <p>
 * Input1: { {1, 2},
 *           {3, 4}};
 * Input2: { {1, 1},
 *           {2, 2}};
 * Output: { {2, 3},
 *           {5, 6}};
 */
@SuppressWarnings("ALL")
public class AddArrayMatrix {

    public static void main(String[] args) {
        int[][] numbers1 = { {1, 2},
                             {3, 4}};
        int[][] numbers2 = { {1, 1},
                             {2, 2}};
        addMatrix(numbers1, numbers2);

        int[][] numbers3 = { {1, 2, 3},
                             {4, 5, 6},
                             {7, 8, 9}};
        int[][] numbers4 = { {1, 2, 3},
                             {4, 5, 6},
                             {7, 8, 9}};
        addMatrix(numbers3, numbers4);
    }

    /**
     * The time complexity of the code is O(n * m), where n is the number of rows
     * and m is the number of columns in the matrices. This is because the nested
     * for loops iterate through each element of the input matrices once to perform
     * the addition.
     * <p>
     * The space complexity is also O(n * m) due to the creation of the result
     * matrix, which has the same dimensions as the input matrices.
     */
    private static void addMatrix(int[][] input1, int[][] input2) {
        printMatrix(input1);
        printMatrix(input2);
        int[][] result  = new int[input1.length][input1[0].length];
        if(input1.length != input2.length) {
            System.err.println("Error: Input matrices have different dimensions");
            return;
        }
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                result[i][j] = input1[i][j] + input2[i][j];
            }
        }
        printMatrix(result);
    }

    private static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++ ) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
