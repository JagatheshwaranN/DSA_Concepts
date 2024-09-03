package dsa.old.problems;

public class _29_RotatedBinarySearch_Recursion {
    public static void main(String[] args) {
        
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 5;
        System.out.println("The element "+target+" is found at index "+searchElement(arr, target, 0, arr.length - 1));
        target = 9;
        System.out.println("The element "+target+" is found at index "+searchElement(arr, target, 0, arr.length - 1));
        target = 3;
        System.out.println("The element "+target+" is found at index "+searchElement(arr, target, 0, arr.length - 1));
        target = 4;
        System.out.println("The element "+target+" is found at index "+searchElement(arr, target, 0, arr.length - 1));
    }

    private static int searchElement(int[] arr, int target, int start, int end) {

        if(start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if(arr[mid] == target)
            return mid;

        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]) {
                return searchElement(arr, target, start, mid - 1);
            }else{
                return searchElement(arr, target, mid + 1, end);
            }
        }
        if(target >= arr[mid] && target <= arr[end]){
            return searchElement(arr, target, mid + 1, end);
        }
        return searchElement(arr, target, start, mid - 1);
    }
}
