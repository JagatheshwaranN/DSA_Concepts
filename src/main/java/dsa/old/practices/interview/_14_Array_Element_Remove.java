package dsa.old.practices.interview;

import java.util.Arrays;

public class _14_Array_Element_Remove {
    public static void main(String[] args) {

        int[] arr = {4, 6, 7, 8, 9, 2};
        int target = 9;
        System.out.println("Array before removing element "+target+ " is " +Arrays.toString(arr));
        System.out.println("Array after removing element "+target+ " is " +Arrays.toString(removeElement(arr, target)));
    }
    private static int[] removeElement(int[] arr, int target) {
        int[] arr1 = new int[arr.length - 1];
        for(int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] == target) {
                continue;
            }
            else {
                arr1[j++] = arr[i];
            }
        }
        return arr1;
    }
}
