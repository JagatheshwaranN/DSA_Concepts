package dsa.problems;

public class _27_LinearSearch_Recursion {

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 7, 3, 9};
        int target = 3;
        System.out.println("The value "+target+" is found "+findValue(arr, target, 0));
        System.out.println("The value "+target+" is found at index "+findValueIndex(arr, target, 0));
        System.out.println("The value "+target+" is found at index "+findValueIndexReverse(arr, target, arr.length - 1));
    }

    private static boolean findValue(int[] arr, int target, int index){

        if(index == arr.length)
            return false;
        return arr[index] == target || findValue(arr, target, index +1);
    }

    private static int findValueIndex(int[] arr, int target, int index){

        if(index == arr.length)
            return -1;
        if(arr[index] == target)
            return index;
        else {
                return findValueIndex(arr, target, index + 1);
        }
    }

    private static int findValueIndexReverse(int[] arr, int target, int index){

        if(index == -1)
            return -1;
        if(arr[index] == target)
            return index;
        else {
            return findValueIndexReverse(arr, target, index - 1);
        }
    }
}
