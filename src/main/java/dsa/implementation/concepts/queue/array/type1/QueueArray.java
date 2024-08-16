package dsa.implementation.concepts.queue.array.type1;

@SuppressWarnings("ALL")
public class QueueArray {

    public static final int MAX_SIZE = 30;
    int[] queue;
    int front, rear;

    public QueueArray() {
        queue = new int[MAX_SIZE];
        front = -1;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == MAX_SIZE - 1) {
            throw new IndexOutOfBoundsException("Queue is full.");
        } else {
            if(front == -1)
                front++;
            queue[++rear] = value;
        }
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            throw new IndexOutOfBoundsException("Queue is empty.");
        } else {
            return queue[front++];
        }
    }

    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray();
        queueArray.enqueue(5);
        queueArray.enqueue(7);
        queueArray.enqueue(9);
        System.out.println("Dequeued :: "+queueArray.dequeue());
        System.out.println("Dequeued :: "+queueArray.dequeue());
        System.out.println("Dequeued :: "+queueArray.dequeue());
        System.out.println("Dequeued :: "+queueArray.dequeue());
    }
}
