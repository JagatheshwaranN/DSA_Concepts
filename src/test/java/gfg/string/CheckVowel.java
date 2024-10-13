package gfg.string;

import java.util.HashSet;

/**
 * Find the given char is vowel or consonant.
 * <p>
 * Input: 'a'
 * Output: a is a vowel
 * Input: 'b'
 * Output: b is a consonant
 * <p>
 * Using the control statement
 * Using the hashset
 * Using the indexof and ternary operator
 */
@SuppressWarnings("All")
public class CheckVowel {

    public static void main(String[] args) {
        char value1 = 'a';
        char value2 = 'E';
        char value3 = 'b';
        checkCharIsVowelUsingControlStatement(value1);
        checkCharIsVowelUsingControlStatement(value2);
        checkCharIsVowelUsingControlStatement(value3);
        checkCharIsVowelUsingHashSet(value1);
        checkCharIsVowelUsingHashSet(value2);
        checkCharIsVowelUsingHashSet(value3);
        checkCharIsVowelUsingIndexAndTernary(value1);
        checkCharIsVowelUsingIndexAndTernary(value2);
        checkCharIsVowelUsingIndexAndTernary(value3);
    }

    /**
     * Time Complexity: O(1) - Constant time check with a few comparisons (up to 10
     * comparisons).
     * Space Complexity: O(1) - No extra space is used other than primitive variables.
     */
    private static void checkCharIsVowelUsingControlStatement(char input) {
        if (input == '\u0000') {
            System.out.println("Input is null.");
            return;
        }
        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' ||
                input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U') {
            System.out.println(input + " is a vowel");
            return;
        }
        System.out.println(input + " is a consonant");
    }

    /**
     * Time Complexity: O(1) - Constant time check since HashSet lookup is O(1) on average.
     * Space Complexity: O(1) - HashSet uses constant space as the set of vowels is fixed.
     */
    private static void checkCharIsVowelUsingHashSet(char input) {
        HashSet<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        vowelSet.add('A');
        vowelSet.add('E');
        vowelSet.add('I');
        vowelSet.add('O');
        vowelSet.add('U');

        if (input == '\u0000') {
            System.out.println("Input is null.");
            return;
        }
        if (vowelSet.contains(input)) {
            System.out.println(input + " is a vowel");
            return;
        }
        System.out.println(input + " is a consonant");
    }

    /**
     * Time Complexity: O(n), where n is 10, the size of the checker string. The indexOf method
     * goes through each character in the string to check for a match.
     * Space Complexity: O(1) - The space required is constant as we are not using additional
     * data structures.
     */
    private static void checkCharIsVowelUsingIndexAndTernary(char input) {
        if (input == '\u0000') {
            System.out.println("Input is null.");
            return;
        }
        String checker = "aeiouAEIOU";
        String result = checker.indexOf(input) != -1 ? "vowel" : "consonant";
        System.out.println(input + " is a " + result);
    }

}
