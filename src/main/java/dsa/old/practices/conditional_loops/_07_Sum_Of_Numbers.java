package dsa.old.practices.conditional_loops;

import java.util.Scanner;

public class _07_Sum_Of_Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the N value");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            System.out.println("Enter the number");
            int number = scanner.nextInt();
            sum = sum + number;
        }
        System.out.println("The sum of "+n+" numbers is "+ sum);
    }
}
