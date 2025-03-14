package practice;

public class ChangingKeys {

    public static void main(String[] args) {
        String input = "abBcDef";
        int result = countChangingKeysOfString(input);
        System.out.println(result);
    }

    private static int countChangingKeysOfString(String input) {
        char[] inputArray = input.toCharArray();
        char lastKey = inputArray[0];
        int count = 0;
        lastKey = Character.toLowerCase(lastKey);
        for (int i = 1; i < inputArray.length; i++) {
            char currentKey = inputArray[i];
            currentKey = Character.toLowerCase(currentKey);
            if (currentKey != lastKey) {
                count++;
            }
            lastKey = currentKey;
        }
        return count;
    }

}
