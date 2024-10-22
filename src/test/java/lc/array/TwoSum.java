package lc.array;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two
 * numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not
 * use the same element twice.
 * <p>
 * You can return the answer in any order.
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
