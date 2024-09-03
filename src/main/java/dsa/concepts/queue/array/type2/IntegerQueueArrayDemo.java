package dsa.concepts.queue.array.type2;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class IntegerQueueArrayDemo {

    public static void main(String[] args) {

        QueueArray<Integer> queueArray = new QueueArray<>();
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
                    queueArray.display();
                    break;
                case 2:
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    queueArray.enqueue(value);
                    break;
                case 3:
                    System.out.println("The first element is :: " + queueArray.firstQueueElement());
                    break;
                case 4:
                    System.out.println("The dequeued element is :: " + queueArray.dequeue());
                    break;
                case 5:
                    System.out.println("Queue is Empty? :: " + queueArray.isEmpty());
                    break;
                case 6:
                    queueArray.clearQueue();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice..!!");

            }
        }
    }

}