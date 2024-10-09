package gfg.string;

@SuppressWarnings("All")
public class SwapStrings {

    public static void main(String[] args) {
        String value1 = "Hello";
        String value2 = "World";
        swapStrings(value1, value2);
    }

    private static void swapStrings(String input1, String input2) {
        if (input1 == null || input2 == null) {
            System.out.println("One of the inputs is null.");
            return;
        }
        System.out.println("Before Swap - Input1: " + input1);
        System.out.println("Before Swap - Input2: " + input2);
        int input2Length = input2.length();
        input1 = input1 + input2;
        int input1Length = input1.length();
        input2 = input1.substring(0, input1Length - input2Length);
        input1 = input1.substring(input2Length);
        System.out.println("After Swap - Input1: " + input1);
        System.out.println("After Swap - Input2: " + input2);
    }

}
