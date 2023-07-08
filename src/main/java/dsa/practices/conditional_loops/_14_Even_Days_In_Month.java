package dsa.practices.conditional_loops;

public class _14_Even_Days_In_Month {

    public static void main(String[] args) {

        int counter = 0;
        int totalsDaysInAugust = 31;
        for(int day = 1; day <= totalsDaysInAugust; day++ ){
            if(day % 2 == 0){
                counter ++;
            }
        }
        System.out.println("The even number of days in august month is " +counter);
    }
}
