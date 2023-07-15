package dsa.leetcode_problems;

/**
 * @Amazon
 */
public class _15_FindMissingPositive {

    public static void main(String[] args) {
        int[] nums = {3, 4, -1 , 1};
        System.out.println(findMissingSmallestPositive(nums));
    }

    private static int findMissingSmallestPositive(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctPosition = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctPosition]){
                swapElements(arr, i, correctPosition);
            }else{
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }

    private static void swapElements(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
