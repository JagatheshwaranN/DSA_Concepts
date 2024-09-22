package gfg.array.search_sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

@SuppressWarnings("All")
public class SortArray {

    public static void main(String[] args) {
        int[] numbers1 = {-7, -2, -5, 9, 4, 8, 5};
        arraySort(numbers1);
        char[] values = {'C', 'S', 'K', 'D', 'E', 'B'};
        arraySort(values);
        int[] numbers2 = {-5, -7, -11, 8, 4, 2, 1};
        int from = 1;
        int to = 5;
        arraySort(numbers2, from, to);
        arraySortDesc(numbers2);

        Student[] student = {
                new Student(105, "David"),
                new Student(107, "Erick"),
                new Student(102, "Alice")
        };
        customObjectArraySort(student);
    }

    /**
     * The time complexity of the code is O(n log n), where n is the number of elements in the input array.
     * This is because `Arrays.sort(input)` uses Dual-Pivot Quicksort, which has an average time complexity
     * of O(n log n) for sorting the array. The `Arrays.toString(input)` method runs in O(n) time to convert
     * the array into a string, but the sorting step dominates the time complexity.
     *
     * The space complexity is O(n). The sorting algorithm operates in-place, requiring O(1) additional space.
     * However, `Arrays.toString(input)` creates a new string representation of the array, which takes O(n)
     * space where n is the number of elements in the array.
     */
    private static void arraySort(int[] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
    }

    /**
     * The time complexity of the code is O(n log n), where n is the number of elements in the input array.
     * This is because `Arrays.sort(input)` uses Dual-Pivot Quicksort, which has an average time complexity
     * of O(n log n) for sorting the array. The `Arrays.toString(input)` method runs in O(n) time to convert
     * the array into a string, but the sorting step dominates the time complexity.
     *
     * The space complexity is O(n). The sorting algorithm operates in-place, requiring O(1) additional space.
     * However, `Arrays.toString(input)` creates a new string representation of the array, which takes O(n)
     * space where n is the number of elements in the array.
     */
    private static void arraySort(char[] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        Arrays.sort(input);
        System.out.println(Arrays.toString(input));
    }

    /**
     * The time complexity of the code is O(m log m), where m is the number of elements being sorted
     * between the specified `startIndex` and `endIndex`. This is because `Arrays.sort(input, startIndex, endIndex)`
     * uses Dual-Pivot Quicksort, which has an average time complexity of O(m log m) for sorting a subarray.
     * The `Arrays.toString(input)` method runs in O(n) time to convert the entire array into a string,
     * where n is the length of the input array. However, the sorting step dominates the time complexity.
     *
     * The space complexity is O(n). The sorting algorithm operates in-place, requiring O(1) additional space
     * for sorting. However, `Arrays.toString(input)` creates a new string representation of the entire array,
     * which takes O(n) space where n is the number of elements in the input array.
     */
    private static void arraySort(int[] input, int startIndex, int endIndex) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        Arrays.sort(input, startIndex, endIndex);
        System.out.println(Arrays.toString(input));
    }

    /**
     * The time complexity of the code is O(n log n), where n is the number of elements in the input array.
     * This is because the `Arrays.sort()` method with `Collections.reverseOrder()` has a time complexity
     * of O(n log n) for sorting the array in descending order. The `Arrays.stream(input).boxed().toArray()`
     * call takes O(n) to convert the primitive int array into an Integer array.
     *
     * The space complexity is O(n). This is due to the creation of a new Integer array in the `boxed()` step,
     * which requires O(n) space. Additionally, `Arrays.toString()` creates a string representation of the array,
     * which also requires O(n) space.
     */
    private static void arraySortDesc(int[] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        Integer[] convertedArray = Arrays.stream(input).boxed().toArray(Integer[]::new);
        Arrays.sort(convertedArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(convertedArray));
    }

    /**
     * The time complexity of the code is O(n log n), where n is the number of elements in the input array.
     * This is because `Arrays.sort(input, new SortByRoll())` uses a comparison-based sorting algorithm,
     * which has an average time complexity of O(n log n) for sorting. The `compare()` method in the
     * `SortByRoll` comparator runs in O(1) time for each comparison.
     *
     * The space complexity is O(n). The sorting is done in-place, so the space complexity for sorting
     * is O(1). However, `Arrays.toString(input)` creates a string representation of the entire array,
     * which requires O(n) space where n is the number of `Student` objects in the array.
     */
    private static void customObjectArraySort(Student[] input) {
        if (input.length == 0) {
            System.out.println("Input array is null.");
            return;
        }
        Arrays.sort(input, new SortByRoll());
        System.out.println(Arrays.toString(input));
    }

}

@SuppressWarnings("All")
class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return STR."\{this.rollNo} \{this.name}";
    }
}

class SortByRoll implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollNo - s2.rollNo;
    }
}

