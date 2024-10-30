package lc.array.medium;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * You are given an array of non-overlapping intervals, intervals where intervals[i] = [starti, endi]
 * represent the start and the end of the ith interval and intervals is sorted in ascending order by
 * starti. You are also given an interval newInterval = [start, end] that represents the start and
 * end of another interval.
 * <p>
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by starti
 * and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
 * <p>
 * Return intervals after the insertion.
 * <p>
 * Note that you don't need to modify intervals in-place. You can make a new array and return it.
 * <p>
 * Example 1:
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * Output: [[1,5],[6,9]]
 * <p>
 * Example 2:
 * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * Output: [[1,2],[3,10],[12,16]]
 * Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 */
public class InsertInterval {

    public static void main(String[] args) {
        int[][] numbers = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        // int[][] numbers = {{1,5}};
        int[] val = {4, 8};
        System.out.println(Arrays.deepToString(insert(numbers, val)));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null || intervals.length == 0) {
            return new int[][]{{-1, -1}};
        }
        ArrayList<int[]> result = new ArrayList<>();
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        result.add(newInterval);
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }

}
