package utube.pattern;

/**
 * Output:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 */
@SuppressWarnings("All")
public class Pattern6 {

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
        int printValue = 1;
        for (int row = 1; row <= input; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(printValue++ + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
