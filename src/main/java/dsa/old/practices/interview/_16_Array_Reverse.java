package dsa.old.practices.interview;

import java.util.Arrays;

public class _16_Array_Reverse {
    public static void main(String[] args) {

        int[] arr = {4, 6, 7, 8, 9, 2};
        System.out.println("Array before reverse "+ Arrays.toString(arr));
        System.out.println("Array after reverse  "+ Arrays.toString(reverseArray(arr)));
    }
    private static int[] reverseArray(int[] arr) {
        int index = 0;
        int[] arr1 = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--){
            arr1[index] = arr[i];
            index++;
        }
        return arr1;
    }
}
