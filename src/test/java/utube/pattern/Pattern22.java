package utube.pattern;

/**
 * Output:
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 */
@SuppressWarnings("All")
public class Pattern22 {

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
        for (int row = 1; row <= input * 2; row++) {
            int rowChange = row > input ? (input * 2) - (row - 1) : row;
            for (int col = 1; col <= input * 2; col++) {
                if (col <= input - rowChange + 1 || col > input + rowChange - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
