package dsa.old.problems;

import java.util.Arrays;

public class _32_SelectionSort_Recursion {
    public static void main(String[] args) {

        int[] arr = {5, 3, 7, 4, 6, 2};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr, int row, int col, int max) {
        if(row == 0)
            return;
        if(col < row){
            if (arr[col] > arr[max]){
                selectionSort(arr, row, col + 1, col);
            }else{
                selectionSort(arr, row, col + 1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            selectionSort(arr, row - 1, 0, 0);
        }
    }
}
