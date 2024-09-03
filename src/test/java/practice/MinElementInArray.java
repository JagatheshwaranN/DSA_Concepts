package practice;

@SuppressWarnings("ALL")
public class MinElementInArray {

    public static void main(String[] args) {
        int[] numbers = {5, 9, 8, 6, 1};
        findMin(numbers);
    }

    private static void findMin(int[] input) {
        int min = input[0];
        for(int i = 1; i < input.length; i++){
            if(input[i] < min){
                min = input[i];
            }
        }
        System.out.println(min);
    }

}
