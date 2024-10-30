package lc.array;

import java.util.HashMap;

/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices
 * i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 * <p>
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */
public class ContainsDuplicateII {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1};
        int val = 3;
        System.out.println(containsNearbyDuplicate(numbers, val));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int previousIndex = map.get(nums[i]);
                if(Math.abs(i - previousIndex) <= k)
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

}
