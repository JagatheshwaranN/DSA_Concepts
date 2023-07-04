package dsa.concepts;

import java.util.Arrays;

public class _03_BinarySearch_2DArray {

    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search(matrix, 37)));
        System.out.println(Arrays.toString(search(matrix, 20)));
        System.out.println(Arrays.toString(search(matrix, 50)));
        System.out.println(Arrays.toString(search(matrix, 39)));
    }

    private static int[] search(int[][] arr, int target){

        int row = 0;
        int col = arr.length-1;

        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row, col};
            } else if(arr[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
