package dsa.implementation.practice;

@SuppressWarnings("ALL")
public class MaxElementInArray {

    public static void main(String[] args) {
        int[] numbers = {5, 9, 8, 6, 1};
        findMax(numbers);
    }

    private static void findMax(int[] input) {
        int max = input[0];
        for(int i = 1; i < input.length; i++){
            if(input[i] > max){
                max = input[i];
            }
        }
        System.out.println(max);
    }

}
