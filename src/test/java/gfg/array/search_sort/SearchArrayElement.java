package gfg.array.search_sort;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Search the element in the given array.
 *
 * Input: [1, 2, 4, 7, 9], 7 | 71
 * Output: 7 is present. | 71 is not present.
 *
 * Using Linear iterative approach
 * Using Binary search approach
 * Using List Contains approach
 * Using Java Streams approach
 */
@SuppressWarnings("All")
public class SearchArrayElement {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 7, 9};
        int key = 7;
        searchElementUsingLoop(numbers, key);
        searchElementUsingBinarySearch(numbers, key);
        searchElementUsingListContains(numbers, key);
        searchElementUsingStreams(numbers, key);
    }

    /**
     * The time complexity of the code is O(n), where n is the number of elements in the input array.
     * This is because the loop iterates over the array until it either finds the target element or checks
     * all elements. In the worst case, it needs to check all elements.
     * <p>
     * The space complexity is O(1), as the algorithm only uses a constant amount of extra space
     * (the boolean `resultFlag` and the loop variable `val`).
     */
    private static void searchElementUsingLoop(int[] input, int target) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        boolean resultFlag = false;
        for (int val : input) {
            if (val == target) {
                System.out.println(STR."\{target} is present.");
                resultFlag = true;
                break;
            }
        }
        if(!resultFlag) {
            System.out.println(STR."\{target} is not present.");
        }
    }

    /**
     * The time complexity of the code is O(log n), where n is the number of elements in the input array.
     * This is because the binary search algorithm repeatedly divides the search space in half, making it
     * much more efficient than a linear search for large arrays.
     * <p>
     * The space complexity is O(1), as the algorithm only uses a constant amount of extra space
     * (the `result` and `resultFlag` variables).
     */
    private static void searchElementUsingBinarySearch(int[] input, int target) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        int result = Arrays.binarySearch(input, target);
        boolean resultFlag = result >= 0 ? true : false;
        if (resultFlag) {
            System.out.println(STR."\{target} is present.");
        } else {
            System.out.println(STR."\{target} is not present.");
        }
    }

    /**
     * The time complexity of the code is O(n), where n is the number of elements in the input array.
     * This is because the `Arrays.stream(input).boxed()` operation iterates over the entire input array to
     * box the primitive `int[]` into an `Integer[]`, and then the `Arrays.asList().contains()` operation
     * performs a linear search to check if the target element is present in the list.
     * <p>
     * The space complexity is O(n), as the algorithm creates a new `Integer[]` array of the same size as
     * the input `int[]` array for conversion. The space used grows linearly with the size of the input array.
     */
    private static void searchElementUsingListContains(int[] input, int target) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        Integer[] convertedInput = Arrays.stream(input).boxed().toArray(Integer[]::new);
        boolean resultFlag = Arrays.asList(convertedInput).contains(target);
        if (resultFlag) {
            System.out.println(STR."\{target} is present.");
        } else {
            System.out.println(STR."\{target} is not present.");
        }
    }

    /**
     * The time complexity of the code is O(n), where n is the number of elements in the input array.
     * This is because both `IntStream.of(input).anyMatch()` and `Arrays.stream(input).anyMatch()` iterate
     * over the array to check if any element matches the target. In the worst case, the entire array
     * will be traversed.
     * <p>
     * The space complexity is O(1), as the algorithm only uses a constant amount of extra space
     * regardless of the input size. The streams themselves do not create any additional data structures
     * that scale with the size of the input array.
     */
    private static void searchElementUsingStreams(int[] input, int target) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        // Approach 1
        boolean resultFlag = IntStream.of(input).anyMatch(val -> val == target);
        if (resultFlag) {
            System.out.println(STR."\{target} is present.");
        } else {
            System.out.println(STR."\{target} is not present.");
        }

        // Approach 2
        boolean result = Arrays.stream(input).anyMatch(val -> val == target);
        if (result) {
            System.out.println(STR."\{target} is present.");
        } else {
            System.out.println(STR."\{target} is not present.");
        }
    }

}
