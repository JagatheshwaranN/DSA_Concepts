package practice;

public class MonotonicArray {

    public static void main() {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean result = findArrayIsMonotonic(numbers);
        System.out.println(result);
    }

    private static boolean findArrayIsMonotonic(int[] numbers) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] < numbers[i]) {
                decreasing = false;
            } else if (numbers[i - 1] > numbers[i]) {
                increasing = false;
            }
        }
        return increasing || decreasing;
    }

}

// Note: increasing || decreasing - performed logical OR operation.
// It returns true on below scenarios
// increasing = true; decreasing = false; result = true;
// increasing = false; decreasing = true; result = true;
// increasing = true; decreasing = true; result = true;
// increasing = false; decreasing = false; result = false;
