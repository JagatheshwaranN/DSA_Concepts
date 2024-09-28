package gfg.string;

import java.util.Arrays;

@SuppressWarnings("All")
public class SortString {

    public static void main(String[] args) {
        String value = "JavaProgram";
        sortString(value);
        sortStringUsingSort(value);
        sortStringUsingCustomSort(value);
    }

    // Time Complexity: O(n^2) - The bubble sort implementation has a nested loop
    // where n is the length of the string, leading to n * (n-1) / 2 comparisons.
    // Space Complexity: O(n) - A character array of size n is created.
    private static void sortString(String input) {
        if (input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        input = input.toLowerCase(); // O(n) - Converting the string to lowercase
        char[] inputCharArray = input.toCharArray(); // O(n) - Creating a char array
        for (int i = 0; i < inputCharArray.length; i++) {
            boolean swap = false;
            for (int j = 0; j < inputCharArray.length - i - 1; j++) {
                if (inputCharArray[j] > inputCharArray[j + 1]) {
                    swap = true;
                    // Swap the characters
                    char temp = inputCharArray[j];
                    inputCharArray[j] = inputCharArray[j + 1];
                    inputCharArray[j + 1] = temp;
                }
            }
            if (!swap) {
                break; // If no swap, the array is sorted, early exit
            }
        }
        System.out.println(new String(inputCharArray)); // O(n) - Converting the char array to a string
    }

    // Time Complexity: O(n log n) - Arrays.sort() uses a Dual-Pivot Quicksort, which has
    // an average time complexity of O(n log n) where n is the length of the array.
    // Space Complexity: O(n) - A new character array of size n is created.
    private static void sortStringUsingSort(String input) {
        if (input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        input = input.toLowerCase(); // O(n) - Converting the string to lowercase
        char[] charArray = input.toCharArray(); // O(n) - Creating a char array
        Arrays.sort(charArray); // O(n log n) - Sorting the array using Dual-Pivot Quicksort
        System.out.println(Arrays.toString(charArray)); // O(n) - Printing the sorted array
    }

    // Time Complexity: O(n log n) - Arrays.sort() with a custom comparator still uses
    // Dual-Pivot Quicksort, so sorting has an average time complexity of O(n log n).
    // Space Complexity: O(n) - The custom sort creates several objects and arrays,
    // including the Character array, StringBuffer, and the original string.
    private static void sortStringUsingCustomSort(String input) {
        if (input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        Character[] characters = new Character[input.length()]; // O(n) - Creating a Character array
        for (int i = 0; i < characters.length; i++) {
            characters[i] = input.charAt(i); // O(n) - Filling the array with characters
        }
        Arrays.sort(characters, (c1, c2) -> Character.compare(Character.toLowerCase(c1), Character.toLowerCase(c2)));
        // O(n log n) - Sorting the Character array using a custom comparator (Dual-Pivot Quicksort)

        StringBuffer stringBuffer = new StringBuffer(characters.length); // O(n) - Creating a StringBuffer
        for (Character c : characters) {
            stringBuffer.append(c); // O(n) - Appending sorted characters
        }
        System.out.println(stringBuffer.toString()); // O(n) - Converting StringBuffer to String
    }

}
