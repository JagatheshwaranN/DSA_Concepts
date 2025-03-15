package practice;

public class ChangeVowelsInString {

    public static void main(String[] args) {
        String input = "Name";
        changeVowel(input);
    }

    private static void changeVowel(String input) {
        char[] inputCharArray = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(char currentChar : inputCharArray) {
            if(isVowel(currentChar)){
                stringBuilder.append("x");
            }else{
                stringBuilder.append(currentChar);
            }
        }
        System.out.println(stringBuilder);
    }

    private static boolean isVowel(char currentChar) {
        return currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u'
                || currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U';
    }

}
