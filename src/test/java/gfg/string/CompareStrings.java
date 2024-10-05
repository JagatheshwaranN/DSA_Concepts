package gfg.string;

import java.util.Objects;

/**
 * Compare the given 2 strings.
 * <p>
 * Input1: Java
 * Input2: Java
 * Input3: java
 * Output1: Java and Java are equal.
 * Output2: Java and Java are not equal.
 * Output3: Java and java are not equal.
 * Output4: Java and java are equal.
 * <p>
 * Using == Operator
 * Using equals()
 * Using equalsIgnoreCase()
 * Using Objects.equals()
 * Using compareTo()
 * Using contentEquals()
 * Using userdefined method
 */
@SuppressWarnings("All")
public class CompareStrings {

    public static void main(String[] args) {
        String value1 = new String("Java");
        String value2 = new String("Java");
        String value3 = new String("java");
        String value4 = value1;
        String value5 = new String("Program");
        String value6 = new String("JavaProgram");
        compareStringsUsingEqualToOps(value1, value2);
        compareStringsUsingEqualToOps(value1, value3);
        compareStringsUsingEqualToOps(value1, value4);
        compareStringsUsingEquals(value1, value2);
        compareStringsUsingEquals(value1, value3);
        compareStringsUsingEqualsIgnoreCase(value1, value2);
        compareStringsUsingEqualsIgnoreCase(value1, value3);
        compareStringsUsingObjects(value1, value2);
        compareStringsUsingObjects(value1, value3);
        compareStringsUsingCompareTo(value1, value2);
        compareStringsUsingCompareTo(value1, value3);
        compareStringsUsingContentEquals(value1, value2);
        compareStringsUsingContentEquals(value1, value3);

        System.out.println(compareStringsLexicoGraphicallyUsingOwn(value1,
                value2));
        System.out.println(compareStringsLexicoGraphicallyUsingOwn(value1,
                value3));
        System.out.println(compareStringsLexicoGraphicallyUsingOwn(value1,
                value4));
        System.out.println(compareStringsLexicoGraphicallyUsingOwn(value1,
                value5));
        System.out.println(compareStringsLexicoGraphicallyUsingOwn(value5,
                value1));
        System.out.println(compareStringsLexicoGraphicallyUsingOwn(value5,
                value6));
        System.out.println(compareStringsLexicoGraphicallyUsingOwn(value1,
                value6));
    }

    /**
     * Time Complexity: O(1) - The '==' operator compares references in constant time.
     * Space Complexity: O(1) - No additional space is used beyond the input.
     */
    private static void compareStringsUsingEqualToOps(String input1, String input2) {
        if (input1 == null || input2 == null || input1.isEmpty() || input2.isEmpty()) {
            System.out.println("Anyone of inputs is null.");
            return;
        }
        if (input1 == input2) {
            System.out.println(input1 + " and " + input2 + " are equal.");
        } else {
            System.out.println(input1 + " and " + input2 + " are not equal.");
        }
    }

    /**
     * Time Complexity: O(n) - The equals method compares each character in both strings,
     * where n is the length of the strings.
     * Space Complexity: O(1) - No additional space is used beyond the input.
     */
    private static void compareStringsUsingEquals(String input1, String input2) {
        if (input1 == null || input2 == null || input1.isEmpty() || input2.isEmpty()) {
            System.out.println("Anyone of inputs is null.");
            return;
        }
        if (input1.equals(input2)) {
            System.out.println(input1 + " and " + input2 + " are equal.");
        } else {
            System.out.println(input1 + " and " + input2 + " are not equal.");
        }
    }

    /**
     * Time Complexity: O(n) - The equalsIgnoreCase method compares each character in both
     * strings (case-insensitive), where n is the length of the strings.
     * Space Complexity: O(1) - No additional space is used beyond the input.
     */
    private static void compareStringsUsingEqualsIgnoreCase(String input1, String input2) {
        if (input1 == null || input2 == null || input1.isEmpty() || input2.isEmpty()) {
            System.out.println("Anyone of inputs is null.");
            return;
        }
        if (input1.equalsIgnoreCase(input2)) {
            System.out.println(input1 + " and " + input2 + " are equal.");
        } else {
            System.out.println(input1 + " and " + input2 + " are not equal.");
        }
    }

    /**
     * Time Complexity: O(n) - The Objects.equals method internally calls String.equals,
     * which compares each character in both strings.
     * Space Complexity: O(1) - No additional space is used beyond the input.
     */
    private static void compareStringsUsingObjects(String input1, String input2) {
        if (input1 == null || input2 == null || input1.isEmpty() || input2.isEmpty()) {
            System.out.println("Anyone of inputs is null.");
            return;
        }
        if (Objects.equals(input1, input2)) {
            System.out.println(input1 + " and " + input2 + " are equal.");
        } else {
            System.out.println(input1 + " and " + input2 + " are not equal.");
        }
    }

    /**
     * Time Complexity: O(n) - The compareTo method compares characters lexicographically,
     * so it needs to go through each character until a difference is found.
     * Space Complexity: O(1) - No additional space is used beyond the input.
     */
    private static void compareStringsUsingCompareTo(String input1, String input2) {
        if (input1 == null || input2 == null || input1.isEmpty() || input2.isEmpty()) {
            System.out.println("Anyone of inputs is null.");
            return;
        }
        if (input1.compareTo(input2) == 0) {
            System.out.println(input1 + " and " + input2 + " are equal.");
        } else {
            System.out.println(input1 + " and " + input2 + " are not equal.");
        }
    }

    /**
     * Time Complexity: O(n) - Comparison of characters takes O(n) time, where n is the length
     * of the longer string.
     * Space Complexity: O(n) - A new StringBuffer is created with the same length as input2.
     */
    private static void compareStringsUsingContentEquals(String input1, String input2) {
        if (input1 == null || input2 == null || input1.isEmpty() || input2.isEmpty()) {
            System.out.println("Anyone of inputs is null.");
            return;
        }
        if (input1.contentEquals(new StringBuffer(input2))) {
            System.out.println(input1 + " and " + input2 + " are equal.");
        } else {
            System.out.println(input1 + " and " + input2 + " are not equal.");
        }
    }

    /**
     * Compares two strings lexicographically using custom logic.
     *
     * Time Complexity: O(min(n, m))
     * - where n is the length of input1 and m is the length of input2.
     * - In the worst case, the loop iterates over the smaller length of the two strings.
     * - Each character comparison is O(1), so the overall complexity is determined by the minimum length of the strings.
     *
     * Space Complexity: O(1)
     * - No additional data structures are used apart from a few primitive variables.
     * - Hence, space complexity is constant.
     */
    private static int compareStringsLexicoGraphicallyUsingOwn(String input1, String input2) {
        if (input1 == null || input2 == null || input1.isEmpty() || input2.isEmpty()) {
            System.out.println("Anyone of inputs is null.");
            return -1;
        }
        for (int i = 0; i < input1.length() && i < input2.length(); i++) {
            if ((int) input1.charAt(i) == (int) input2.charAt(i)) {
                continue;
            } else {
                return (int) input1.charAt(i) - (int) input2.charAt(i);
            }
        }
        if (input1.length() < input2.length()) {
            return input1.length() - input2.length();
        } else if (input1.length() > input2.length()) {
            return input1.length() - input2.length();
        } else {
            return 0;
        }
    }

}
