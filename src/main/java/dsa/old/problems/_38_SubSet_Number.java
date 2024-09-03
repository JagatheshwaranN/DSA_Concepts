package dsa.old.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _38_SubSet_Number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = findSubset(arr);
        for(List<Integer> list : result){
            System.out.println(list);
        }
        System.out.println("**************************");
        int[] arrDup = {1, 2, 2};
        result = findSubsetDuplicate(arrDup);
        for(List<Integer> list : result){
            System.out.println(list);
        }
    }

    private static  List<List<Integer>> findSubset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for( int number : arr){
            int outer_size = outer.size();
            for (int i = 0; i < outer_size; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(number);
                outer.add(internal);
            }
        }
        return outer;
    }
    private static  List<List<Integer>> findSubsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length; i++){
            start = 0;
            // If current and previous element is same, then start = end + 1
            if(i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int outer_size = outer.size();
            for (int j = start; j < outer_size; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
