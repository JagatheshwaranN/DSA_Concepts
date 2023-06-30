package dsa.practices.conditional_loops;

import java.util.Scanner;

public class _12_Calculate_Power_of_Number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base value");
        int base = scanner.nextInt();
        System.out.println("Enter the exponent value");
        int exponent = scanner.nextInt();

        System.out.println("The power of "+base+"^" + exponent +" is "+powerWithWhileLoop(base, exponent));
        System.out.println("The power of "+base+"^" + exponent +" is "+powerWithForLoop(base, exponent));

    }

    private static int powerWithWhileLoop(int b, int e){
        int result = 1;
        while(e != 0) {
            result = b * result;
            e--;
        }
        return result;
    }

    private static int powerWithForLoop(int b, int e){
        int result = 1;
        for(; e != 0; e--){
            result = b * result;
        }
        return result;
    }
}
