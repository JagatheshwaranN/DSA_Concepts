package dsa.old.leetcode_problems;

import java.util.Scanner;

public class _18_Recursion_NumberOfStepsToReduceNumberToZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to count the number of steps taken to make it Zero");
        int number = scanner.nextInt();
        System.out.println("The number of steps taken to make number " +number+" to zero is "+countSteps(number));
    }
    private static int countSteps(int number) {
        return count(number, 0);
    }
    private static int count(int number, int step) {

        if(number == 0)
            return step;

        if(number % 2 == 0){
            return count(number / 2, step +1);
        }else{
            return count(number - 1, step +1);
        }
    }
}
