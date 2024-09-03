package dsa.old.leetcode_problems;

import java.util.Arrays;

public class _14_SetMismatch {

    public static void main(String[] args) {

        int[] nums = {2, 1, 4, 2 , 6, 5};
        System.out.println(Arrays.toString(findDuplicateAndMissingNumber(nums)));

    }

    private static int[] findDuplicateAndMissingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctPosition = arr[i] - 1;
            if(arr[i] != arr[correctPosition]){
                swapElements(arr, i, correctPosition);
            }else{
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index+1){
                return new int[]{arr[index], index+1};
            }
        }
        return new int[]{-1, -1};
    }

    private static void swapElements(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
