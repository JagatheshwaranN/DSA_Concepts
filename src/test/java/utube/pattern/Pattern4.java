package utube.pattern;

/**
 * Output:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */
@SuppressWarnings("All")
public class Pattern4 {

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
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
