package dsa.old.revise.stack;

@SuppressWarnings("ALL")
public class StackUsingLinkedList {

    static Node first = null;
    static StackUsingLinkedList list = new StackUsingLinkedList();

    public static void main() {
        push(4);
        push(1);
        push(6);
        print(list);
        pop();
        print(list);
    }

    static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
    }

    static void pop() {
        Node temp = first;
        first = first.next;
        System.out.println(STR."Removed Element from Stack :: \{temp.data}");
    }

    static void print(StackUsingLinkedList list) {
        Node currentNode = first;
        System.out.print("Stack Elements: ");
        while (currentNode != null) {
            System.out.print(STR."\{currentNode.data} ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

}
