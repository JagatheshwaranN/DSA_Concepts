package dsa.implementation.concepts.search.linear;

public class LinearSearch {

    public static int find(int[] input, int target) {
        for(int i = 0; i < input.length; i++)
            if(input[i] == target)
                return i;
        return -1;
    }

    public static boolean contains(int[] input, int target) {
        for (int i : input)
            if (i == target)
                return true;
        return false;
    }

    public static int find(String input, char target) {
        for(int i = 0; i < input.length(); i++)
            if(input.charAt(i) == target)
                return i;
        return -1;
    }

    public static boolean contains(String input, char target) {
        for(int i = 0; i < input.length(); i++)
            if(input.charAt(i) == target)
                return true;
        return false;
    }

    public static int[] find(int[][] input, int target) {
        for(int i = 0; i < input.length; i++)
            for(int j = 0; j < input[i].length; j++)
                if(input[i][j] == target)
                    return new int[]{i, j};
        return new int[]{-1, -1};
    }

    public static boolean contains(int[][] input, int target) {
        for (int[] intArr : input)
            for (int i : intArr)
                if (i == target)
                    return true;
        return false;
    }


}
