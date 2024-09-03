package dsa.concepts.queue.array.type1;

@SuppressWarnings("ALL")
public class QueueArray<T> {

    public static final int MAX_SIZE = 30;
    T[] queue;
    int front, rear;

    public QueueArray() {
        queue = (T[]) new Object[MAX_SIZE];
        front = -1;
        rear = -1;
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("The Queue elements are :: ");
            for (int i = 0; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public void enqueue(T value) {
        if (rear == MAX_SIZE - 1) {
            throw new IndexOutOfBoundsException("Queue is full.");
        } else {
            if (front == -1)
                front++;
            queue[++rear] = value;
        }
    }

    public T firstQueueElement() {
        if (front == -1 || front > rear) {
            throw new IndexOutOfBoundsException("Queue is empty.");
        } else {
            return queue[front];
        }
    }

    public T dequeue() {
        if (front == -1 || front > rear) {
            throw new IndexOutOfBoundsException("Queue is empty.");
        } else {
            return queue[front++];
        }
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void clearQueue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is already empty.");
        } else {
            front = -1;
            rear = -1;
        }
    }

}
