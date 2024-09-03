package dsa.concepts.array;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class StringDynamicArrayDemo {

    public static void main() {

        DynamicArray<String> dynamicArray = new DynamicArray<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int position;
        String value;
        while (true) {
            System.out.println("\n--------------- List Menu ---------------\n");
            System.out.println("1. Display List");
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
            System.out.println("13. Check List Contains Value");
            System.out.println("14. Display List Using Iterator");
            System.out.println("15. Clear List");
            System.out.println("16. Exit");
            System.out.println("\n-----------------------------------------\n");
            System.out.println("Enter Your Choice: \t");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    dynamicArray.display();
                    break;
                case 2:
                    System.out.println("Enter the data");
                    value = scanner.next();
                    dynamicArray.insertAtBegin(value);
                    break;
                case 3:
                    System.out.println("Enter the data");
                    value = scanner.next();
                    dynamicArray.updateAtBegin(value);
                    break;
                case 4:
                    dynamicArray.deleteAtBegin();
                    break;
                case 5:
                    System.out.println("Enter the position (Position starts from 0)");
                    position = scanner.nextInt();
                    System.out.println("Enter the data");
                    value = scanner.next();
                    dynamicArray.insertAtPosition(position, value);
                    break;
                case 6:
                    System.out.println("Enter the position (Position starts from 0)");
                    position = scanner.nextInt();
                    System.out.println("Enter the data");
                    value = scanner.next();
                    dynamicArray.updateAtPosition(position, value);
                    break;
                case 7:
                    System.out.println("Enter the position (Position starts from 0)");
                    position = scanner.nextInt();
                    dynamicArray.deleteAtPosition(position);
                    break;
                case 8:
                    System.out.println("Enter the data");
                    value = scanner.next();
                    dynamicArray.insertAtEnd(value);
                    break;
                case 9:
                    System.out.println("Enter the data");
                    value = scanner.next();
                    dynamicArray.updateAtEnd(value);
                    break;
                case 10:
                    dynamicArray.deleteAtEnd();
                    break;
                case 11:
                    System.out.println("Enter the position (Position starts from 0)");
                    position = scanner.nextInt();
                    dynamicArray.getValue(position);
                    break;
                case 12:
                    System.out.println("Enter the data");
                    value = scanner.next();
                    dynamicArray.searchValue(value);
                    break;
                case 13:
                    System.out.println("Enter the data");
                    value = scanner.next();
                    dynamicArray.verifyValuePresent(value);
                    break;
                case 14:
                    if (dynamicArray.size == 0) {
                        System.out.println("List is Empty.");
                    } else {
                        System.out.print("Elements in the list are :: ");
                        for (Object data : dynamicArray) {
                            System.out.print(STR."\{data} ");
                        }
                        System.out.println();
                    }
                    break;
                case 15:
                    dynamicArray.clearList();
                    break;
                case 16:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice..!!");
            }
        }
    }

}