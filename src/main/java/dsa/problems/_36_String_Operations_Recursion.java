package dsa.problems;

public class _36_String_Operations_Recursion {

    public static void main(String[] args) {

        String result = "";
        String input = "baccadh";
        removeCharType1(result, input);
        System.out.println(removeCharType2(input));
        System.out.println(removeString("bcdapplefgh"));
        System.out.println(removeStringWithCond("bcdapplefgh"));
        System.out.println(removeStringWithCond("bcdapplfgh"));
    }
    private static void removeCharType1(String result, String input) {

        if(input.isEmpty()){
            System.out.println(result);
            return;
        }
        char ch = input.charAt(0);
        if(ch == 'a'){
            removeCharType1(result, input.substring(1));
        } else {
            removeCharType1(result + ch, input.substring(1));
        }
    }

    private static String removeCharType2(String input) {

        if(input.isEmpty()){
            return "";
        }
        char ch = input.charAt(0);
        if(ch == 'a'){
            return removeCharType2(input.substring(1));
        } else {
            return ch + removeCharType2(input.substring(1));
        }
    }

    private static String removeString(String input) {

        if(input.isEmpty()){
            return "";
        }
        if(input.startsWith("apple")){
            return removeString(input.substring(5));
        } else {
            return input.charAt(0) + removeString(input.substring(1));
        }
    }

    private static String removeStringWithCond(String input) {

        if(input.isEmpty()){
            return "";
        }
        if(input.startsWith("app") & !input.startsWith("apple")){
            return removeStringWithCond(input.substring(3));
        } else {
            return input.charAt(0) + removeStringWithCond(input.substring(1));
        }
    }


}
