package dsa.concepts.search.binary;

public class BinarySearch {

    public static int search(int[] input, int target) {
        int start = 0;
        int end = input.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > input[mid]) {
                start = mid + 1;
            } else if (target < input[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int orderAgnosticSearch(int[] input, int target) {
        int start = 0;
        int end = input.length - 1;
        boolean ascSort = input[end] > input[start];
        while (start <= end) {
            int mid = (start + end) / 2;
            if (ascSort) {
                if (target > input[mid]) {
                    start = mid + 1;
                } else if (target < input[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (target > input[mid]) {
                    end = mid - 1;
                } else if (target < input[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

}
