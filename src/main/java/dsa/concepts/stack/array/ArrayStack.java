package dsa.concepts.stack.array;


@SuppressWarnings("ALL")
public class ArrayStack<T> {

    public static final int MAX_SIZE = 30;

    T[] stack = (T[]) new Object[MAX_SIZE];

    int top;

    public ArrayStack() {
        top = -1;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("The stack elements are :: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(STR."\{stack[i]} ");
            }
            System.out.println();
        }
    }

    public void push(T value) {
        if (top == MAX_SIZE - 1) {
            throw new IndexOutOfBoundsException("Stack Overflow.");
        } else {
            stack[++top] = value;
        }
    }

    public T peek() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("Stack Underflow.");
        } else {
            return stack[top];
        }
    }

    public T pop() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("Stack Underflow.");
        } else {
            return stack[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void clearStack() {
        top = -1;
    }

}
