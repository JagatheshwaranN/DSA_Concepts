package gfg.string;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 * Find the ASCII value for the given string.
 * <p>
 * Input: Java
 * Output: 74 97 118 97
 * <p>
 * Using TypeCasting
 * Using CodePointAt
 * Using ByteBuffer
 */
@SuppressWarnings("All")
public class ASCIIValue {

    public static void main(String[] args) {
        String value = "Java";
        getASCIIValueUsingTypeCast(value);
        getASCIIValueUsingCodePointAt(value);
        getASCIIValueUsingByteBuffer(value);
    }

    /**
     * Time Complexity: O(n) - We iterate over all characters of the string (n = input length).
     * Space Complexity: O(n) - The input string is converted to a char array which takes up
     * space proportional to n.
     */
    private static void getASCIIValueUsingTypeCast(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        char[] inputArr = input.toCharArray(); // O(n) space for the array
        for (char c : inputArr) {
            System.out.print((int) c + " "); // O(1) for each character's ASCII conversion
        }
        System.out.println();
    }

    /**
     * Time Complexity: O(n) - We loop through all characters of the string (n = input length).
     * Space Complexity: O(1) - We only use constant space for the index variable (no extra
     * space for character storage).
     */
    private static void getASCIIValueUsingCodePointAt(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.codePointAt(i) + " "); // O(1) to get the code point at each index
        }
        System.out.println();
    }

    /**
     * Time Complexity: O(n) - We iterate through each character and encode it to
     * ASCII (n = input length).
     * Space Complexity: O(n) - For each character, we create a ByteBuffer which takes
     * space proportional to the number of characters.
     */
    private static void getASCIIValueUsingByteBuffer(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        for (char c : input.toCharArray()) { // O(n) space for the char array
            ByteBuffer byteBuffer = Charset.forName("US-ASCII").encode(String.valueOf(c)); // O(1) to encode each character
            System.out.print(byteBuffer.get() + " "); // O(1) to retrieve the ASCII value
        }
        System.out.println();
    }

}
