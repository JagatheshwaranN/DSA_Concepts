package dsa.problems;

import java.util.Scanner;

public class _15_SquareRoot_Newton_Raphson_Method {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the square root");
        int number = scanner.nextInt();
        System.out.println(findSquareRoot(number));
    }
    private static double findSquareRoot(int number) {
        double x = number;
        double root;

        while(true){
            root = 0.5 * ( x + ( number / x));
            if(Math.abs(root - x) < 0.5) {
                break;
            }
            x = root;
        }
        return root;
    }
}
