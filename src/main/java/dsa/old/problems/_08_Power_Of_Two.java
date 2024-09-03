package dsa.old.problems;

import java.util.Scanner;

public class _08_Power_Of_Two {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find whether is power of 2 or not");
        int number = scanner.nextInt();
        if(number == 0){
            System.out.println("The number "+number+" is not power of 2");
        }else {
            if ((number & (number - 1)) == 0) {
                System.out.println("The number " + number + " is power of 2");
            } else {
                System.out.println("The number " + number + " is not power of 2");
            }
        }
    }
}
