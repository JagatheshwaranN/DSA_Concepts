package dsa.old.problems;

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
    private static void removeCharType1(String processed, String unprocessed) {

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(ch == 'a'){
            removeCharType1(processed, unprocessed.substring(1));
        } else {
            removeCharType1(processed + ch, unprocessed.substring(1));
        }
    }
    private static String removeCharType2(String unprocessed) {

        if(unprocessed.isEmpty()){
            return "";
        }
        char ch = unprocessed.charAt(0);
        if(ch == 'a'){
            return removeCharType2(unprocessed.substring(1));
        } else {
            return ch + removeCharType2(unprocessed.substring(1));
        }
    }
    private static String removeString(String unprocessed) {

        if(unprocessed.isEmpty()){
            return "";
        }
        if(unprocessed.startsWith("apple")){
            return removeString(unprocessed.substring(5));
        } else {
            return unprocessed.charAt(0) + removeString(unprocessed.substring(1));
        }
    }
    private static String removeStringWithCond(String unprocessed) {

        if(unprocessed.isEmpty()){
            return "";
        }
        if(unprocessed.startsWith("app") & !unprocessed.startsWith("apple")){
            return removeStringWithCond(unprocessed.substring(3));
        } else {
            return unprocessed.charAt(0) + removeStringWithCond(unprocessed.substring(1));
        }
    }
}
