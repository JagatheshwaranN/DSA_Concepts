package practice;

public class SeparateDigitsAndAlphabets {

    public static void main(String[] args) {
        String input = "Ja23v4a5";
        separateValues(input);
    }

    private static void separateValues(String input) {
        StringBuilder alphabet = new StringBuilder();
        StringBuilder number = new StringBuilder();
        char[] inputCharArray = input.toCharArray();
        for (char currentChar : inputCharArray) {
            if (Character.isDigit(currentChar)) {
                number.append(currentChar);
            } else if (Character.isAlphabetic(currentChar)) {
                alphabet.append(currentChar);
            }
        }
        System.out.println(alphabet);
        System.out.println(number);
    }

}
