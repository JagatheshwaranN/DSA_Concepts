package practice;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class SortArray {

    public static void main(String[] args) {
        int[] numbers = {5, 9, 8, 6, 1};
        sortGivenArray(numbers);
    }

    private static void sortGivenArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }

}
