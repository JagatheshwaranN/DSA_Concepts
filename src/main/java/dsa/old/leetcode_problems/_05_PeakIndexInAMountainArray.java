package dsa.old.leetcode_problems;

public class _05_PeakIndexInAMountainArray {

    public static void main(String[] args) {

        int[] arr1 = {0, 1, 0};
        System.out.println(peakIndexInMountainArray(arr1));
        int[] arr2 = {0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(arr2));
        int[] arr3 = {0, 10, 15, 11};
        System.out.println(peakIndexInMountainArray(arr3));
    }

    private static int peakIndexInMountainArray(int[] arr){

        int start = 0;
        int end = arr.length - 1;
        // The reason for not using start <= end in a while, is it will enter into Infinite Loop.
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
}
