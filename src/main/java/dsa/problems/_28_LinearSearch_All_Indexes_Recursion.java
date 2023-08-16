package dsa.problems;

import java.util.ArrayList;

public class _28_LinearSearch_All_Indexes_Recursion {
    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 7, 3, 9};
        int target = 3;
        ArrayList<Integer> result = findValueIndices(arr, target, 0, new ArrayList<Integer>());
        System.out.println("The value "+target+" is found at indices "+result);
    }
    private static ArrayList<Integer> findValueIndices(int[] arr, int target, int index, ArrayList<Integer> list) {

        if (index == arr.length)
            return list;
        if (arr[index] == target)
            list.add(index);
        return findValueIndices(arr, target, index + 1, list);
    }
}
