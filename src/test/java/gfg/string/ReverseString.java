package gfg.string;

import java.util.*;

/**
 * Reverse the given string.
 * Input: Java Program
 * Output: margorP avaJ
 * <p>
 * Using charAt()
 * Using toCharArray()
 * Using StringBuffer reverse()
 * Using StringBuilder reverse()
 * Using GetBytes()
 * Using ArrayList()
 * Using Stack()
 */
@SuppressWarnings("All")
public class ReverseString {

    public static void main(String[] args) {
        String value = "Java Program";
        reverseStringUsingCharAt(value);
        reverseStringUsingToCharArray(value);
        reverseStringUsingStringBuffer(value);
        reverseStringUsingStringBuilder(value);
        reverseStringUsingBytes(value);
        reverseStringUsingList(value);
        reverseStringUsingStack(value);
    }

    // Time Complexity: O(n) - The loop iterates over the string in reverse, processing each
    // character once.
    // Space Complexity: O(n) - A new string is created and continuously appended with
    // characters.
    private static void reverseStringUsingCharAt(String input) {
        if (input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i); // String concatenation takes O(n) due to immutable strings
        }
        System.out.println(reverse);
    }

    // Time Complexity: O(n) - The loop iterates over the input array in reverse, and String
    // concatenation occurs.
    // Space Complexity: O(n) - A new char array and string are created, taking space proportional
    // to the input size.
    private static void reverseStringUsingToCharArray(String input) {
        if (input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        char[] inputArray = input.toCharArray(); // O(n) time, O(n) space to create the char array
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += inputArray[i]; // String concatenation, O(n) overhead
        }
        System.out.println(reverse);
    }

    // Time Complexity: O(n) - The reverse method iterates over the string once to reverse it.
    // Space Complexity: O(n) - A new reversed string is created, proportional to the input size.
    private static void reverseStringUsingStringBuffer(String input) {
        if (input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer(input);
        System.out.println(stringBuffer.reverse().toString()); // O(n) time, O(n) space
    }

    // Time Complexity: O(n) - The reverse method iterates over the string once to reverse it.
    // Space Complexity: O(n) - A new reversed string is created, proportional to the input size.
    private static void reverseStringUsingStringBuilder(String input) {
        if (input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(input);
        System.out.println(stringBuilder.reverse().toString()); // O(n) time, O(n) space
    }

    // Time Complexity: O(n) - The loop iterates over the byte array to reverse it.
    // Space Complexity: O(n) - Two byte arrays (original and reversed) and a new string are created.
    private static void reverseStringUsingBytes(String input) {
        if (input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        byte[] inputAsByteArray = input.getBytes(); // O(n) time and O(n) space to create byte array
        byte[] reverse = new byte[inputAsByteArray.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = inputAsByteArray[inputAsByteArray.length - i - 1];
        }
        System.out.println(new String(reverse)); // O(n) to create a new string
    }

    // Time Complexity: O(n) - The list is populated and reversed in O(n) time.
    // Space Complexity: O(n) - A list and a new char array of size n are used to store the input
    // and the reversed string.
    private static void reverseStringUsingList(String input) {
        if (input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        char[] inputCharArray = input.toCharArray(); // O(n) time, O(n) space
        List<Character> characterList = new ArrayList<>();
        for (char c : inputCharArray) {
            characterList.add(c);
        }
        Collections.reverse(characterList); // O(n) time to reverse the list
        ListIterator<Character> characterListIterator = characterList.listIterator();
        while (characterListIterator.hasNext()) {
            System.out.print(characterListIterator.next());
        }
        System.out.println();
    }

    // Time Complexity: O(n) - The stack is populated and then processed in O(n) time.
    // Space Complexity: O(n) - The stack uses O(n) space to store the characters, and a new
    // string is created for the reverse.
    private static void reverseStringUsingStack(String input) {
        if (input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        Stack<Character> characterStack = new Stack<>();
        String reverse = "";
        for (char c : input.toCharArray()) {
            characterStack.push(c); // O(n) time and space to push characters
        }
        while (!characterStack.isEmpty()) {
            reverse += characterStack.pop(); // String concatenation, O(n) overhead
        }
        System.out.println(reverse);
    }

}
