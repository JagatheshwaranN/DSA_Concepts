package dsa.problems;

import java.util.ArrayList;

public class _28_LinearSearch_All_Indexes_Recursion {

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 7, 3, 9};
        int target = 3;
        ArrayList<Integer> result = findValueIndices(arr, target, 0, new ArrayList<>());
        System.out.println("The value "+target+" is found at indices "+result);
        System.out.println("The value "+target+" is found at indices "+findValueIndicesWithList(arr, target, 0));
    }
    private static ArrayList<Integer> findValueIndices(int[] arr, int target, int index, ArrayList<Integer> list) {

        if (index == arr.length)
            return list;
        if (arr[index] == target)
            list.add(index);
        return findValueIndices(arr, target, index + 1, list);
    }

    // Creation of ArrayList for every function call and add all the list before return.
    // Not recommended to use. Shared for knowledge purpose.
    private static ArrayList<Integer> findValueIndicesWithList(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length)
            return list;
        if (arr[index] == target)
            list.add(index);
        ArrayList<Integer> resultFromSubsequentCalls =  findValueIndicesWithList(arr, target, index + 1);
        list.addAll(resultFromSubsequentCalls);
        return list;
    }
}
