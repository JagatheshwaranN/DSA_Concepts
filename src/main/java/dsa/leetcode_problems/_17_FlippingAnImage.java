package dsa.leetcode_problems;

import java.util.Arrays;

/**
 * @Google
 */
public class _17_FlippingAnImage {
    public static void main(String[] args) {

        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertArray(image)));
    }
    private static int[][] flipAndInvertArray(int[][] image) {

        for(int[] row : image){
            for (int i = 0; i < (image[0].length+1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
