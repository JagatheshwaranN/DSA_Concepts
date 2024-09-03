package dsa.old.practices.functions;

import java.util.Scanner;

public class _02_DisplayGradeBasedOnMarks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark to know the Grade");
        int mark = scanner.nextInt();
        findGradeForInputMark(mark);
    }

    private static void findGradeForInputMark(int mark) {

        if(mark >= 91 && mark <= 100){
            System.out.println("Grade A+");
        }else if(mark >= 81 && mark <= 90) {
            System.out.println("Grade A");
        }else if(mark >= 71 && mark <= 80) {
            System.out.println("Grade B+");
        }else if(mark >= 61 && mark <= 70) {
            System.out.println("Grade B");
        }else if(mark >= 51 && mark <= 60) {
            System.out.println("Grade C");
        }else if(mark >= 41 && mark <= 50) {
            System.out.println("Grade D");
        }else {
            System.out.println("Grade Fail");
        }
    }
}
