package gfg.string;

/**
 * Print the even words in the given string.
 * <p>
 * Input: " This is a java session   for  beginners  choice"
 * Output: This
 *         is
 *         java
 *         choice
 * <p>
 * Using split() method
 * Using Own method
 */
public class PrintEvenLengthWords {

    public static void main(String[] args) {
        String value = " This is a java session   for  beginners  choice";
        printEvenWordsUsingSplit(value);
        printEventWordsUsingOwnApproach(value);
    }

    /**
     * Time Complexity: O(n) - Where n is the length of the input string.
     * The trim() operation runs in O(n), split() iterates through the string
     * and creates an array of words, which is also O(n), and the for-loop iterates
     * through each word in the array, which is O(w), where w is the number of words.
     * Overall, these are linear operations dominated by O(n).
     * Space Complexity: O(n) - The array of words created by split() will take O(n)
     * space, where n is the total number of characters in the string.
     * Each word reference in the array is pointing to parts of the original string.
     */
    private static void printEvenWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        String[] words = input.trim().split("\\s+");
        for (String word : words) {
            if (word.length() % 2 == 0)
                System.out.println(word);
        }
    }

    /**
     * Time Complexity: O(n) - Where n is the length of the input string. We traverse the string
     * exactly once, checking each character and building words on the fly.
     * Space Complexity: O(1) - We don't use any additional data structures that grow with input
     * size, except for temporary variables to store words.
     */
    private static void printEventWordsUsingOwnApproach(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        int wordStart = -1;
        int length = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isWhitespace(ch)) {
                if (wordStart != -1 && length % 2 == 0)
                    System.out.println(input.substring(wordStart, i));
                wordStart = -1;
                length = 0;
            } else {
                if (wordStart == -1)
                    wordStart = i;
                length++;
            }
        }
        if (wordStart != -1 && length % 2 == 0)
            System.out.println(input.substring(wordStart));
    }

}
