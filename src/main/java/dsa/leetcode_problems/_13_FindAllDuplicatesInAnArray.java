package dsa.leetcode_problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @Amazon
 */
public class _13_FindAllDuplicatesInAnArray {

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findAllDuplicatedInArray(nums));

    }

    private static List<Integer> findAllDuplicatedInArray(int[] arr){

        int i = 0;
        while(i < arr.length){
            int correctPosition = arr[i] - 1;
            if(arr[i]!=arr[correctPosition]){
                swapElements(arr, i, correctPosition);
            }else{
                i++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for( int index = 0; index < arr.length; index++){
            if(arr[index] != index+1){
                result.add(arr[index]);
            }
        }
        return result;
    }


    private static void swapElements(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
