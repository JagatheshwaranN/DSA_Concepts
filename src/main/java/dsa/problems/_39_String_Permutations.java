package dsa.problems;

import java.util.ArrayList;

public class _39_String_Permutations {
    public static void main(String[] args) {
        findStringPermutations("", "abc");
        System.out.println(findPermutationsCount("", "abc"));
        ArrayList<String> result = findStringPermutationsList("", "abc");
        System.out.println(result);
    }
    private static void findStringPermutations(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String firstString = processed.substring(0, i);
            String secondString = processed.substring(i, processed.length());
            findStringPermutations(firstString + ch + secondString, unprocessed.substring(1));
        }
    }
    private static ArrayList<String> findStringPermutationsList(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i <= processed.length(); i++) {
            String firstString = processed.substring(0, i);
            String secondString = processed.substring(i, processed.length());
            result.addAll(findStringPermutationsList(firstString + ch + secondString, unprocessed.substring(1)));
        }
        return result;
    }
    private static int findPermutationsCount(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String firstString = processed.substring(0, i);
            String secondString = processed.substring(i, processed.length());
            count = count + findPermutationsCount(firstString + ch + secondString, unprocessed.substring(1));
        }
        return count;
    }
}
