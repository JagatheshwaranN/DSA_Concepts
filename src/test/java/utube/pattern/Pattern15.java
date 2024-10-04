package utube.pattern;

/**
 * Output:
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
@SuppressWarnings("All")
public class Pattern15 {

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
        for (int row = 1; row <= input * 2 - 1; row++) {
            int rowChange = row > input ? (input * 2) - row : row;
            for (int col = 1; col <= input - rowChange; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= rowChange * 2 - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
