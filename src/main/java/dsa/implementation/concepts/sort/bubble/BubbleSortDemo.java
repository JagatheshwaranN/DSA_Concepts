package dsa.implementation.concepts.sort.bubble;

public class BubbleSortDemo {

    public static void main(String[] args) {
        int[] numbers = {22, 10, 14, 13, 6, 17};
        BubbleSort.bubbleSort(numbers);
        numbers = new int[]{2, 10, 12, 15, 17, 21};
        BubbleSort.bubbleSort(numbers);
    }

}
