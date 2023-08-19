package dsa.problems;

import java.util.Scanner;

public class _30_Print_Start_Pattern_Recursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the triangle stars");
        int rows = scanner.nextInt();
        int col = 0;
        printTriangleBottomUpApproach(rows, col);
        printTriangleTopDownApproach(rows, col);
    }
    private static void printTriangleBottomUpApproach(int rows, int col) {
        if(rows == 0)
            return;
        if(col < rows) {
            System.out.print("*");
            printTriangleBottomUpApproach(rows, col + 1);
        }else{
            System.out.println();
            printTriangleBottomUpApproach(rows - 1, 0);
        }
    }
    private static void printTriangleTopDownApproach(int rows, int col) {
        if(rows == 0)
            return;
        if(col < rows) {
            printTriangleTopDownApproach(rows, col + 1);
            System.out.print("*");
        }else{
            printTriangleTopDownApproach(rows - 1, 0);
            System.out.println();
        }
    }
}
