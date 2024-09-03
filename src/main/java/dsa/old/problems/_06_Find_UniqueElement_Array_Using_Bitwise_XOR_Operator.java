package dsa.old.problems;

public class _06_Find_UniqueElement_Array_Using_Bitwise_XOR_Operator {

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(findUniqueElement(arr));
    }

    private static int findUniqueElement(int[] arr) {
        int uniqueElement = 0;
        for( int element : arr){
            System.out.println("UniqueElement at point : "+uniqueElement);
            System.out.println("Element at point : "+element);
            uniqueElement ^= element;
            System.out.println("UniqueElement after calculation : "+uniqueElement);
        }
        return uniqueElement;
    }
}
