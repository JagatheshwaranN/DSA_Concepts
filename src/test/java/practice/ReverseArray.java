package practice;

import java.util.Arrays;

@SuppressWarnings("All")
public class ReverseArray {

    public static void main(String[] args) {
        int[] numbers = {5, 9, 8, 6, 1};
        System.out.println(Arrays.toString(numbers));
        reverseArray(numbers);
    }

    private static void reverseArray(int[] input) {
        int[] reverseArray = new int[input.length];
        int count = 0;
        for(int i = input.length - 1; i >= 0; i--){
            reverseArray[count++] = input[i];
        }
        System.out.println(Arrays.toString(reverseArray));
    }

}
