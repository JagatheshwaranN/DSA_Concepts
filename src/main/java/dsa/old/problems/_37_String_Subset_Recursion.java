package dsa.old.problems;

import java.util.ArrayList;

public class _37_String_Subset_Recursion {
    public static void main(String[] args) {
        
        String input = "abc";
        String result = "";
        findSubseq(result, input);
        System.out.println("***********************************");
        System.out.println(findSubsequence("","abc"));
        System.out.println("***********************************");
        findSubseqASCII(result, input);
        System.out.println("***********************************");
        System.out.println(findSubsequenceASCII("","abc"));
    }
    private static void findSubseq(String processed, String unprocessed) {

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        findSubseq(processed + ch, unprocessed.substring(1));
        findSubseq(processed, unprocessed.substring(1));
    }
    private static ArrayList<String> findSubsequence(String processed, String unprocessed) {

        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> left = findSubsequence(processed + ch, unprocessed.substring(1));
        ArrayList<String> right =  findSubsequence(processed, unprocessed.substring(1));
        left.addAll(right);
        return left;
    }
    private static void findSubseqASCII(String processed, String unprocessed) {

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        findSubseqASCII(processed + ch, unprocessed.substring(1));
        findSubseqASCII(processed, unprocessed.substring(1));
        findSubseqASCII(processed + (ch + 0), unprocessed.substring(1));
    }
    private static ArrayList<String> findSubsequenceASCII(String processed, String unprocessed) {

        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> first = findSubsequenceASCII(processed + ch, unprocessed.substring(1));
        ArrayList<String> second =  findSubsequenceASCII(processed, unprocessed.substring(1));
        ArrayList<String> third = findSubsequenceASCII(processed + (ch + 0), unprocessed.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
