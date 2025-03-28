package lc.array.easy;

import java.util.Arrays;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which are
 * not equal to val.
 * <p>
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you
 * need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the elements which are not
 * equal to val. The remaining elements of nums are not important as well as the size of nums.
 * <p>
 * Return k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * Example 2:
 * <p>
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing
 * 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeElement(numbers, val));
    }

    private static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(Arrays.copyOf(nums, count)));
        return count;
    }


}
