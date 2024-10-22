package lc.array;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates
 * in-place such that each unique element appears only once. The relative order of the
 * elements should be kept the same. Then return the number of unique elements in nums.
 * <p>
 * Consider the number of unique elements of nums to be k, to get accepted, you need to
 * do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the unique elements
 * in the order they were present in nums initially. The remaining elements of nums are not
 * important as well as the size of nums.
 * <p>
 * Return k.
 */
public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return -1;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[count++] = nums[i];
            }
        }
        nums[count++] = nums[nums.length - 1];
        System.out.println(Arrays.toString(nums));
        return count;
    }

}
