package dsa.revise.queue;

@SuppressWarnings("ALL")
public class QueueUsingArray {

    public static final int DEFAULT_SIZE = 5;
    private Object[] queue;
    private int rear;

    QueueUsingArray() {
        this.queue = new Object[DEFAULT_SIZE];
    }

    public boolean isEmpty() {
        return rear == 0;
    }

    public void enqueue(Object data) {
        if (rear == DEFAULT_SIZE - 1) {
            System.out.println("Queue is Full. Please dequeue some Objects");
        }
        queue[rear] = data;
        rear++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
        Object element = queue[0];
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        return element;
    }

    public void print() {
        System.out.print("Queue Elements are :: ");
        for (int i = 0; i < queue.length - 1; i++) {
            System.out.print(STR."\{queue[i]} ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray array = new QueueUsingArray();
        array.enqueue("4");
        array.enqueue("6");
        array.enqueue("1");
        array.print();
        System.out.println(STR."Removed element from Queue :: \{array.dequeue()}");
        array.enqueue("5");
        array.enqueue("10");
        array.print();
    }

}
