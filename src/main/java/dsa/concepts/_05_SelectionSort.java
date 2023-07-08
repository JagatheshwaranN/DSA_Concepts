package dsa.concepts;

import java.util.Arrays;

public class _05_SelectionSort {

    public static void main(String[] args) {

        int[] arr1 = {3, 1, 5, 4, 2};
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {-3, 7, -5, 0, 2};
        selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    private static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
