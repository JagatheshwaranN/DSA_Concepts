package gfg.array.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Find the smallest / minimum element in an array.
 *
 * Input: arr[] = {5, 9, 8, 6, 1}
 * Output: 1
 *
 * We have different methods to find the smallest element in the array as below.
 *
 * Iteration using loop
 * Java 8 Stream
 * Sorting
 * Using Collections.max()
 */

@SuppressWarnings("ALL")
public class MinElementInArray {

    public static void main(String[] args) {
        int[] numbers = {5, 9, 8, 6, 1};
        findSmallestElementByLoop(numbers);
        findSmallestElementByStream(numbers);
        findSmallestElementBySort(numbers);
        findSmallestElementByCollection(numbers);
    }

    // TC: O(n)
    // SC: O(1)
    private static void findSmallestElementByLoop(int[] input) {
        int min = input[0];
        for(int i = 1; i < input.length; i++){
            if(input[i] < min){
                min = input[i];
            }
        }
        System.out.println(min);
    }

    // TC: O(n)
    // SC: O(1)
    private static void findSmallestElementByStream(int[] input) {
        int smallestElement = Arrays.stream(input).min().getAsInt();
        System.out.println(smallestElement);
    }

    // TC: O(nlogn)
    // SC: O(1)
    private static void findSmallestElementBySort(int[] input) {
        Arrays.sort(input);
        int min = input[0];
        System.out.println(min);

    }

    // TC: O(n)
    // SC: O(1)
    private static void findSmallestElementByCollection(int[] input) {
        List<Integer> list = Arrays.stream(input).boxed().collect(Collectors.toList());
        int smallestElement = Collections.min(list);
        System.out.println(smallestElement);
    }

}
