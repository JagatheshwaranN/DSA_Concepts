package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("All")
public class CountDigitInGivenString {

    public static void main(String[] args) {
        String[] words = {"7sad9", "hgds99", "hfd7#81"};
        countDigitsUsingCharacter(words);
        countDigitsUsingCondition(words);
        countDigitsUsingRegex(words);
    }

    // Approach 1
    private static void countDigitsUsingCharacter(String[] words) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (Character.isDigit(words[i].charAt(j))) {
                    count++;
                }
            }
            result.add(count);
        }
        System.out.println(result);
    }

    // Approach 2
    private static void countDigitsUsingCondition(String[] words) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                if (ch >= '0' && ch <= '9') {
                    count++;
                }
            }
            result.add(count);
        }
        System.out.println(result);
    }

    // Approach 3
    private static void countDigitsUsingRegex(String[] words) {
        List<Integer> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d");
        for(String word : words){
            Matcher matcher = pattern.matcher(word);
            int count = 0;
            while(matcher.find()){
                count++;
            }
            result.add(count);
        }
        System.out.println(result);
    }

}
