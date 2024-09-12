package gfg.array.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Find the largest / maximum element in an array.
 *
 * Input: arr[] = {5, 9, 8, 6, 1}
 * Output: 9
 *
 * We have different methods to find the largest element in the array as below.
 *
 * Iteration using loop
 * Java 8 Stream
 * Sorting
 * Using Collections.max()
 */

@SuppressWarnings("ALL")
public class MaxElementInArray {

    public static void main(String[] args) {
        int[] numbers = {5, 9, 8, 6, 1};
        findLargestElementByLoop(numbers);
        findLargestElementByStream(numbers);
        findLargestElementBySort(numbers);
        findLargestElementByCollection(numbers);
    }

    // TC: O(n)
    // SC: O(1)
    private static void findLargestElementByLoop(int[] input) {
        int max = input[0];
        for(int i = 1; i < input.length; i++){
            if(input[i] > max){
                max = input[i];
            }
        }
        System.out.println(max);
    }

    // TC: O(n)
    // SC: O(1)
    private static void findLargestElementByStream(int[] input) {
        int largestElement = Arrays.stream(input).max().getAsInt();
        System.out.println(largestElement);
    }

    // TC: O(nlogn)
    // SC: O(1)
    private static void findLargestElementBySort(int[] input) {
        Arrays.sort(input);
        int max = input[input.length-1];
        System.out.println(max);

    }

    // TC: O(n)
    // SC: O(1)
    private static void findLargestElementByCollection(int[] input) {
        List<Integer> list = Arrays.stream(input).boxed().collect(Collectors.toList());
        int largestElement = Collections.max(list);
        System.out.println(largestElement);
    }

}
