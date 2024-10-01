package gfg.string;

/**
 * Swap the pair of chars in given string.
 * <p>
 * Input1: java
 * Output1: ajav
 * Input2: java programs
 * Output2: ajavp orrgmas
 * <p>
 * Using Iterative method
 * Using StringBuffer
 */
@SuppressWarnings("All")
public class SwapPairOfChars {

    public static void main(String[] args) {
        String value1 = "java";
        String value2 = "java programs";
        swapCharsUsingLoop(value1);
        swapCharsUsingLoop(value2);
        swapCharsUsingStringBuffer(value1);
        swapCharsUsingStringBuffer(value2);
    }

    /**
     * Time Complexity: O(n) - The loop iterates over half of the input string (n/2).
     * Space Complexity: O(n) - A new char array of size n is created to store swapped characters.
     */
    private static void swapCharsUsingLoop(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        char[] inputCharArray = input.toCharArray();
        for (int i = 0; i < inputCharArray.length - 1; i += 2) {
            char temp = inputCharArray[i];
            inputCharArray[i] = inputCharArray[i + 1];
            inputCharArray[i + 1] = temp;
        }
        System.out.println(new String(inputCharArray));
    }

    /**
     * Time Complexity: O(n) - The loop iterates over half of the input string (n/2).
     * Space Complexity: O(n) - StringBuffer is used with size proportional to the input string.
     */
    private static void swapCharsUsingStringBuffer(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        int len = input.length();
        StringBuffer sb = new StringBuffer(len);
        for (int i = 0; i < len - 1; i += 2) {
            sb.append(input.charAt(i + 1)).append(input.charAt(i));
        }
        if (len % 2 != 0) {
            sb.append(input.charAt(len - 1));
        }
        System.out.println(sb.toString());
    }

}
