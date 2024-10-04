package utube.pattern;

/**
 * Output:
 * 1 1 1 1 1
 * 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4 4
 * 5 5 5 5 5
 */
@SuppressWarnings("All")
public class Pattern2 {

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
            for (int col = 1; col <= input; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
