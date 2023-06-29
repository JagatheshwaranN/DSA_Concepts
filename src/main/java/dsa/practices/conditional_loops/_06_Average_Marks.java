package dsa.practices.conditional_loops;

import java.util.Scanner;

public class _06_Average_Marks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.println("Enter the mark in subject "+i);
            int number = scanner.nextInt();
            sum = sum + number;
        }
        float average = (float) sum / n;
        System.out.println("The average mark is "+ average);
    }
}
