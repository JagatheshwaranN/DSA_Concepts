package dsa.implementation.concepts.queue.linkedlist;


@SuppressWarnings("ALL")
public class QueueLinkedList<T> {

    class Node {

        T data;

        Node nextNode;

        public Node(T data) {
            this.data = data;
            this.nextNode = null;
        }

    }

    Node front, rear;

    public void display() {
        if (front == null && rear == null) {
            System.out.println("Queue is empty.");
        } else {
            Node temp = front;
            System.out.print("The Queue elements are :: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.nextNode;
            }
            System.out.println();
        }
    }

    public void enqueue(T data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
        } else {
            rear.nextNode = newNode;
        }
        rear = newNode;
    }

    public T firstQueueElement() {
        if (front == null) {
            throw new IndexOutOfBoundsException("Queue is empty.");
        } else {
            return front.data;
        }
    }

    public T dequeue() {
        if (front == null) {
            throw new IndexOutOfBoundsException("Queue is empty.");
        } else {
            T del = front.data;
            front = front.nextNode;
            return del;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void clearQueue() {
        if (front == null && rear == null) {
            System.out.println("Queue is already empty.");
        } else {
            front = null;
            rear = null;
        }
    }

}
