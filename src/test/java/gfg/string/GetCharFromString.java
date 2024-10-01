package gfg.string;

/**
 * Find the character from the given string using index.
 * Input: JavaProgram, 5
 * Output: r
 * <p>
 * Using CharAt()
 * Using toCharArray()
 * Using Streams
 * Using codePointAt()
 * Using getChars()
 */
@SuppressWarnings("ALL")
public class GetCharFromString {

    public static void main(String[] args) {
        String value = "JavaProgram";
        int index = 5;
        getCharFromStringUsingCharAt(value, index);
        getCharFromStringUsingCharArr(value, index);
        getCharFromStringUsingStreams(value, index);
        getCharFromStringUsingCodePointAt(value, index);
        getCharFromStringUsingGetChars(value, index);
    }

    /**
     * Time Complexity: O(1) - Accessing a single character takes constant time.
     * Space Complexity: O(1) - No extra space used.
     */
    private static void getCharFromStringUsingCharAt(String input, int target) {
        if (input.isEmpty()) {
            System.out.println("Input is empty.");
            return;
        }
        System.out.println(input.charAt(target));
    }

    /**
     * Time Complexity: O(n) - The entire string is converted to a char array, where n
     * is the length of the string.
     * Space Complexity: O(n) - A char array of size n is created.
     */
    private static void getCharFromStringUsingCharArr(String input, int target) {
        if (input.isEmpty()) {
            System.out.println("Input is empty.");
            return;
        }
        System.out.println(input.toCharArray()[target]);
    }

    /**
     * Time Complexity: O(n) - The string is converted to an IntStream and then mapped
     * to an array.
     * Space Complexity: O(n) - An array of size n (where n is the length of the string)
     * is created.
     */
    private static void getCharFromStringUsingStreams(String input, int target) {
        if (input.isEmpty()) {
            System.out.println("Input is empty.");
            return;
        }
        Character character = input.chars().mapToObj(ch -> (char) ch).toArray(Character[]::new)[target];
        System.out.println(character);
    }

    /**
     * Time Complexity: O(1) - codePointAt method accesses a character at the specified index
     * in constant time.
     * Space Complexity: O(1) - No extra space used.
     */
    private static void getCharFromStringUsingCodePointAt(String input, int target) {
        if (input.isEmpty()) {
            System.out.println("Input is empty.");
            return;
        }
        System.out.println((char) input.codePointAt(target));
    }

    /**
     * Time Complexity: O(1) - getChars only extracts one character from the string.
     * Space Complexity: O(1) - A char array of size 1 is created.
     */
    private static void getCharFromStringUsingGetChars(String input, int target) {
        if (input.isEmpty()) {
            System.out.println("Input is empty.");
            return;
        }
        char[] chars = new char[1];
        input.getChars(target, target + 1, chars, 0);
        System.out.println(chars[0]);
    }

}
