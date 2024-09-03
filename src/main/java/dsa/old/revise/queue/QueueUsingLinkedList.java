package dsa.old.revise.queue;

@SuppressWarnings("ALL")
public class QueueUsingLinkedList {

    Node front, rear;

    QueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public Node dequeue() {
        if (this.front == null) {
            return null;
        }
        Node temp = this.front;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        return temp;
    }

    public static void print(QueueUsingLinkedList list) {
        Node currentNode = list.front;
        System.out.print("Queue Elements are :: ");
        while (currentNode != null) {
            System.out.print(STR."\{currentNode.data} ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLinkedList list = new QueueUsingLinkedList();
        list.enqueue(4);
        list.enqueue(6);
        list.enqueue(1);
        print(list);
        int data = list.dequeue().data;
        System.out.println("Removed element from Queue :: "+ data);
        print(list);
    }
}
