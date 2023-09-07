package dsa.leetcode_problems;

import java.util.ArrayList;

/**
 * @Amazon
 */
public class _20_Recursion_DiceThrow {

    public static void main(String[] args) {

        findDiceThrowCombo("",4, 6);
        System.out.println(findDiceThrowComboList("",4, 6));
    }

    private static void findDiceThrowCombo(String processed, int target, int face) {

        if(target == 0){
            System.out.println(processed);
            return;
        }
        for(int i = 1; i <= face && i <= target; i++){
            findDiceThrowCombo(processed + i, target - i, face);
        }
    }

    private static ArrayList<String> findDiceThrowComboList(String processed, int target, int face) {

        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= face && i <= target; i++){
            list.addAll(findDiceThrowComboList(processed + i, target - i, face));
        }
        return list;
    }
}
