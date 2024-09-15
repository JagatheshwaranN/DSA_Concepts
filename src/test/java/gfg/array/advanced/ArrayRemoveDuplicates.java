package gfg.array.advanced;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Remove the duplicate elements from the sorted array.
 * <p>
 * Input: [1, 2, 2, 4, 4, 5]
 * Output: [1, 2, 4, 5]
 * <p>
 * Using iterative approach with temp array
 * Using set
 * Using iterative approach in place
 */
@SuppressWarnings("All")
public class ArrayRemoveDuplicates {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 4, 4, 5};
        removeDuplicateUsingTempArray(numbers);
        int[] numbers2 = {1, 2, 2, 4, 4, 5};
        removeDuplicateUsingSet(numbers2);
        int[] numbers3 = {1, 2, 2, 4, 4, 5};
        removeDuplicateInPlace(numbers3);
    }

    /**
     * The time complexity of this program is O(n), where n is the length of the input
     * array. This is because the loop iterates through the array once and the array copy
     * operation also takes O(n) time.
     * <p>
     * The space complexity is O(n) as the program uses an additional temporary array
     * of the same size as the input array.
     */
    private static void removeDuplicateUsingTempArray(int[] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        int[] temp = new int[input.length];
        int j = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] != input[i + 1]) {
                temp[j++] = input[i];
            }
        }
        temp[j++] = input[input.length - 1];
        System.out.println(Arrays.toString(Arrays.copyOfRange(temp, 0, j)));
    }

    /**
     * The time complexity of this program is O(n), where n is the length of the input
     * array. This is because inserting elements into the HashSet and copying unique
     * elements back to the array both take O(n) time.
     * <p>
     * The space complexity is O(n), as the HashSet uses additional space to store
     * up to n unique elements.
     */
    private static void removeDuplicateUsingSet(int[] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i : input) {
            set.add(i);
        }
        int index = 0;
        for (int i : set) {
            input[index++] = i;
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(input, 0, index)));
    }

    /**
     * The time complexity of this program is O(n), where n is the length of the input
     * array. This is because the program iterates through the array once to remove
     * duplicates and once to print the unique elements.
     * <p>
     * The space complexity is O(1), as the program modifies the array in place and
     * uses a constant amount of extra space.
     */
    private static void removeDuplicateInPlace(int[] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        int j = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] != input[i + 1]) {
                input[j++] = input[i];
            }
        }
        input[j++] = input[input.length - 1];
        for(int i = 0; i < j; i++) {
            System.out.print(input[i]+" ");
        }
    }

}
