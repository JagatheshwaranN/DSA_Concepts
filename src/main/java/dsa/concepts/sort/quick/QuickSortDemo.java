package dsa.concepts.sort.quick;

import java.util.Arrays;

@SuppressWarnings("All")
public class QuickSortDemo {

    public static void main(String[] args) {
        int[] numbers = { 5, 8, 4, 3, 7, 6, 2, 9, 5};
        QuickSort.quicksort(numbers, 0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }

}
