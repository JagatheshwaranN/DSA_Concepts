package lc.array;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a sorted unique integer array nums.
 * <p>
 * A range [a,b] is the set of all integers from a to b (inclusive).
 * <p>
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
 * That is, each element of nums is covered by exactly one of the ranges, and there is no integer
 * x such that x is in one of the ranges but not in nums.
 * <p>
 * Each range [a,b] in the list should be output as:
 * <p>
 * "a->b" if a != b
 * "a" if a == b
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [0,1,2,4,5,7]
 * Output: ["0->2","4->5","7"]
 * Explanation: The ranges are:
 * [0,2] --> "0->2"
 * [4,5] --> "4->5"
 * [7,7] --> "7"
 * Example 2:
 * <p>
 * Input: nums = [0,2,3,4,6,8,9]
 * Output: ["0","2->4","6","8->9"]
 * Explanation: The ranges are:
 * [0,0] --> "0"
 * [2,4] --> "2->4"
 * [6,6] --> "6"
 * [8,9] --> "8->9"
 */
@SuppressWarnings("All")
public class SummaryRanges {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(numbers));
    }

    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        int start = nums[0];
        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }
        return result;
    }

    // Execution Time : 0ms
    public List<String> summaryRanges0(int[] nums) {
        int i = 0;
        List<String> rangeList = new ArrayList<>();
        if (nums.length == 0) {
            return rangeList;
        }
        StringBuilder str = new StringBuilder();
        boolean unique = true;
        str.append(nums[0]);
        while (i < nums.length - 1) {
            if (nums[i] != nums[i + 1] - 1) {
                if (!unique) {
                    str.append("->");
                    str.append(nums[i]);

                }

                rangeList.add(str.toString());
                str = new StringBuilder();
                str.append(nums[i + 1]);
                unique = true;
            } else {
                unique = false;
            }
            i++;

        }
        if (!unique) {
            str.append("->");
            str.append(nums[i]);
        }
        rangeList.add(str.toString());
        return rangeList;
    }

    // Execution Time : 1ms
    public List<String> summaryRanges1(int[] nums) {
        if (nums.length == 0) return new ArrayList();

        int left = 0;
        int right = 0;

        List<String> ranges = new ArrayList<>();

        // int previousElement = nums[0];
        for (int i = 0; i < nums.length; i++) {
            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                right++;
                i++;
            }

            if (left == right) {
                ranges.add(String.format("%s", nums[left]));
            } else {
                ranges.add(String.format("%s->%s", nums[left], nums[right]));
            }

            right++;
            left = right;
        }

        return ranges;
    }

    // Execution Time : 2ms
    public List<String> summaryRanges2(int[] nums) {
        List<String> ans = new ArrayList<>();
        for (int i = 0, j, n = nums.length; i < n; i = j + 1) {
            j = i;
            while (j + 1 < n && nums[j + 1] == nums[j] + 1) {
                ++j;
            }
            ans.add(f(nums, i, j));
        }
        return ans;
    }

    private String f(int[] nums, int i, int j) {
        return i == j ? nums[i] + "" : String.format("%d->%d", nums[i], nums[j]);
    }

    // Execution Time : 3ms
    public List<String> summaryRanges3(int[] nums) {
        if (nums.length == 0) {
            return List.of();
        }
        List<String> result = new ArrayList<>();
        int l = 0;
        StringBuilder sb = new StringBuilder();
        for (int r = 1; r <= nums.length; r++) {
            if (r == nums.length || nums[r] - 1 != nums[r - 1]) {
                sb.append(nums[l]);
                if (r - l > 1) {
                    sb.append("->" + nums[r - 1]);
                }
                result.add(sb.toString());
                sb.setLength(0);
                l = r;
            }
        }
        return result;
    }

    // Execution Time : 4ms
    public List<String> summaryRanges4(int[] nums) {

        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }

        int startIndex = 0;
        int endIndex = 0;

        while (endIndex < nums.length - 1) {
            if (nums[endIndex] == nums[endIndex + 1] - 1) {
                endIndex++;
            } else {
                StringBuilder strB = new StringBuilder();
                if (startIndex == endIndex) {
                    strB.append(nums[startIndex]);
                } else {
                    strB.append(nums[startIndex]);
                    strB.append("->");
                    strB.append(nums[endIndex]);
                }
                result.add(strB.toString());
                startIndex = endIndex + 1;
                endIndex++;
            }
        }

        String str;
        if (startIndex == endIndex) {
            str = "" + nums[startIndex];
        } else {
            str = "" + nums[startIndex] + "->" + nums[endIndex];
        }
        result.add(str);


        return result;

    }


}
