package dsa.concepts;

import java.util.Arrays;

public class _06_InsertionSort {

    public static void main(String[] args) {

        int[] arr1 = {3, 1, 5, 4, 2};
        insertionSort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {-3, 7, -5, 0, 2};
        insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    private static void insertionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
