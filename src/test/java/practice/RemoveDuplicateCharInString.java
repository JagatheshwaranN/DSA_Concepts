package practice;

import java.util.Arrays;

public class RemoveDuplicateCharInString {

    public static void main(String[] args) {
        String input = "Java Program";
        removeDuplicate(input);
        demo();
    }

    private static void removeDuplicate(String input) {
        int index = 0;
        char[] inputCharArr = input.toCharArray();
        for(int i = 0; i < inputCharArr.length; i++){
            int j;
            for( j = 0; j < i; j++){
                if(inputCharArr[i] == inputCharArr[j]){
                    break;
                }
            }
            if(i == j){
                inputCharArr[index++] = inputCharArr[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(inputCharArr, index)));
    }

    public static void demo(){
        for(int j = 9; j < 9; j++){
            System.out.println(j);
        }
    }

}
