package dsa.revise.array;

import java.util.Arrays;

@SuppressWarnings({"preview", "ManualArrayCopy"})
public class CrudOperation {

    public static void main() {
        int[] arr = new int[]{1, 5, 2, 8, 7, 3};
        System.out.println("===========================");
        System.out.println("*** Search Element ***");
        printArray(arr);
        int value = 8;
        int location = searchElement(arr, value);
        System.out.println(STR."Value \{value} found at index :: \{location}");
        System.out.println("===========================");
        System.out.println("*** Add Element ***");
        printArray(arr);
        int position = 4;
        value = 10;
        addElement(arr, position, value);
        System.out.println("===========================");
        System.out.println("*** Update Element ***");
        printArray(arr);
        position = 3;
        value = 15;
        updateElement(arr, position, value);
        System.out.println("===========================");
        System.out.println("*** Delete Element ***");
        printArray(arr);
        value = 7;
        int[] newArr = deleteElement(arr, value);
        printArray(newArr);
        System.out.println("===========================");
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(STR."\{i} ");
        }
        System.out.println();
    }

    static int searchElement(int[] arr, int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    static void addElement(int[] arr, int position, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        newArr[position] = value;
        for (int i = position + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        printArray(newArr);
    }

    static void updateElement(int[] arr, int position, int value) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        newArr[position] = value;
        for (int i = position + 1; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        printArray(newArr);
    }

    static int[] deleteElement(int[] arr, int value) {
        int location = searchElement(arr, value);
        if (location >= 0) {
            for (int i = location + 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
        }
        return Arrays.copyOf(arr, arr.length - 1);
    }

}
