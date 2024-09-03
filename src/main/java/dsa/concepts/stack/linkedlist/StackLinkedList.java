package dsa.concepts.stack.linkedlist;


@SuppressWarnings("ALL")
public class StackLinkedList<T> {

    class Node {

        T data;

        Node nextNode;

        public Node(T data) {
            this.data = data;
            this.nextNode = null;
        }

    }

    Node top;

    public StackLinkedList() {
        top = null;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            Node temp = top;
            System.out.print("The stack elements are :: ");
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.nextNode;
            }
            System.out.println();
        }
    }

    public void push(T value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.nextNode = top;
            top = newNode;
        }
    }

    public T peek() {
        if (top == null) {
            throw new IndexOutOfBoundsException("Stack Underflow.");
        } else {
            return top.data;
        }
    }

    public T pop() {
        if (top == null) {
            throw new IndexOutOfBoundsException("Stack Underflow.");
        } else {
            T temp = top.data;
            top = top.nextNode;
            return temp;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void clearStack() {
        top = null;
    }

}
