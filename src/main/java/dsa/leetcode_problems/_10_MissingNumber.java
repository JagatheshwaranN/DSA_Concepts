package dsa.leetcode_problems;

import java.util.Arrays;

/**
 * @Amazon
 */
public class _10_MissingNumber {

    public static void main(String[] args) {

        int[] arr1 = {3, 0, 2};
        System.out.println(findMissingNumber(arr1));

    }

    private static int findMissingNumber(int[] arr){

        int i = 0;
        while(i < arr.length){
            int correctPosition = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctPosition]) {
                swapElements(arr, i, correctPosition);
            }else{
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }

        return arr.length;
    }

    private static void swapElements(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
