package interview;

public class CompressString {

    public static void main() {
        String input = "aaabbbbccaa";
        System.out.println(compressStringApproach1(input));
        System.out.println(compressStringApproach2(input));
    }

    private static String compressStringApproach1(String input) {
        StringBuilder compressString = new StringBuilder();
        if (input == null || input.isEmpty()) {
            return input;
        }
        char[] inputChars = input.toCharArray();
        int count = 1;
        char currentChar = inputChars[0];
        for (int i = 1; i < inputChars.length; i++) {
            if (inputChars[i] == currentChar) {
                count++;
            } else {
                compressString.append(currentChar).append(count);
                currentChar = inputChars[i];
                count = 1;
            }
        }
        compressString.append(currentChar).append(count);
        return compressString.toString();
    }

    private static String compressStringApproach2(String input) {
        StringBuilder compressString = new StringBuilder();
        if (input == null || input.isEmpty()) {
            return input;
        }
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressString.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressString.append(input.charAt(input.length() - 1)).append(count);
        return compressString.toString();
    }

}
