package dsa.leetcode_problems;

/**
 * @Amazon
 * @Microsoft
 */
public class _12_FindTheDuplicateNumber {

    public static void main(String[] args) {

        int[] nums1 = {1, 3, 4, 2, 2};
        System.out.println(findDuplicateNumber(nums1));
        int[] nums2 = {1, 3, 4, 5, 2, 3, 6, 7};
        System.out.println(findDuplicateNumber(nums2));
    }

    private static int findDuplicateNumber(int[] arr){
        int i = 0;
        while(i < arr.length) {
            if (arr[i] != i + 1) {
                int correctPosition = arr[i] - 1;
                if (arr[i] != arr[correctPosition]) {
                    swapElements(arr, i, correctPosition);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    private static void swapElements(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
