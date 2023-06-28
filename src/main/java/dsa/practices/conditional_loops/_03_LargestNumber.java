package dsa.practices.conditional_loops;

import java.util.Scanner;

public class _03_LargestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(true){
            System.out.println("Enter the number to find the largest of the numbers");
            int num = scanner.nextInt();
            if(num == 0){
                break;
            }else{
                if(num > max){
                    max = num;
                }
            }
        }
        System.out.println("The max number is "+ max);
    }
}
