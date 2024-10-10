package gfg.array.advanced;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Reverse the given array.
 * <p>
 * Input: [5, 9, 8, 6, 1]
 * Output: [1, 6, 8, 9, 5]
 * <p>
 * Using the Temp Array Method1
 * Using the Temp Array Method2
 * Using the Pointers
 * Using the Stack
 * Using the Collections
 */
@SuppressWarnings("All")
public class ReverseArray {

    public static void main(String[] args) {
        int[] numbers = {5, 9, 8, 6, 1};
        System.out.println(Arrays.toString(numbers));
        reverseArrayUsingTempArray1(numbers);
        reverseArrayUsingTempArray2(numbers);
        reverseArrayUsingPointers(numbers);
        int[] numbers1 = {5, 9, 8, 6, 1};
        reverseArrayUsingStack(numbers1);
        int[] numbers2 = {5, 9, 8, 6, 1};
        reverseArrayUsingCollection(numbers2);
    }

    /**
     * Time Complexity: O(n) - Iterating through the entire array once.
     * Space Complexity: O(n) - Using an additional array of the same size as input.
     */
    private static void reverseArrayUsingTempArray1(int[] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        int[] reverseArray = new int[input.length];
        int count = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            reverseArray[count++] = input[i];
        }
        System.out.println(Arrays.toString(reverseArray));
    }

    /**
     * Time Complexity: O(n) - Iterating through the entire array once.
     * Space Complexity: O(n) - Using an additional array of the same size as input.
     */
    private static void reverseArrayUsingTempArray2(int[] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        int[] reverseArray = new int[input.length];
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            reverseArray[count++] = input[input.length - i - 1];
        }
        System.out.println(Arrays.toString(reverseArray));
    }

    /**
     * Time Complexity: O(n) - Iterating through the array once with two pointers.
     * Space Complexity: O(1) - In-place reversal with constant extra space.
     */
    private static void reverseArrayUsingPointers(int[] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        int start = 0;
        int end = input.length - 1;
        while(start < end) {
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(input));
    }

    /**
     * Time Complexity: O(n) - Each element is pushed and popped from the stack.
     * Space Complexity: O(n) - Stack requires additional space proportional to the input size.
     */
    private static void reverseArrayUsingStack(int[] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i : input) {
            stack.push(i);
        }
        for (int i = 0; i < input.length; i++) {
            input[i] = stack.pop();
        }
        System.out.println(Arrays.toString(input));
    }

    /**
     * Time Complexity: O(n) - Arrays.asList and Collections.reverse iterate over the array.
     * Space Complexity: O(n) - Creating an Integer array and a list, both proportional to the input size.
     */
    private static void reverseArrayUsingCollection(int[] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        Integer[] integerArray = Arrays.stream(input).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(integerArray);
        Collections.reverse(list);
        System.out.println(list);
    }

}
