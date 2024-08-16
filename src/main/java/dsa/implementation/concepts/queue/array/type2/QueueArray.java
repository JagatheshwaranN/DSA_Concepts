package dsa.implementation.concepts.queue.array.type2;

@SuppressWarnings("ALL")
public class QueueArray {

    public static final int MAX_SIZE = 30;
    int[] queue;
    int rear;

    public QueueArray() {
        queue = new int[MAX_SIZE];
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == MAX_SIZE - 1) {
            throw new IndexOutOfBoundsException("Queue is full.");
        } else {
            queue[++rear] = value;
        }
    }

    public int dequeue() {
        if (rear == -1) {
            throw new IndexOutOfBoundsException("Queue is empty.");
        } else {
            int temp = queue[0];
            for(int i = 1; i <= rear; i++){
                queue[i-1] = queue[i];
            }
            rear--;
            return temp;
        }
    }

    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray();
        queueArray.enqueue(5);
        queueArray.enqueue(7);
        queueArray.enqueue(10);
        System.out.println("Dequeued :: "+queueArray.dequeue());
        System.out.println("Dequeued :: "+queueArray.dequeue());
        System.out.println("Dequeued :: "+queueArray.dequeue());
        System.out.println("Dequeued :: "+queueArray.dequeue());
    }

}
