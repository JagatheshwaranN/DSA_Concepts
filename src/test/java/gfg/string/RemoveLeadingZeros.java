package gfg.string;

/**
 * Remove the leading zeros from the given string.
 * <p>
 * Input: 0000012345
 * Output: 12345
 * <p>
 * Using SubString
 * Using StringBuffer's Replace
 * Using Regex
 * Using ToCharArray
 */
@SuppressWarnings("All")
public class RemoveLeadingZeros {

    public static void main(String[] args) {
        String value = "000012345";
        removeZerosUsingSubString(value);
        removeZerosUsingStringBuffer(value);
        removeZerosUsingRegex(value);
        removeZerosUsingCharArray(value);
    }

    /**
     * Time Complexity: O(n) - The loop runs for n iterations, where n is the length
     * of the input string.
     * Space Complexity: O(n) - Substring creates a new string that holds the result.
     */
    private static void removeZerosUsingSubString(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        int index = 0;
        // This loop runs until a non-zero character is found, in the worst case it scans
        // the entire string.
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != '0') {
                index = i;
                break;
            }
        }
        // Substring creates a new string starting from the first non-zero index.
        input = input.substring(index);
        System.out.println(input);
    }

    /**
     * Time Complexity: O(n) - The while loop scans n characters, where n is the length
     * of the input string.
     * Space Complexity: O(n) - StringBuffer internally holds the entire input string.
     */
    private static void removeZerosUsingStringBuffer(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        int i = 0;
        // The while loop increments i until a non-zero character is found, worst case it
        // scans the entire string.
        while (i < input.length() && input.charAt(i) == '0')
            i++;
        // StringBuffer.replace modifies the input string in place, but no extra space beyond
        // the input string is needed.
        StringBuffer stringBuffer = new StringBuffer(input);
        stringBuffer.replace(0, i, "");
        System.out.println(stringBuffer);
    }

    /**
     * Time Complexity: O(n) - Regular expression internally iterates through the string.
     * Space Complexity: O(n) - A new string is created due to the replaceAll method.
     */
    private static void removeZerosUsingRegex(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        // Regex "^0+" matches leading zeros and replaces them with an empty string.
        input = input.replaceAll("^0+","");
        System.out.println(input);
    }

    /**
     * Time Complexity: O(n) - The loop iterates through the string once to find the first
     * non-zero character.
     * Space Complexity: O(n) - A new character array and string are created to hold the result.
     */
    private static void removeZerosUsingCharArray(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        char[] chars = input.toCharArray();
        int index = 0;
        while(index < chars.length && chars[index] == '0')
            index++;
        input = new String(chars, index, chars.length - index);
        System.out.println(input);
    }

}
