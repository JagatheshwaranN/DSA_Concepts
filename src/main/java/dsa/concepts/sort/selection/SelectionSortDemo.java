package dsa.concepts.sort.selection;

@SuppressWarnings("ALL")
public class SelectionSortDemo {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 26, 3, 15, 22};
        SelectionSort.selectSortAsc(numbers);
        SelectionSort.selectSortDesc(numbers);
    }

}
