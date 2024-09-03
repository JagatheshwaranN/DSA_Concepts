package dsa.old.geeksforgeeks_problems;

public class _02_FindRotationCountInRotatedSortedArray {

    public static void main(String[] args) {

        int[] numbers1 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(rotationCount(numbers1));
        int[] numbers2 = {0, 1, 2, 4, 5, 6, 7};
        System.out.println(rotationCount(numbers2));
    }

    private static int rotationCount(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
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

    private static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            } else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else{
                end =  mid - 1;
            }
        }
        return -1;
    }
}
