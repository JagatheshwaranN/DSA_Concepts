package gfg.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Print the first letter of each word in a String.
 * <p>
 * Input1: Java Program for Beginners
 * Output1: JPfB
 * Input2: Your passkey is 2abc
 * Output2: Ypi
 * <p>
 * Using Regex
 * Using CharAt
 * Using Substring
 */
@SuppressWarnings("All")
public class PrintFirstLetterEachWordInString {

    public static void main(String[] args) {
        String value1 = "Java Program for Beginners";
        String value2 = "Your passkey is 2abc";
        getFirstLetterUsingRegex(value1);
        getFirstLetterUsingRegex(value2);
        getFirstLetterUsingCharAt(value1);
        getFirstLetterUsingCharAt(value2);
        getFirstLetterUsingSubString(value1);
        getFirstLetterUsingSubString(value2);
    }

    /**
     * Time Complexity: O(n) - We iterate over the input string once where n is the length
     * of the input. The regex matcher scans the entire string, but it checks each character
     * once.
     * Space Complexity: O(1) - No extra space is used, except for the pattern and matcher
     * objects which do not scale with input size.
     */
    private static void getFirstLetterUsingRegex(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find())
            System.out.print(matcher.group());
        System.out.println();
    }

    /**
     * Time Complexity: O(n) - We split the input string into words, which is O(n) where n is the
     * length of the input. Then we iterate over the resulting words array once.
     * Space Complexity: O(n) - The split method creates an array of words, which occupies space
     * proportional to the input length.
     */
    private static void getFirstLetterUsingCharAt(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        String[] words = input.split("\\s+");
        for (String word : words) {
            if (Character.isLetter(word.charAt(0))) // Constant time check for each word
                System.out.print(word.charAt(0));
        }
        System.out.println();
    }

    /**
     * Time Complexity: O(n) - Similar to the previous method, we split the string into words, which
     * is O(n), and iterate through the array. Each substring(0, 1) operation is constant time.
     * Space Complexity: O(n) - The space complexity is determined by the array of words created during
     * the split operation.
     */
    private static void getFirstLetterUsingSubString(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        String[] words = input.split("\\s+");
        for (String word : words) {
            if (!Character.isDigit(word.charAt(0))) // Constant time check for each word
                System.out.print(word.substring(0, 1));
        }
        System.out.println();
    }

}
