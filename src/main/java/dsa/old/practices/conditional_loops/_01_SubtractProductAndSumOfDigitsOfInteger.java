package dsa.old.practices.conditional_loops;

public class _01_SubtractProductAndSumOfDigitsOfInteger {

    public static void main(String[] args) {

        int number = 4421;
        System.out.println(subtractProductAndSum(number));
    }

    private static int subtractProductAndSum(int num) {
        int product = 1;
        int sum = 0;
        int remainder = 0;
        while(num > 0){
            remainder = num % 10;
            product = product * remainder;
            sum = sum + remainder;
            num = num / 10;
        }
        return product-sum;
    }
}
