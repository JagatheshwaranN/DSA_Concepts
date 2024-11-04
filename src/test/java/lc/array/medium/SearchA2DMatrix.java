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

}
