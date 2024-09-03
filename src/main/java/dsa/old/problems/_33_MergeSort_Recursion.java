package dsa.old.problems;

import java.util.Arrays;

public class _33_MergeSort_Recursion {
    public static void main(String[] args) {

        int[] arr = {5, 3, 7, 4, 6, 2, 1};
        System.out.println("Array Before Merge Sort "+Arrays.toString(arr));
        int[] result = mergeSort(arr);
        System.out.println("Array After Merge Sort  "+Arrays.toString(result));
    }
    private static int[] mergeSort(int[] arr) {

        if(arr.length == 1)
            return arr;

        int midPosition = arr.length / 2;
        int[] leftHalf = mergeSort(Arrays.copyOfRange(arr, 0, midPosition));
        int[] rightHalf = mergeSort(Arrays.copyOfRange(arr, midPosition, arr.length));
        return merge(leftHalf, rightHalf);
    }
    private static int[] merge(int[] leftHalf, int[] rightHalf) {

        int[] mergeArr = new int[leftHalf.length + rightHalf.length];
        int l = 0;
        int r = 0;
        int m = 0;

        while( l < leftHalf.length && r < rightHalf.length){

            if(leftHalf[l] < rightHalf[r]){
                mergeArr[m] = leftHalf[l];
                l++;
            }else{
                mergeArr[m] = rightHalf[r];
                r++;
            }
            m++;
        }
        while (l < leftHalf.length){
            mergeArr[m] = leftHalf[l];
            l++;
            m++;
        }
        while (r < rightHalf.length){
            mergeArr[m] = rightHalf[r];
            r++;
            m++;
        }
        return mergeArr;
    }
}
