package dsa.practices.conditional_loops;

import java.util.Scanner;

public class _18_Permutation_Combination {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the N value");
        int total = scanner.nextInt();
        System.out.println("Enter the R value");
        int selection = scanner.nextInt();
        findPermutation(total, selection);
        findCombination(total, selection);
       // factorial(5);
    }
    private static void findPermutation(int n, int r) {
        // NpR = N!/ (N-R)!
        int permutation = factorial(n) / factorial(n-r);
        System.out.println("The permutation value is "+permutation);
    }
    private static void findCombination(int n, int r) {
        // NcR = N!/ ((N-R)! * R!)
        int combination = factorial(n) / (factorial(n-r) * factorial(r));
        System.out.println("The combination value is "+combination);
    }
    private static int factorial(int value){
        int fact = 1;
        while(value > 0){
            fact = fact * value;
            value--;
        }
        return fact;
    }
}
