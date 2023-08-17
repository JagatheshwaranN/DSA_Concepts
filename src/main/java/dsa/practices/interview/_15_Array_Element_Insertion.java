package dsa.practices.interview;

import java.util.Arrays;

public class _15_Array_Element_Insertion {

    public static void main(String[] args) {

        int[] arr = {4, 6, 7, 8, 9, 2};
        int target = 5;
        int position = 3;
        System.out.println("Array before inserting element "+target+ " is " + Arrays.toString(arr));
        System.out.println("Array after inserting element "+target+ " is " +Arrays.toString(insertElement(arr, target, position)));
    }

    private static int[] insertElement(int[] arr, int target, int position) {
        int[] arr1 = new int[arr.length + 1];
        for(int i = 0; i < arr1.length; i++){
            if(i < position - 1){
                arr1[i] = arr[i];
            }else if(i == position - 1){
                arr1[i] = target;
            }else{
                arr1[i] = arr[i-1];
            }
        }
        return arr1;
    }
}
