package lc.array.easy;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target
 * is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(numbers, target));
    }

    private static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target) {
                start++;
            } else {
                end--;
            }
        }
        return start;
    }

    private static int searchInsert1(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else {
                if (nums[i] > target) {
                    return i;
                }
            }
        }
        return -1;
    }

}
