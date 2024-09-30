package gfg.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Find the given string is pangram.
 * <p>
 * Input1: The quick brown fox jumps over the lazy dog
 * Output1: true
 * Input2: The quick brown fox jumps over
 * Output2: false
 * <p>
 * Using Array
 * Using Set
 */
@SuppressWarnings("All")
public class PangramString {

    public static void main(String[] args) {
        String value = "The quick brown fox jumps over the lazy dog";
        System.out.println(testPangramUsingArray(value, value.length()));
        System.out.println(testPangramUsingSet(value));
    }

    /**
     * Time Complexity: O(n) - We iterate over the input string twice:
     * once to populate the boolean array and once to check all the letters.
     * Space Complexity: O(1) - The boolean array size is fixed (26), so it's constant space,
     * regardless of the input size. We also use O(n) space for the temporary lowercase string.
     */
    private static boolean testPangramUsingArray(String input, int length) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return false;
        }
        int size = 26;
        boolean[] present = new boolean[size];
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (isLetter(input.charAt(i))) {
                int letter = input.charAt(i) - 'a';
                present[letter] = true;
            }
        }
        for (int i = 0; i < size; i++) {
            if (!present[i])
                return false;
        }
        return true;
    }

    private static boolean isLetter(char ch) {
        return Character.isLetter(ch);
    }

    /**
     * Time Complexity: O(n) - We iterate over the input string once while
     * adding characters to the Set and checking the Set's size.
     * Space Complexity: O(1) - The Set contains at most 26 characters (constant space),
     * and we also use O(n) space for the temporary lowercase string.
     */
    private static boolean testPangramUsingSet(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return false;
        }
        Set<Character> letters = new HashSet<>();
        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }
        return letters.size() == 26;
    }

}
