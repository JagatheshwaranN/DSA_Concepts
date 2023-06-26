package dsa.practices.flow_control;

public class _02_MultiplicationTable {

    public static void main(String[] args) {

        generateMultiplicationTable(5);
    }

    private static void generateMultiplicationTable(int num){

        for (int i = 1; i <= 10; i++){
            System.out.println(i +" x " +num+" = "+(i*num));
        }
    }
}
