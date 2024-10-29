package lc.array;

import java.util.HashSet;

/**
 * Given an integer array nums, return true if any value appears at least twice in the
 * array, and return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Explanation:
 * The element 1 occurs at the indices 0 and 3.
 * <p>
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * Explanation:
 * All elements are distinct.
 * <p>
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1};
        System.out.println(containsDuplicate(numbers));
        System.out.println(containsDuplicate1(numbers));
        System.out.println(containsDuplicate2(numbers));
        System.out.println(containsDuplicate3(numbers));
    }

    // Time Limit Exceeded
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Execution Time: 18ms
    public static boolean containsDuplicate1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        HashSet<Integer> numsSet = new HashSet<>();
        for (int i : nums) {
            numsSet.add(i);
        }
        return nums.length != numsSet.size();
    }

    // Execution Time: 7ms
    public static boolean containsDuplicate2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        HashSet<Integer> numsSet = new HashSet<>();
        for (int i : nums) {
            if (!numsSet.add(i)) {
                return true;
            }
        }
        return false;
    }

    // Execution Time: 6ms
    public static boolean containsDuplicate3(int[] nums) {
        int n = nums.length;
        var numsSet = HashSet.<Integer>newHashSet(n);
        for (int i = 0; i < n; i++) {
            if (!numsSet.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
