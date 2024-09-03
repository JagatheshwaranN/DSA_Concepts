package dsa.concepts.sort.bubble;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] input) {
        for( int i = 0; i < input.length - 1; i ++) {
            boolean swap = false;
            for(int j = 0; j < input.length - i - 1; j++) {
                if(input[j] > input[j+1]){
                    swap = true;
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.println(Arrays.toString(input));
    }
}
