package lc.array.medium;

import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer
 * in any order.
 * <p>
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * <p>
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 * <p>
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        //String[] strings = {""};
        System.out.println(groupAnagrams(strings));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramGroup = new HashMap<>();
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        if (strs.length == 1 && Objects.equals(strs[0], "")) {
            return new ArrayList<>(List.of(Collections.singletonList(strs[0])));
        }
        for (String val : strs) {
            char[] ch = val.toCharArray();
            Arrays.sort(ch);
            String group = new String(ch);
            anagramGroup.putIfAbsent(group, new ArrayList<>());
            anagramGroup.get(group).add(val);
        }
        return new ArrayList<List<String>>(anagramGroup.values());
    }

    public static List<List<String>> groupAnagrams1(String[] strs) {
        HashMap<String, List<String>> anagramGroup = new HashMap<>();
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        if (strs.length == 1 && Objects.equals(strs[0], "")) {
            return new ArrayList<>(List.of(Collections.singletonList(strs[0])));
        }
        for (String val : strs) {
            int[] freq = new int[26];
            for (char c : val.toCharArray()) {
                freq[c - 'a']++;
            }
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : freq) {
                keyBuilder.append("#").append(count);
            }
            String key = keyBuilder.toString();
            if (!anagramGroup.containsKey(key)) {
                anagramGroup.put(key, new ArrayList<>());
            }
            anagramGroup.get(key).add(val);
        }
        return new ArrayList<List<String>>(anagramGroup.values());
    }

}
