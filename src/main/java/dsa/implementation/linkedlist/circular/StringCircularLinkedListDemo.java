package dsa.implementation.linkedlist.circular;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class StringCircularLinkedListDemo {

    public static void main() {

        CircularLinkedList<String> list = new CircularLinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int position;
        String value;
        String newValue;
        while (true) {
            System.out.println("\n--------------- List Menu ---------------\n");
            System.out.println("1. Display Circular LinkedList");
            System.out.println("2. Insert At Beginning");
            System.out.println("3. Update At Beginning");
            System.out.println("4. Delete At Beginning");
            System.out.println("5. Insert At End");
            System.out.println("6. Update At End");
            System.out.println("7. Delete At End");
            System.out.println("8. Insert After Given Node");
            System.out.println("9. Delete Node with Data");
            System.out.println("10. Check Circular LinkedList Contains Value");
            System.out.println("11. Circular LinkedList Size");
            System.out.println("12. Clear Circular LinkedList");
            System.out.println("13. Exit");
            System.out.println("\n-----------------------------------------\n");
            System.out.println("Enter Your Choice: \t");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    list.display();
                    break;
                case 2:
                    System.out.println("Enter the data");
                    value = scanner.next();
                    list.insertAtBegin(value);
                    break;
                case 3:
                    System.out.println("Enter the data");
                    value = scanner.next();
                    list.updateAtBegin(value);
                    break;
                case 4:
                    list.deleteAtBegin();
                    break;
                case 5:
                    System.out.println("Enter the data");
                    value = scanner.next();
                    list.insertAtEnd(value);
                    break;
                case 6:
                    System.out.println("Enter the data");
                    value = scanner.next();
                    list.updateAtEnd(value);
                    break;
                case 7:
                    list.deleteAtEnd();
                    break;
                case 8:
                    System.out.println("Enter the data after which new data to insert");
                    value = scanner.next();
                    System.out.println("Enter the new data");
                    newValue = scanner.next();
                    list.insertAfter(value, newValue);
                    break;
                case 9:
                    System.out.println("Enter the data");
                    value = scanner.next();
                    list.deleteValue(value);
                    break;
                case 10:
                    System.out.println("Enter the data");
                    value = scanner.next();
                    list.verifyValuePresent(value);
                    break;
                case 11:
                    System.out.println("The size of the list :: " + list.size());
                    break;
                case 12:
                    list.clearList();
                    break;
                case 13:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice..!!");
            }
        }
    }

}