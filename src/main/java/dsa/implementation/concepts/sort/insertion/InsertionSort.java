package dsa.implementation.concepts.sort.insertion;

import java.util.Arrays;

public class InsertionSort {

    public static void insertSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    int temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }
}
