package dsa.old.problems;

import java.util.Scanner;

public class _12_Find_XOR_Value_In_Range {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();
        int result = getXOR(number2)^getXOR(number1-1);
        System.out.println("The XOR of range from "+number1+" to "+number2+" is "+result);
    }

    public static int getXOR(int num){
        if(num % 4 == 0)
            return num;

        if(num % 4 == 1)
            return 1;

        if(num % 4 == 2)
            return num+1;

        return 0;
    }
}
