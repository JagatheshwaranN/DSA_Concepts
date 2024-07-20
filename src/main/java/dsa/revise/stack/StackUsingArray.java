package dsa.revise.stack;

@SuppressWarnings("ALL")
public class StackUsingArray {

    static final int MAX = 100;
    int top;
    int[] stack = new int[MAX];

    StackUsingArray() {
        top = -1;
    }

    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray();
        stackUsingArray.push(4);
        stackUsingArray.push(6);
        stackUsingArray.push(1);
        stackUsingArray.print();
        System.out.println(stackUsingArray.pop());
        stackUsingArray.print();
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int data) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            stack[++top] = data;
            System.out.println(STR."\{data} pushed into Stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int data = stack[top--];
            System.out.println(STR."\{data} removed from Stack");
            return data;
        }
    }

    void print() {
        System.out.print("Stack Elements :: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(STR."\{stack[i]} ");
        }
        System.out.println();
    }

}
