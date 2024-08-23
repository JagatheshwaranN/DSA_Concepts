package dsa.implementation.concepts.search.linear;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class LinearSearchDemo {

    public static void main(String[] args) {
        integerArraySearch();
        integerArrayCheck();
        charStringSearch();
        charStringCheck();
        twoDimensionIntegerArraySearch();
        twoDimensionIntegerArrayCheck();
    }

    public static void integerArraySearch() {
            int[] numbers = {1, 2, 7, 4, 6, 8, 9};
            System.out.println(LinearSearch.find(numbers, 8));
            System.out.println(LinearSearch.find(numbers, 10));
    }

    public static void integerArrayCheck() {
        int[] numbers = {1, 2, 7, 4, 6, 8, 9};
        System.out.println(LinearSearch.contains(numbers, 8));
        System.out.println(LinearSearch.contains(numbers, 10));
    }

    public static void charStringSearch() {
        String name = "Chola King";
        System.out.println(LinearSearch.find(name, 'K'));
        System.out.println(LinearSearch.find(name, 'r'));
    }

    public static void charStringCheck() {
        String name = "Chola King";
        System.out.println(LinearSearch.contains(name, 'K'));
        System.out.println(LinearSearch.contains(name, 'r'));
    }

    public static void twoDimensionIntegerArraySearch() {
        int[][] numbers = {
                {1, 2, 7},
                {4, 6, 8, 9},
                {11, 3, 5}
        };
        System.out.println(Arrays.toString(LinearSearch.find(numbers, 8)));
        System.out.println(Arrays.toString(LinearSearch.find(numbers, 10)));
    }

    public static void twoDimensionIntegerArrayCheck() {
        int[][] numbers = {
                {1, 2, 7},
                {4, 6, 8, 9},
                {11, 3, 5}
        };
        System.out.println(LinearSearch.contains(numbers, 8));
        System.out.println(LinearSearch.contains(numbers, 10));
    }

}
