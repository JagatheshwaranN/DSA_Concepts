package dsa.implementation.concepts.sort.selection;

import java.util.Arrays;

public class SelectionSort {

    public static void selectSortAsc(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
        }
        System.out.println(Arrays.toString(input));
    }

    public static void selectSortDesc(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] > input[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = input[i];
            input[i] = input[maxIndex];
            input[maxIndex] = temp;
        }
        System.out.println(Arrays.toString(input));
    }



}
