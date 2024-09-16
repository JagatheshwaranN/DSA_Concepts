package gfg.array.advanced;

import java.util.Arrays;

public class RemoveAllOccurrenceOfElement {

    public static void main(String[] args) {
        int[] numbers =  { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        int key = 3;
        removeElementOccurrenceUsingLoop(numbers, key);
        removeElementOccurrenceUsingStream(numbers, key);
    }

    /**
     * The time complexity of the code is O(n). This is because the code iterates over
     * each element of the input array exactly once, where n is the number of elements
     * in the array.
     * <p>
     * The space complexity of the code is O(n). This is because, in the worst case,
     * the Arrays.copyOf() method creates a new array of size n, where n is the number
     * of elements in the input array.
     */
    private static void removeElementOccurrenceUsingLoop(int[] input, int target) {
        if(input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        int index = 0;
        for(int i = 0; i < input.length; i++) {
            if(input[i] != target) {
                input[index++] = input[i];
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(input, index)));
    }

    private static void removeElementOccurrenceUsingStream(int[] input, int target) {
        int[] resultArray = Arrays.stream(input)
                .filter(num -> num != target)
                .boxed()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(Arrays.copyOf(resultArray, resultArray.length)));
    }

}
