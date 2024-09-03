package dsa.old.practices.sample;

import java.util.Scanner;

public class _03_Simple_Interest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Principal");
        int principal = scanner.nextInt();
        System.out.println("Enter the Rate");
        int rate = scanner.nextInt();
        System.out.println("Enter the Time");
        int time = scanner.nextInt();

        int simpleInterest = 0;

        simpleInterest = (principal * rate * time) / 100;

        System.out.println("The simple interest is "+simpleInterest);
    }
}
