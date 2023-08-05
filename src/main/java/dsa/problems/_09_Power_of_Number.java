package dsa.problems;

import java.util.Scanner;

public class _09_Power_of_Number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number base");
        int numberBase = scanner.nextInt();
        System.out.println("Enter the power");
        int power = scanner.nextInt();
        int base = numberBase;
        int pow = power;
        int result = 1;
        while(power > 0){
            if((power & 1) == 1){
                result *= numberBase;
            }
            numberBase *= numberBase;
            power = power >> 1;
        }
        System.out.println("The power "+pow+" of number base "+base +" is "+result);
    }
}
