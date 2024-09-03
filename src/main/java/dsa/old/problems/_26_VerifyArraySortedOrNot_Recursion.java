package dsa.old.problems;

public class _26_VerifyArraySortedOrNot_Recursion {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(checkArraySorted(arr, 0));
    }
    private static boolean checkArraySorted(int[] arr, int index) {

        if(index == arr.length -1)
            return true;
        return arr[index] < arr[index + 1] && checkArraySorted(arr, index + 1);
    }
}
