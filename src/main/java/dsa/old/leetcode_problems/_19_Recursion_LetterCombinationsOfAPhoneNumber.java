package dsa.old.leetcode_problems;

import java.util.ArrayList;

/**
 * @Google
 */
public class _19_Recursion_LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {

        findDailPadStrCombo("", "12");
        System.out.println(findDailPadStrComboCount("", "12"));
        System.out.println(findDailPadStrComboList("", "12"));

    }

    private static void findDailPadStrCombo(String processed, String unprocessed) {

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0'; // This should convert '2' -> 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            findDailPadStrCombo(processed + ch, unprocessed.substring(1));
        }
    }

    private static ArrayList<String> findDailPadStrComboList(String processed, String unprocessed) {

        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = unprocessed.charAt(0) - '0'; // This should convert '2' -> 2
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            list.addAll(findDailPadStrComboList(processed + ch, unprocessed.substring(1)));
        }
        return list;
    }

    private static int findDailPadStrComboCount(String processed, String unprocessed) {

        if(unprocessed.isEmpty()){
            return 1;
        }

        int count = 0;
        int digit = unprocessed.charAt(0) - '0'; // This should convert '2' -> 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            count = count + findDailPadStrComboCount(processed + ch, unprocessed.substring(1));
        }
        return count;
    }
}
