package dsa.implementation.practice;

@SuppressWarnings("All")
public class CountIntegerOccurrenceInArray {

    public static void main(String[] args) {
        int[] numbers = {12, 4, 7, 11, 3, 5, 4, 15, 17};
        int target = 4;
        countOccurrence(numbers, target);
    }

    private static void countOccurrence(int[] input, int target) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == target) {
                count++;
            }
        }
        System.out.println("'" + target + "'" + " occurance in the array is " + count);
    }

}
