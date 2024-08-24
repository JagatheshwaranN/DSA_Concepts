package dsa.implementation.practice;

@SuppressWarnings("ALL")
public class CountCharInString {

    public static void main(String[] args) {
        String input = "Java Program";
        char target = 'r';
        countChar(input, target);
    }

    private static void countChar(String input, char target) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("'" + target + "'" + " occurance in " + input + " is " + count);
    }

}
