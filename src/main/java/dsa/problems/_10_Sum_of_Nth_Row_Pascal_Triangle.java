package dsa.problems;

import java.util.Scanner;

public class _10_Sum_of_Nth_Row_Pascal_Triangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Nth row of Pascal triangle");
        int row = scanner.nextInt();

        // Using Bitwise operator
        int result = 1 << (row - 1);
        System.out.println(result);

        // Using formula -> 1*2->n-1
        int result1 = (int) (1 * (Math.pow(2, row - 1)));
        System.out.println(result1);
    }
}
