package dsa.practices.interview;

public class _13_Array_Element_Position {
    public static void main(String[] args) {

        int[] arr = {4, 6, 7, 8, 9, 2};
        int target = 9;
        System.out.println("The position of element "+target+" is "+findPosition(arr, target));
    }
    private static int findPosition(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i+1;
            }
        }
        return -1;
    }
}
