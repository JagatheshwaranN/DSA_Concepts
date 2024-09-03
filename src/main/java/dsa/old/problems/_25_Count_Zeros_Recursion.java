package dsa.old.problems;

import java.util.Scanner;

public class _25_Count_Zeros_Recursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check the Zeros");
        int number = scanner.nextInt();
        System.out.println("The number of zeros in number " +number+" is "+countZero(number));
    }
    private static int countZero(int number) {
        return count(number, 0);
    }
    private static int count(int number, int ct) {

        if(number == 0)
            return ct;

        if(number % 10 == 0){
            return count(number / 10, ct+1);
        }else{
            return count(number / 10, ct);
        }
    }
}
