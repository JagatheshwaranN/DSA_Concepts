package gfg.math;

import java.time.Year;

/**
 * Find the given year is leap year or not.
 * <p>
 * Input1: 2000
 * Output1: 2000 is a leap year
 * Input2: 2002
 * Output2: 2002 is not a leap year
 * <p>
 * Using loop
 * Using Ternary operator
 * Using buitin function
 */
@SuppressWarnings("All")
public class LeapYear {

    public static void main(String[] args) {
        int year = 2000;
        checkLeapYear(year);
        checkLeapYearUsingTernary(year);
        checkLeapYearUsingBuiltIn(year);
        year = 2002;
        checkLeapYear(year);
        checkLeapYearUsingTernary(year);
        checkLeapYearUsingBuiltIn(year);
        year = 1900;
        checkLeapYear(year);
        checkLeapYearUsingTernary(year);
        checkLeapYearUsingBuiltIn(year);
    }

    /**
     * Time Complexity: O(1) - The number of operations is constant, as checking leap year
     * requires a fixed number of modulo operations.
     * Space Complexity: O(1) - Only a few variables (input, isLeap) are used.
     */
    private static void checkLeapYear(int input) {
        if (input <= 0) {
            System.out.println("Input is invalid.");
            return;
        }
        boolean isLeap = false;
        if (input % 4 == 0) {
            isLeap = true;
            if (input % 100 == 0) {
                isLeap = input % 400 == 0;
            }
        }
        if (isLeap) {
            System.out.println(input + " is a leap year");
        } else {
            System.out.println(input + " is not a leap year");
        }
    }

    /**
     * Time Complexity: O(1) - The number of operations is constant, using a ternary operator
     * with fixed conditions.
     * Space Complexity: O(1) - Only a few variables (input, isLeap) are used.
     */
    private static void checkLeapYearUsingTernary(int input) {
        if (input <= 0) {
            System.out.println("Input is invalid.");
            return;
        }
        boolean isLeap = (input % 4 == 0 && input % 100 != 0 || input % 400 == 0) ? true : false;

        if (isLeap) {
            System.out.println(input + " is a leap year");
        } else {
            System.out.println(input + " is not a leap year");
        }
    }

    /**
     * Time Complexity: O(1) - The built-in method Year.of(input) and Year.isLeap() both perform
     * constant-time checks for leap years.
     * Space Complexity: O(1) - Only a Year object is created, which uses constant space.
     */
    private static void checkLeapYearUsingBuiltIn(int input) {
        if (input <= 0) {
            System.out.println("Input is invalid.");
            return;
        }
        Year checkYear = Year.of(input);
        boolean isLeap = checkYear.isLeap();
        if (isLeap) {
            System.out.println(input + " is a leap year");
        } else {
            System.out.println(input + " is not a leap year");
        }
    }

}
