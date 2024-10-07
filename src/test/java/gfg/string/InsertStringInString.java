package gfg.string;

/**
 * Insert the given string to the original string.
 * <p>
 * Input: Java Beginners
 * Output: Java For Beginners
 * <p>
 * Using custom method
 * Using substring method
 * Using StringBuffer's insert method
 */
@SuppressWarnings("All")
public class InsertStringInString {

    public static void main(String[] args) {
        String value = "Java Beginners";
        String toInsert = "For ";
        int index = 5;
        insertString(value, toInsert, index);
        insertStringUsingSubString(value, toInsert, index);
        insertStringUsingStrBufInsert(value, toInsert, index);
    }

    /**
     * Time Complexity: O(n + m) - Where n is the length of the input string and m is the length of
     * the string to be inserted. We iterate through the input string and perform concatenation, which
     * takes O(n + m).
     * Space Complexity: O(n + m) - A new string is created with n + m characters in the worst case.
     */
    private static void insertString(String input, String toInsert, int index) {
        if(input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        String newString = new String();
        for(int i = 0; i < input.length(); i++) {
            newString += input.charAt(i);
            if(i == index - 1){
                newString += toInsert;
            }
        }
        System.out.println(newString);
    }

    /**
     * Time Complexity: O(n + m) - The substring operation takes O(n) time and concatenation of
     * substrings and the inserted string takes O(n + m), where n is the input length and m is
     * the length of the string to be inserted.
     * Space Complexity: O(n + m) - Two new substrings and the inserted string require space
     * proportional to n + m.
     */
    private static void insertStringUsingSubString(String input, String toInsert, int index) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        input = input.substring(0, index) + toInsert + input.substring(index);
        System.out.println(input);
    }

    /**
     * Time Complexity: O(n + m) - StringBuffer's `insert` method is O(n), where n is the length
     * of the input, plus m for the string to be inserted.
     * Space Complexity: O(n + m) - The StringBuffer internally allocates space proportional to
     * n + m (length of the result).
     */
    private static void insertStringUsingStrBufInsert(String input, String toInsert, int index) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer(input);
        stringBuffer.insert(index, toInsert);
        System.out.println(stringBuffer);
    }

}
