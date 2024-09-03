package dsa.concepts.linkedlist.doubly;

import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class IntegerLinkedListDemo {

    public static void main() {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int position;
        int value;
        while (true) {
            System.out.println("\n--------------- List Menu ---------------\n");
            System.out.println("1. Display Doubly LinkedList");
            System.out.println("2. Insert At Beginning");
            System.out.println("3. Update At Beginning");
            System.out.println("4. Delete At Beginning");
            System.out.println("5. Insert At Specific Position");
            System.out.println("6. Update At Specific Position");
            System.out.println("7. Delete At Specific Position");
            System.out.println("8. Insert At End");
            System.out.println("9. Update At End");
            System.out.println("10. Delete At End");
            System.out.println("11. Get Value At Index");
            System.out.println("12. Search Value");
            System.out.println("13. Check LinkedList Contains Value");
            System.out.println("14. Display LinkedList Using Iterator");
            System.out.println("15. Display LinkedList Using Reverse Iterator");
            System.out.println("16. Clear LinkedList");
            System.out.println("17. Exit");
            System.out.println("\n-----------------------------------------\n");
            System.out.println("Enter Your Choice: \t");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    list.displayDoublyList();
                    break;
                case 2:
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    list.insertAtBegin(value);
                    break;
                case 3:
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    list.updateAtBegin(value);
                    break;
                case 4:
                    list.deleteAtBegin();
                    break;
                case 5:
                    System.out.println("Enter the position (Position starts from 0)");
                    position = scanner.nextInt();
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    list.insertAtPosition(position, value);
                    break;
                case 6:
                    System.out.println("Enter the position (Position starts from 0)");
                    position = scanner.nextInt();
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    list.updateAtPosition(position, value);
                    break;
                case 7:
                    System.out.println("Enter the position (Position starts from 0)");
                    position = scanner.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 8:
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    list.insertAtEnd(value);
                    break;
                case 9:
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    list.updateAtEnd(value);
                    break;
                case 10:
                    list.deleteAtEnd();
                    break;
                case 11:
                    System.out.println("Enter the position (Position starts from 0)");
                    position = scanner.nextInt();
                    list.getValue(position);
                    break;
                case 12:
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    list.searchValue(value);
                    break;
                case 13:
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    list.verifyValuePresent(value);
                    break;
                case 14:
                    if (list.length() == 0) {
                        System.out.println("List is Empty.");
                    } else {
                        System.out.print("Elements in the list are :: ");
                        for (Object data : list) {
                            System.out.print(STR."\{data} ");
                        }
                        System.out.println();
                    }
                    break;
                case 15:
                    if (list.length() == 0) {
                        System.out.println("List is Empty.");
                    } else {
                        System.out.print("Elements in the list are :: ");
                        Iterator<Integer> iterator = list.reverseIterator();
                        while (iterator.hasNext()) {
                            System.out.print(STR."\{iterator.next()} ");
                        }
                        System.out.println();
                    }
                    break;
                case 16:
                    list.clearList();
                    break;
                case 17:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice..!!");
            }
        }
    }

}