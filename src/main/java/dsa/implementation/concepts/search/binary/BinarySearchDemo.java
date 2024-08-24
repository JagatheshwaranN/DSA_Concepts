package dsa.implementation.concepts.search.binary;

@SuppressWarnings("ALL")
public class BinarySearchDemo {

    public static void main(String[] args) {
        // Binary Search - Works only on SORTED array
        int[] numbers = {1, 2, 7, 8, 9, 10, 12, 15, 18, 21, 25};
        int target = 12;
        System.out.println(BinarySearch.search(numbers, target));
        // Order Agnostic Search - ASC
        target = 15;
        System.out.println(BinarySearch.orderAgnosticSearch(numbers, target));
        // Order Agnostic Search - DESC
        numbers = new int[]{25, 21, 18, 15, 12, 10, 9, 8, 7, 2, 1};
        target = 12;
        System.out.println(BinarySearch.orderAgnosticSearch(numbers, target));
    }

}
