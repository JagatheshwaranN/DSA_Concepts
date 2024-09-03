package dsa.concepts.sort.quick;

public class QuickSort {

    public static void quicksort(int[] input, int low, int high) {
        if (low >= high)
            return;
        int start = low;
        int end = high;
        int mid = (start + end) / 2;
        int pivot = input[mid];
        while (start <= end) {
            while (input[start] < pivot) {
                start++;
            }
            while (input[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = input[start];
                input[start] = input[end];
                input[end] = temp;
                start++;
                end--;
            }
        }
        quicksort(input, low, end);
        quicksort(input, start, high);
    }

}
