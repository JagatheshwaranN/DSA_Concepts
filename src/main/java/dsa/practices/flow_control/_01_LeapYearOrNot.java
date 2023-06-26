package dsa.practices.flow_control;

public class _01_LeapYearOrNot {

    public static void main(String[] args) {

        int[] years1 = {1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020};
        findLeapYear(years1);
        int[] years2 = {2001, 2003, 2005, 2007, 2011, 2014, 2017, 2021, 2023};
        findLeapYear(years2);

    }

    private static void findLeapYear(int[] years){
        for (int year : years) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }
    }
}
