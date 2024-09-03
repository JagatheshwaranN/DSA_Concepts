package dsa.old.leetcode_problems;

public class _08_SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int[] numbers = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(numbers, target));
        target = 4;
        System.out.println(search(numbers, target));
        target = 2;
        System.out.println(search(numbers, target));
        target = 12;
        System.out.println(search(numbers, target));
    }

    private static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length-1);
        }else if(target == arr[pivot]){
            return pivot;
        }else if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length -1 );
    }

    private static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }else if (arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
