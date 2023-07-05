package dsa.concepts;

import java.util.Arrays;

public class _04_BubbleSort {

    public static void main(String[] args) {

        int[] arr1 = {3, 1, 5, 4, 2};
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {-3, 7, -5, 0, 2};
        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));

    }

    private static void bubbleSort(int[] arr){

        boolean swapped;
        for( int i = 0; i < arr.length; i++){
            swapped = false;
            for( int j = 1; j < arr.length - i; j++){

                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }
}
