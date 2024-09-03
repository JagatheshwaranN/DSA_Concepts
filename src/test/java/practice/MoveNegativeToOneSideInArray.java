package practice;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class MoveNegativeToOneSideInArray {

    public static void main(String[] args) {
        int[] numbers = {5, -9, 8, -6, 1};
        moveNegativeToRight(numbers);
        moveNegativeToLeft(numbers);
    }

    private static void moveNegativeToRight(int[] input) {
        int[] resultArray = new int[input.length];
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if(input[i] > 0) {
                resultArray[count++] = input[i];
            }
        }
        for(int i = 0; i < input.length; i++){
            if(input[i] < 0){
                resultArray[count++] = input[i];
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }

    private static void moveNegativeToLeft(int[] input) {
        int[] resultArray = new int[input.length];
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if(input[i] < 0) {
                resultArray[count++] = input[i];
            }
        }
        for(int i = 0; i < input.length; i++){
            if(input[i] > 0){
                resultArray[count++] = input[i];
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }

}
