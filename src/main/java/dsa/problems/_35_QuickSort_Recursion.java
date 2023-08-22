package dsa.problems;

import java.util.Arrays;

public class _35_QuickSort_Recursion {
    public static void main(String[] args) {

        int[] arr = {5, 3, 7, 4, 6, 2, 1};
        System.out.println("Array Before Quick Sort "+ Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array After Quick Sort  "+Arrays.toString(arr));
    }
    private static void quickSort(int[] arr, int low, int high) {

        if(low >= high)
            return;

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while(start <= end){

            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}
