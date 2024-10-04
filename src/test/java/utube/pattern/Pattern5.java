package utube.pattern;

/**
 * Output:
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 */
@SuppressWarnings("All")
public class Pattern5 {

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
        int printValue;
        for (int row = 1; row <= input; row++) {
            printValue = row % 2 == 0 ? 0 : 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(printValue + " ");
                printValue = printValue == 0 ? 1 : 0;
            }
            System.out.println();
        }
        System.out.println();
    }

}
