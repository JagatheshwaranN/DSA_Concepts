package gfg.array;

import java.util.Arrays;

/**
 * Check if two Arrays are Equal or not.
 * <p>
 * Input1: [1, 2, 3, 4, 5]
 * Input2: [1, 2, 3, 4, 5]
 * Output: True
 * <p>
 * Input1: [1, 2, 3, 4, 5]
 * Input2: [1, 2, 3, 4]
 * Output: False
 * <p>
 * Iterating each element of the given array1 and array2 at a time and check
 * Using equals() method
 */
@SuppressWarnings("All")
public class ArrayEqual {

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 3, 4, 5};
        int[] numbers3 = {1, 2, 3, 4};
        arrayEqualUsingLoop(numbers1, numbers2);
        arrayEqualUsingLoop(numbers1, numbers3);
        arrayEqualUsingEquals(numbers1, numbers2);
        arrayEqualUsingEquals(numbers1, numbers3);
    }

    // TC: O(n)
    // SC: O(1)
    private static void arrayEqualUsingLoop(int[] input1, int[] input2) {
        boolean isEqual = false;
        if(input1.length != input2.length) {
            System.out.println(isEqual);
        } else {
            for(int i = 0; i < input1.length; i++) {
                if(input1[i] == input2[i]){
                    isEqual = true;
                }
            }
            System.out.println(isEqual);
        }
    }

    // TC: O(n)
    // SC: O(1)
    private static void arrayEqualUsingEquals(int[] input1, int[] input2) {
        boolean isEqual = Arrays.equals(input1, input2);
        System.out.println(isEqual);
    }

}
