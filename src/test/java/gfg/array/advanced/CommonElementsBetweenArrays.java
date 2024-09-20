package gfg.array.advanced;

import java.util.*;

/**
 * Find the common elements between the two arrays.
 * <p>
 * Input: data1 = ["A", "B", "C", "D"], and data2 = ["A", "E", "C", "F"]
 * Output: [A, C] or A C
 * <p>
 * Using Iterative loop
 * Using Collections
 * Using HashMap
 */
@SuppressWarnings("All")
public class CommonElementsBetweenArrays {

    public static void main(String[] args) {
        String[] data1 = {"A", "B", "C", "D"};
        String[] data2 = {"A", "E", "C", "F"};
        findCommonElementsUsingLoop(data1, data2);

        String[] data3 = {"A", "B", "C", "D"};
        String[] data4 = {"A", "E", "C", "F"};
        findCommonElementsUsingCollections(data3, data4);

        String[] data5 = {"A", "B", "C", "D", "A"};
        String[] data6 = {"A", "E", "C", "F"};
        findCommonElementsUsingHashMap(data5, data6);
    }

    /**
     * The time complexity of the code is O(n * m), where n is the length of input1
     * and m is the length of input2. This is because we use a nested loop to compare
     * each element of input1 with each element of input2, resulting in n * m comparisons.
     * Additionally, adding elements to the HashSet is O(1) on average.
     * <p>
     * The space complexity is O(min(n, m)), where n is the length of input1 and m is
     * the length of input2. This is due to the use of a HashSet, which stores only
     * the common elements between the two input arrays.
     */
    private static void findCommonElementsUsingLoop(String[] input1, String[] input2) {
        Set<String> set = new HashSet<String>();
        if (input1.length == 0 || input2.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        for (int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input2.length; j++) {
                if (input1[i] == input2[j]) {
                    set.add(input1[i]);
                    break;
                }
            }
        }
        for (String val : set) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    /**
     * The time complexity of the code is O(n + m), where n is the length of input1
     * and m is the length of input2. This is because we convert both input arrays
     * to lists in O(n) and O(m) respectively, and then the retainAll() method iterates
     * over list1 and checks for common elements in list2, which on average takes O(n + m).
     * <p>
     * The space complexity is O(n + m), where n is the length of input1 and m is the
     * length of input2. This is because we create two new lists list1 and list2, each
     * having a length equal to input1 and input2, respectively.
     */
    private static void findCommonElementsUsingCollections(String[] input1, String[] input2) {
        Set<String> set = new HashSet<String>();
        if (input1.length == 0 || input2.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        List<String> list1 = new ArrayList<>(Arrays.asList(input1));
        List<String> list2 = new ArrayList<>(Arrays.asList(input2));
        list1.retainAll(list2);
        System.out.println(list1);
    }

    /**
     * The time complexity of the code is O(n + m), where n is the length of input1
     * and m is the length of input2. This is because the first loop iterates over input1
     * (n iterations), and the second loop iterates over input2 (m iterations), both
     * performing O(1) operations on average due to the use of a HashMap.
     * <p>
     * The space complexity is O(n), where n is the length of input1. This is because
     * the HashMap stores at most n unique elements from input1.
     */
    private static void findCommonElementsUsingHashMap(String[] input1, String[] input2) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (input1.length == 0 || input2.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        for (int i = 0; i < input1.length; i++) {
            if (hashMap.containsKey(input1[i])) {
                hashMap.put(input1[i], hashMap.get(input1[i]) + 1);
            } else {
                hashMap.put(input1[i], 1);
            }
        }
        for (int i = 0; i < input2.length; i++) {
            if (hashMap.containsKey(input2[i])) {
                hashMap.remove(input2[i]);
                System.out.print(input2[i] + " ");
            }
        }
    }

}
