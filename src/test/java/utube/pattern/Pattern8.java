package utube.pattern;

/**
 * Output:
 * 5 5 5 5 5
 * 4 4 4 4
 * 3 3 3
 * 2 2
 * 1
 */
@SuppressWarnings("All")
public class Pattern8 {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 10};
        for (int n : numbers) {
            print(n);
        }
    }

    private static void print(int input) {
        if (input == 0) {
            System.out.println("Input is Zero.");
            return;
        }
        for (int row = 1; row <= input; row++) {
            for (int col = 1; col <= input - (row - 1); col++) {
                System.out.print((input - (row - 1)) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
