package dsa.concepts;

import java.util.Arrays;

public class _07_CyclicSort {

    public static void main(String[] args) {


        int[] arr1 = {3, 1, 5, 4, 2};
        cyclicSort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {5, 4, 3, 2 , 1};
        cyclicSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    private static void cyclicSort(int[] arr){

        int i = 0;
        while(i < arr.length){
            int correctPosition = arr[i] - 1;
            if(arr[i] != arr[correctPosition]){
                swapElements(arr, i, correctPosition);
            }else{
                i++;
            }
        }
    }

    private static void swapElements(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
