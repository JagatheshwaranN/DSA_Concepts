package dsa.concepts.queue.linkedlist;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class IntegerQueueLinkedListDemo {

    public static void main(String[] args) {

        QueueLinkedList<Integer> queueLinkedList = new QueueLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int value;
        while (true) {
            System.out.println("\n--------------- Queue Menu ---------------\n");
            System.out.println("1. Display Queue");
            System.out.println("2. Enqueue Element");
            System.out.println("3. View Front Element");
            System.out.println("4. Dequeue Element");
            System.out.println("5. Check Queue Empty");
            System.out.println("6. Clear Queue");
            System.out.println("7. Exit");
            System.out.println("\n-----------------------------------------\n");
            System.out.println("Enter Your Choice: \t");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    queueLinkedList.display();
                    break;
                case 2:
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    queueLinkedList.enqueue(value);
                    break;
                case 3:
                    System.out.println("The first element is :: " + queueLinkedList.firstQueueElement());
                    break;
                case 4:
                    System.out.println("The dequeued element is :: " + queueLinkedList.dequeue());
                    break;
                case 5:
                    System.out.println("Queue is Empty? :: " + queueLinkedList.isEmpty());
                    break;
                case 6:
                    queueLinkedList.clearQueue();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice..!!");

            }
        }
    }

}