package dsa.revise.common;

import java.util.Arrays;

public class SearchNumberAlgorithm3 {

    static int count = 0;

    public static void main(String[] args) {
        int[] numbers = new int[10000000];
        int searchNumber = 9999996;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));
        long startTime = System.currentTimeMillis();
        int number = findNumber(numbers, 0, numbers.length - 1, searchNumber);
        System.out.printf("%d is found at %d attempt%n", number, count);
        long endTime = System.currentTimeMillis();
        System.out.printf("%d is found in %d ms%n", searchNumber, endTime - startTime);
    }

    static int findNumber(int[] numberCollection, int start, int end, int searchNumber) {
        count++;
        if (end >= start) {
            int midPosition = start + (end - start) / 2;
            if (numberCollection[midPosition] == searchNumber) {
                return midPosition;
            } else if (numberCollection[midPosition] > searchNumber) {
                return findNumber(numberCollection, start, midPosition - 1, searchNumber);
            } else {
                return findNumber(numberCollection, midPosition + 1, end, searchNumber);
            }
        }
        return -1;
    }

}
