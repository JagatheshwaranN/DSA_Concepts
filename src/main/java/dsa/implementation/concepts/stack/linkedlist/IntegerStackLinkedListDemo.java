package dsa.implementation.concepts.stack.linkedlist;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class IntegerStackLinkedListDemo {

    public static void main(String[] args) {

        StackLinkedList<Integer> arrayStack = new StackLinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int value;
        while (true) {
            System.out.println("\n--------------- Stack Menu ---------------\n");
            System.out.println("1. Display Stack");
            System.out.println("2. Push Element");
            System.out.println("3. Peek Element");
            System.out.println("4. Pop Element");
            System.out.println("5. Check Stack Empty");
            System.out.println("6. Clear Stack");
            System.out.println("7. Exit");
            System.out.println("\n-----------------------------------------\n");
            System.out.println("Enter Your Choice: \t");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    arrayStack.display();
                    break;
                case 2:
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    arrayStack.push(value);
                    break;
                case 3:
                    System.out.println("The peek element is :: " + arrayStack.peek());
                    break;
                case 4:
                    System.out.println("The popped element is :: " + arrayStack.pop());
                    break;
                case 5:
                    System.out.println("Stack is Empty? :: " + arrayStack.isEmpty());
                    break;
                case 6:
                    arrayStack.clearStack();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice..!!");

            }
        }
    }

}
