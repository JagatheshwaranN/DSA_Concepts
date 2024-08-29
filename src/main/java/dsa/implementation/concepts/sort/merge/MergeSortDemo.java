package dsa.implementation.concepts.sort.merge;

import java.util.Arrays;

public class MergeSortDemo {

    public static void main(String[] args) {
        // MergeSort with using Separate Arrays
        int[] numbers = {5, 9, 6, 4, 1, 3, 8, 2};
        System.out.println(Arrays.toString(MergeSort.mergeSort(numbers)));

        // MergeSort without using Separate Arrays
        int[] values = {9, 4, 7, 1, 6, 2, 8, 4};
        MergeSort.mergeSortInPlace(values, 0, values.length);
        System.out.println(Arrays.toString(values));
    }

}
