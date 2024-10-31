package lc.array.medium;

import java.util.Arrays;

/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending
 * position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * <p>
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * <p>
 * Example 3:
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 */
public class FindFirstAndLastPosOfElement {

    public static void main(String[] args) {
        int[] numbers = {5, 7, 7, 8, 8, 10};
        int val = 8;
        System.out.println(Arrays.toString(searchRange(numbers, val)));
        System.out.println(Arrays.toString(searchRange1(numbers, val)));
    }

    // Normal Approach
    public static int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int[] result = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (result[0] == -1) {
                    result[0] = i;
                }
                result[1] = i;
            }
        }
        return result;
    }

    // Recommended - Binary Search Approach
    public static int[] searchRange1(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int[] result = {-1, -1};
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                int first = mid, last = mid;
                while (first > 0 && nums[first - 1] == target) {
                    first--;
                }
                while (last < nums.length - 1 && nums[last + 1] == target) {
                    last++;
                }
                result[0] = first;
                result[1] = last;
                return result;
            }
        }
        return result;
    }

}
