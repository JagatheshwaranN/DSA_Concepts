package dsa.practices.sample;

import java.util.Scanner;

public class _02_Greeting_Message {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the person name to be Greeted");
        String name = scanner.next();
        System.out.println("Welcome, "+name+"!");
    }
}
