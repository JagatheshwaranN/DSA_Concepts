package lc.array.medium;

/**
 * You are given an m x n integer matrix with the following two properties:
 * <p>
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 * <p>
 * You must write a solution in O(log(m * n)) time complexity.
 * <p>
 * Example 1:
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true
 * <p>
 * Example 2:
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false
 */
@SuppressWarnings("All")
public class SearchA2DMatrix {

    public static void main(String[] args) {
        int[][] numbers = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        System.out.println(searchMatrix(numbers, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }
        int start = 0;
        int end = matrix.length * matrix[0].length - 1;
        int div = matrix[0].length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = matrix[mid / div][mid % div];
            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    // Normal Approach
    public static boolean searchMatrix1(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }
        for (int[] intArr : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (intArr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * We use n (the number of columns) as the divisor because it allows us to map a
     * "flattened" or "1D" index in the matrix back to its correct row and column
     * positions in a 2D matrix.
     * <p>
     * Here's a breakdown of why and how it works.
     * <p>
     * Understanding the 2D Matrix as a 1D Array
     * When we have a matrix like:
     * <p>
     * int[][] numbers = {
     *     {1, 3, 5, 7},
     *     {10, 11, 16, 20},
     *     {23, 30, 34, 60}
     * };
     * <p>
     * This can be conceptually "flattened" into a single sequence:
     * [1, 3, 5, 7, 10, 11, 16, 20, 23, 30, 34, 60]
     * <p>
     * If we flatten this 3x4 matrix (3 rows, 4 columns), we have m * n = 3 * 4 = 12 elements,
     * just like a 1D array of length 12.
     * <p>
     * Mapping from 1D Index to 2D Coordinates
     * In a 1D array, an index mid represents a position in a single sequence of elements. But in
     * a 2D matrix, we need to convert this mid-index to the correct row and column coordinates.
     *<p>
     * To do this, we use:
     * mid / n to find the row index.
     * mid % n to find the column index.
     * <p>
     * This works because:
     * Row Calculation (mid / n):
     * Dividing mid by n (number of columns) gives the row because each row contains n elements.
     * So, each increase by n in mid-moves to the next row.
     * <p>
     * Example: With mid = 5 in our example, 5 / 4 = 1, meaning the element is in the second row
     * (index 1).
     * <p>
     * Column Calculation (mid % n):
     * Taking mid % n (the remainder when mid is divided by n) gives the column because this is
     * how far along the current row the element is.
     * <p>
     * Example: With mid = 5, 5 % 4 = 1, meaning the element is in the second column (index 1).
     * <p>
     * Example with Different mid-Values
     * <p>
     * Let's go through a few mid-values in your matrix:
     * <p>
     * For mid = 5:
     * <p>
     * mid / n = 5 / 4 = 1 → Row index 1.
     * mid % n = 5 % 4 = 1 → Column index 1.
     * matrix[1][1] = 11, which corresponds to the 6th element in the flattened sequence.
     * For mid = 8:
     * <p>
     * mid / n = 8 / 4 = 2 → Row index 2.
     * mid % n = 8 % 4 = 0 → Column index 0.
     * matrix[2][0] = 23, which is the 9th element in the flattened sequence.
     * <p>
     * By using n as the divisor, we map each mid in the flattened view back to the matrix’s rows
     * and columns correctly. This technique is key for binary search in a 2D matrix, allowing us
     * to treat the matrix like a sorted array without reshaping it explicitly.
     */
}