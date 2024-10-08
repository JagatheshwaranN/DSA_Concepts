package gfg.string;

import java.util.ArrayList;

/**
 * Find all the substrings of the given string.
 * <p>
 * Input: cat
 * Output: [c, ca, cat, a, at, t]
 * <p>
 * Using substring method
 */
@SuppressWarnings("All")
public class PrintSubStringsOfString {

    public static void main(String[] args) {
        String value = "The Watch";
//        ArrayList<String> result = subStringsOfString(value);
//        System.out.println(result);
//        int count = 1;
//        assert result != null;
//        for (String substring : result) {
//            System.out.println("(" + count + ") "+ substring);
//            count++;
//        }
        subStringsOfStringWithoutStoringValues(value);
    }

    /**
     * Time Complexity: O(n^3)
     * - Outer loop runs n times.
     * - Inner loop runs on average (n - i) times, which leads to a total of n * (n + 1) / 2 substrings.
     * - Generating a substring takes O(k), where k is the length of the substring, leading to
     * a total of O(n^3) operations since all substrings combined have a quadratic length.
     * <p>
     * Space Complexity: O(n^3)
     * - Substrings are stored in the list. The total number of substrings is approximately n * (n + 1) / 2,
     * and the space for each substring is proportional to its length.
     * - Thus, the total space required for storing all substrings is O(n^3).
     */
    private static ArrayList<String> subStringsOfString(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return null;
        }
        ArrayList<String> subStringList = new ArrayList<>();
        int i, j;
        for (i = 0; i < input.length(); i++) {
            for (j = i + 1; j <= input.length(); j++) {
                subStringList.add(input.substring(i, j));
            }
        }
        return subStringList;
    }

    /**
     * Time Complexity: Still O(n^3) (due to generating substrings), but you save on space.
     * Space Complexity: O(1) Here we don’t store the substrings and only process them as we
     * generate them.
     */
    private static void subStringsOfStringWithoutStoringValues(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null.");
            return;
        }
        ArrayList<String> subStringList = new ArrayList<>();
        int i, j;
        for (i = 0; i < input.length(); i++) {
            for (j = i + 1; j <= input.length(); j++) {
                System.out.println("Substring: [" + i + ", " + (j - 1) + "] -> " + input.substring(i, j));
            }
        }
    }


}
