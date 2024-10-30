package lc.array.easy;

import java.util.Arrays;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative
 * order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 * <p>
 * Input: nums = [0]
 * Output: [0]
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12};
        moveZeroes(numbers);
        moveZeroes1(numbers);
    }

    // Execution Time: 12ms
    private static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    // Execution Time: 16ms
    private static void moveZeroes1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int lastNonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != lastNonZeroIndex) {
                    int temp = nums[lastNonZeroIndex];
                    nums[lastNonZeroIndex] = nums[i];
                    nums[i] = temp;
                }
                lastNonZeroIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
