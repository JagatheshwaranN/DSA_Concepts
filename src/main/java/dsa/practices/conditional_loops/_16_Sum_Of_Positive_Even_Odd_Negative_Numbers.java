package dsa.practices.conditional_loops;

import java.util.Scanner;

public class _16_Sum_Of_Positive_Even_Odd_Negative_Numbers {
    public static void main(String[] args) {

        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter the number");
            int num = scanner.nextInt();
            if(num == 0) {
                break;
            }else{
                if(num < 0) {
                    negativeSum = negativeSum + (num);
                }
                else if(num > 0 && num % 2 == 0) {
                    positiveEvenSum = positiveEvenSum + num;
                } else {
                    positiveOddSum = positiveOddSum + num;
                }
            }
        }
        System.out.println("Sum of negative numbers      : "+negativeSum);
        System.out.println("Sum of positive even numbers : "+positiveEvenSum);
        System.out.println("Sum of positive odd numbers  : "+positiveOddSum);
    }
}

