package gfg.string;

@SuppressWarnings("All")
public class ReplaceCharInString {

    public static void main(String[] args) {
        String value = "Java gor Testers";
        int index = 5;
        char ch = 'f';
        replaceCharUsingSubString(value, index, ch);
        replaceCharUsingSBFSetChar(value, index, ch);
        replaceCharUsingSBDSetChar(value, index, ch);
    }

    // Time Complexity: O(n) - Substring operations create new strings, where n is the
    // length of the input string.
    // Space Complexity: O(n) - Two new strings are created (one for each substring),
    // resulting in extra space usage proportional to the length of the input.
    private static void replaceCharUsingSubString(String input, int target, char val) {
        if (input.isEmpty()) {
            System.out.println("Input is empty.");
            return;
        }
        input = input.substring(0, target) + val + input.substring(target + 1);
        System.out.println(input);
    }

    // Time Complexity: O(n) - Creating a StringBuffer from the input string takes O(n),
    // but modifying the character using setCharAt is O(1).
    // Space Complexity: O(n) - A new StringBuffer is created, which requires space
    // proportional to the length of the input string.
    private static void replaceCharUsingSBFSetChar(String input, int target, char val) {
        if (input.isEmpty()) {
            System.out.println("Input is empty.");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer(input);
        stringBuffer.setCharAt(target, val);
        System.out.println(stringBuffer);
    }

    // Time Complexity: O(n) - Creating a StringBuilder from the input string takes O(n),
    // but modifying the character using setCharAt is O(1).
    // Space Complexity: O(n) - A new StringBuilder is created, which requires space
    // proportional to the length of the input string.
    private static void replaceCharUsingSBDSetChar(String input, int target, char val) {
        if (input.isEmpty()) {
            System.out.println("Input is empty.");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.setCharAt(target, val);
        System.out.println(stringBuilder);
    }

}
