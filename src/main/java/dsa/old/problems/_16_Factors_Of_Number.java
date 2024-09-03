package dsa.old.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class _16_Factors_Of_Number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the factors of the number");
        int number = scanner.nextInt();
        findFactorApproach1(number);
        System.out.println("============================");
        findFactorApproach2(number);
        System.out.println("============================");
        findFactorApproach3(number);
    }

    // Time complexity = O(n)
    private static void findFactorApproach1(int number) {

        for( int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    // Time complexity = O(sqrt(n))
    private static void findFactorApproach2(int number) {

        for( int i = 1; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                if(number / i == i){
                    System.out.print(i +" ");
                }else {
                    System.out.print(i +" "+ number / i + " ");
                }
            }
        }
        System.out.println();
    }

    // Time and Space complexity = O(sqrt(n))
    private static void findFactorApproach3(int number) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for( int i = 1; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                if(number / i == i){
                    System.out.print(i +" ");
                }else {
                    System.out.print(i +" ");
                    arrayList.add( number / i);
                }
            }
        }
        for(int i = arrayList.size() - 1; i >= 0; i--){
            System.out.print(arrayList.get(i) +" ");
        }
        System.out.println();
    }
}
