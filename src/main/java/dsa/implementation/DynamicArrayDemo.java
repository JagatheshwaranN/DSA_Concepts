package dsa.implementation;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("ALL")
class DynamicArray {

    static final int INITIAL_CAPACITY = 5;
    int[] array;
    int size;
    int capacity;

    public DynamicArray() {
        array = new int[INITIAL_CAPACITY];
        size = 0;
        capacity = INITIAL_CAPACITY;
    }

    public void display() {
        if (size == 0) {
            System.out.println("List is Empty.");
        } else {
            System.out.print("Elements in the list are :: ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public void insertAtPosition(int position, int value) {
        if (position < 0 || position > size) {
            System.out.println("Invalid Position");
            return;
        }
        if (size == capacity) {
            expandArray();
        }
        for (int i = size - 1; i >= position; i--) {
            array[i + 1] = array[i];
        }
        array[position] = value;
        size++;
    }

    public void deleteAtPosition(int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid Position");
            return;
        }
        for (int i = position + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
        if (capacity > INITIAL_CAPACITY && capacity > size * 3) {
            shrinkArray();
        }
    }

    public void updateAtPosition(int position, int value) {
        if (position < 0 || position > size) {
            System.out.println("Invalid Position");
            return;
        }
        array[position] = value;
    }

    public void insertAtBegin(int value) {
        if (size == capacity) {
            expandArray();
        }
        if (size == 0 && array.length == 0)
            array[size] = value;
        for (int i = size - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = value;
        size++;
    }

    public void deleteAtBegin() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void insertAtEnd(int value) {
        if (size == capacity)
            expandArray();
        array[size++] = value;
    }

    public void deleteAtEnd() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        size--;
    }

    public void getValue(int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid Position");
            return;
        }
        System.out.println(array[position]);
    }

    public void searchValue(int value) {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                System.out.println("Value found at position: " + i);
                break;
            }
        }
    }

    public void verifyValuePresent(int value) {
        boolean flag = false;
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }

    public void clearList() {
        if (size == 0) {
            System.out.println("List is already empty");
            return;
        }
        if (size != 0 && array.length > 0)
            size = 0;
    }

    private void expandArray() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);
    }

    private void shrinkArray() {
        capacity /= 2;
        array = Arrays.copyOf(array, capacity);
    }

}

public class DynamicArrayDemo {

    public static void main() {

        DynamicArray dynamicArray = new DynamicArray();
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
            System.out.println("13. Exit");
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
                    System.exit(0);
                default:
                    System.out.println("Invalid choice..!!");
            }
        }
    }

}

