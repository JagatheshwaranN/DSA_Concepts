package dsa.problems;

import java.util.Arrays;

public class _34_MergeSort_InPlace_Recursion {
    public static void main(String[] args) {

        int[] arr = {5, 3, 7, 4, 6, 2, 1};
        System.out.println("Array Before Merge Sort "+Arrays.toString(arr));
        mergeSort(arr, 0, arr.length);
        System.out.println("Array After Merge Sort  "+Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr, int start, int end) {

        if(end - start == 1)
            return;

        int midPosition = (start + end) / 2;
        mergeSort(arr, start, midPosition);
        mergeSort(arr, midPosition, end);
        merge(arr, start, midPosition, end);
    }
    private static void merge(int[] arr, int start, int mid, int end) {

        int[] mergeArr = new int[end - start];
        int l = start;
        int r = mid;
        int m = 0;

        while( l < mid && r < end){

            if(arr[l] < arr[r]){
                mergeArr[m] = arr[l];
                l++;
            }else{
                mergeArr[m] = arr[r];
                r++;
            }
            m++;
        }
        while (l < mid){
            mergeArr[m] = arr[l];
            l++;
            m++;
        }
        while (r < end){
            mergeArr[m] = arr[r];
            r++;
            m++;
        }

        for(int i = 0; i < mergeArr.length; i++) {
            arr[start+i] = mergeArr[i];
        }
    }
}
