package dsa.concepts.queue.array.type2;

@SuppressWarnings("ALL")
public class QueueArray<T> {

    public static final int MAX_SIZE = 30;
    T[] queue;
    int rear;

    public QueueArray() {
        queue = (T[]) new Object[MAX_SIZE];
        rear = -1;
    }

    public void display() {
        if (rear == -1) {
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
            queue[++rear] = value;
        }
    }

    public T firstQueueElement() {
        if (rear == -1) {
            throw new IndexOutOfBoundsException("Queue is empty.");
        } else {
            return queue[0];
        }
    }

    public T dequeue() {
        if (rear == -1) {
            throw new IndexOutOfBoundsException("Queue is empty.");
        } else {
            T temp = queue[0];
            for (int i = 1; i <= rear; i++) {
                queue[i - 1] = queue[i];
            }
            rear--;
            return temp;
        }
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public void clearQueue() {
        if (rear == -1) {
            System.out.println("Queue is already empty.");
        } else {
            rear = -1;
        }
    }

}
