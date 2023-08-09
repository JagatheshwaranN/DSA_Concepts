package dsa.problems;

import java.util.Scanner;

public class _14_SquareRoot_Number_BinarySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the square root");
        int number = scanner.nextInt();
        System.out.println("Enter the precision value for the square root");
        int precision = scanner.nextInt();
        String formatString = "%." + precision + "f";
        System.out.format(formatString, findSquareRoot(number, precision));
    }
    private static double findSquareRoot(int number, int precision) {

        double sqRoot = 0.0;
        int start = 0;
        int end = number;
        double precisionVal = 0.1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid * mid > number)
                end = mid - 1;
            else if(mid * mid < number)
                start = mid + 1;
            else if (mid * mid == number)
                return mid;
        }

        for(int i = 0; i < precision; i++){

            while(sqRoot * sqRoot < number){
                sqRoot += precisionVal;
            }
            sqRoot -=precisionVal;
            precisionVal /= 10;
        }
        return sqRoot;
    }
}
