package dsa.implementation.array;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class GenericIntegerDynamicArrayDemo {

    public static void main() {

        GenericDynamicArray<Integer> dynamicArray = new GenericDynamicArray<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int position;
        int value;
        while (true) {
            System.out.println("\n--------------- List Menu ---------------\n");
            System.out.println("1. Display List");
            System.out.println("2. Insert At Specific Position");
            System.out.println("3. Delete At Specific Position");
            System.out.println("4. Update At Specific Position");
            System.out.println("5. Insert At Beginning");
            System.out.println("6. Delete At Beginning");
            System.out.println("7. Insert At End");
            System.out.println("8. Delete At End");
            System.out.println("9. Get Value At Index");
            System.out.println("10. Search Value");
            System.out.println("11. Check List Contains Value");
            System.out.println("12. Clear List");
            System.out.println("13. Display List Using Iterator");
            System.out.println("14. Exit");
            System.out.println("\n-----------------------------------------\n");
            System.out.println("Enter Your Choice: \t");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    dynamicArray.display();
                    break;
                case 2:
                    System.out.println("Enter the position (Position starts from 0)");
                    position = scanner.nextInt();
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    dynamicArray.insertAtPosition(position, value);
                    break;
                case 3:
                    System.out.println("Enter the position (Position starts from 0)");
                    position = scanner.nextInt();
                    dynamicArray.deleteAtPosition(position);
                    break;
                case 4:
                    System.out.println("Enter the position (Position starts from 0)");
                    position = scanner.nextInt();
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    dynamicArray.updateAtPosition(position, value);
                    break;
                case 5:
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    dynamicArray.insertAtBegin(value);
                    break;
                case 6:
                    dynamicArray.deleteAtBegin();
                    break;
                case 7:
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    dynamicArray.insertAtEnd(value);
                    break;
                case 8:
                    dynamicArray.deleteAtEnd();
                    break;
                case 9:
                    System.out.println("Enter the position (Position starts from 0)");
                    position = scanner.nextInt();
                    dynamicArray.getValue(position);
                    break;
                case 10:
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    dynamicArray.searchValue(value);
                    break;
                case 11:
                    System.out.println("Enter the data");
                    value = scanner.nextInt();
                    dynamicArray.verifyValuePresent(value);
                    break;
                case 12:
                    dynamicArray.clearList();
                    break;
                case 13:
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
                case 14:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice..!!");
            }
        }
    }

}

