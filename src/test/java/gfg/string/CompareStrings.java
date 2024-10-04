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
 */
@SuppressWarnings("All")
public class CompareStrings {

    public static void main(String[] args) {
        String value1 = new String("Java");
        String value2 = new String("Java");
        String value3 = new String("java");
        String value4 = value1;
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

}
