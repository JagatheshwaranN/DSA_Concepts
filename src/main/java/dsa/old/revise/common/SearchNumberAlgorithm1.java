package dsa.old.revise.common;

@SuppressWarnings("ConstantValue")
public class SearchNumberAlgorithm1 {

    public static void main() {
        int searchNumber = 9999996;
        int numberRange = 10000000;
        int count = 0;
        long startTime = System.currentTimeMillis();
        if (searchNumber >= 0) {
            for (int i = 0; i < numberRange; i++) {
                count++;
                if (searchNumber == i) {
                    System.out.printf("%d is found at %d attempt%n", searchNumber, count);
                    break;
                }
            }
        } else {
            System.out.println("The input is not valid");
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("%d is found in %d ms%n", searchNumber, endTime - startTime);
    }

}
