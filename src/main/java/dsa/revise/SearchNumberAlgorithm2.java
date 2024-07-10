package dsa.revise;

@SuppressWarnings("ConstantValue")
public class SearchNumberAlgorithm2 {

    public static void main() {
        int searchNumber = 9999996;
        int numberRange = 10000000;
        int count = 0;
        long startTime = System.currentTimeMillis();
        boolean isEven = searchNumber % 2 == 0;
        if (searchNumber >= 0) {
            if (isEven) {
                for (int i = 2; i < numberRange; i = i + 2) {
                    count++;
                    if (i == searchNumber) {
                        System.out.printf("%d is found at %d attempt%n", searchNumber, count);
                        break;
                    }
                }
            } else {
                for (int i = 1; i < numberRange; i = i + 2) {
                    count++;
                    if (i == searchNumber) {
                        System.out.printf("%d is found at %d attempt%n", searchNumber, count);
                        break;
                    }
                }
            }
        } else {
            System.out.println("The input is not valid");
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("%d is found in %d ms%n", searchNumber, endTime - startTime);
    }

}
