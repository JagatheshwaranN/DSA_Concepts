package dsa.old.practices.sample;

import java.util.Scanner;

public class _04_Operators {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1 = scanner.nextInt();
        System.out.println("Enter Number2");;
        int num2 = scanner.nextInt();
        System.out.println("Enter Operation Type - Add / Sub / Mul / Div");;
        String operation = scanner.next();
        System.out.println(arithmeticOperations(num1, num2, operation));

    }

    private static int arithmeticOperations(int num1, int num2, String operation){

        if(operation.equalsIgnoreCase("Add")){
            return num1 + num2;
        } else if(operation.equalsIgnoreCase("Sub")){
            return num1 - num2;
        } else if(operation.equalsIgnoreCase("Mul")){
            return num1 * num2;
        } else {
                return num1 / num2;
        }
    }
}
