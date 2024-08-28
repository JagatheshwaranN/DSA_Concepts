package dsa.implementation.concepts.sort.merge;

import java.util.Arrays;

public class MergeSortDemo {

    public static void main(String[] args) {
        int[] numbers = {5, 9, 6, 4, 1, 3, 8, 2};
        System.out.println(Arrays.toString(MergeSort.mergeSort(numbers)));
    }
}
