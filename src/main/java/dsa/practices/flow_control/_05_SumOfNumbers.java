package dsa.practices.flow_control;

import java.util.Scanner;

public class _05_SumOfNumbers {

    public static void main(String[] args) {

        int sum = 0;
        int num;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter the number");
            String input = scanner.next();
            if(input.equalsIgnoreCase("x")){
                break;
            }else{
                num = Integer.parseInt(input);
                sum = sum + num;
            }
        }
        System.out.println("Sum of the entered numbers is " +sum);
    }
}
