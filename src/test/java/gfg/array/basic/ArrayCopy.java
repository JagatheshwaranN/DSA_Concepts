package gfg.array.basic;

import java.util.Arrays;

/**
 * Copy the element of one array to another array.
 * <p>
 * Input: [2, 3, 4, 5, 7]
 * Output: [2, 3, 4, 5, 7]
 * <p>
 * We have different ways to copy the array as below.
 * Iterating each element of the given original array and copy one element at a time
 * Using clone() method
 * Using arraycopy() method
 * Using copyOf() method of Arrays class
 * Using copyOfRange() method of Arrays class
 */
@SuppressWarnings("All")
public class ArrayCopy {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 7};
        System.out.println(Arrays.toString(numbers));
        arrayCopyUsingLoop(numbers);
        arrayCopyUsingClone(numbers);
        arrayCopyUsingSystemArray(numbers);
        arrayCopyUsingCopyOf(numbers);
        arrayCopyUsingCopyOfRange(numbers);
    }

    // TC: O(n)
    // SC: O(1)
    private static void arrayCopyUsingLoop(int[] input) {
        int[] newArray = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            newArray[i] = input[i];
        }
        System.out.println(Arrays.toString(newArray));
    }

    private static void arrayCopyUsingClone(int[] input) {
        int[] newArray;
        newArray = input.clone();
        System.out.println(Arrays.toString(newArray));
    }

    private static void arrayCopyUsingSystemArray(int[] input) {
        int[] newArray = new int[input.length];
        System.arraycopy(input, 0, newArray, 0, 5);
        System.out.println(Arrays.toString(newArray));
    }

    private static void arrayCopyUsingCopyOf(int[] input) {
        int[] newArray;
        newArray = Arrays.copyOf(input, 5);
        System.out.println(Arrays.toString(newArray));
    }

    private static void arrayCopyUsingCopyOfRange(int[] input) {
        int[] newArray = Arrays.copyOfRange(input, 0, 5);
        System.out.println(Arrays.toString(newArray));
    }

}
