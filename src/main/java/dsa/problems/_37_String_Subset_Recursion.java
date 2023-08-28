package dsa.problems;

import java.util.ArrayList;

public class _37_String_Subset_Recursion {

    public static void main(String[] args) {
        
        String input = "abc";
        String result = "";
        findSubseq(result, input);
        System.out.println(findSubsequence("","abc"));
    }

    private static void findSubseq(String result, String input) {

        if(input.isEmpty()){
            System.out.println(result);
            return;
        }
        char ch = input.charAt(0);
        findSubseq(result + ch, input.substring(1));
        findSubseq(result, input.substring(1));
    }

    private static ArrayList<String> findSubsequence(String result, String input) {

        if(input.isEmpty()){
            System.out.println(result);
            ArrayList<String> list = new ArrayList<>();
            list.add(result);
            return list;
        }
        char ch = input.charAt(0);
        ArrayList<String> left = findSubsequence(result + ch, input.substring(1));
        ArrayList<String> right =  findSubsequence(result, input.substring(1));
        left.addAll(right);
        return left;
    }
}
