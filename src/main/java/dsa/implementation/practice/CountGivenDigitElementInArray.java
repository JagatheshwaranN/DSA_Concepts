package dsa.implementation.practice;

@SuppressWarnings("ALL")
public class CountGivenDigitElementInArray {

    public static void main(String[] args) {
        int[] numbers = {123, 7845, 124, 78452, 1429};
        int target = 4;
        countElement(numbers, target);
    }

    private static void countElement(int[] input, int target) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 999 && input[i] < 9999) {
                count++;
            }
        }
        System.out.println("The " + target + " digit numbers in the array is " + count);
    }

}
