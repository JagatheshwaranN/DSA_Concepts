package dsa.implementation.concepts.sort.merge;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] input) {
        if (input.length == 1)
            return input;
        int mid = input.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(input, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(input, mid, input.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] join = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                join[k++] = left[i++];
            else
                join[k++] = right[j++];
        }
        while (i < left.length) {
            join[k++] = left[i++];
        }
        while (j < right.length) {
            join[k++] = right[j++];
        }
        return join;
    }

}
