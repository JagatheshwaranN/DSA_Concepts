package dsa.practices.conditional_loops;

import java.util.Scanner;

public class _10_Calculate_Distance_Between_Points {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the co-ordinate x1");
        int x1 = scanner.nextInt();
        System.out.println("Enter the co-ordinate x2");
        int x2 = scanner.nextInt();
        System.out.println("Enter the co-ordinate y1");
        int y1 = scanner.nextInt();
        System.out.println("Enter the co-ordinate y2");
        int y2 = scanner.nextInt();

        double distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("The distance between points - ("+x1+","+x2+"), ("+y1+","+y2+") : "+ distance);
    }
}
