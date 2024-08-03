package dsa.implementation.array;

import java.util.Arrays;
import java.util.Iterator;

@SuppressWarnings({"unchecked", "all"})
class GenericDynamicArray<T> implements Iterable<T> {

    static final int INITIAL_CAPACITY = 5;
    T[] array;
    int size;
    int capacity;

    public GenericDynamicArray() {
        array = (T[]) new Object[INITIAL_CAPACITY];
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

    public void insertAtPosition(int position, T value) {
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

    public void updateAtPosition(int position, T value) {
        if (position < 0 || position > size) {
            System.out.println("Invalid Position");
            return;
        }
        array[position] = value;
    }

    public void insertAtBegin(T value) {
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

    public void insertAtEnd(T value) {
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

    public void searchValue(T value) {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == value || array[i].equals(value)) {
                System.out.println("Value found at position: " + i);
                break;
            }
        }
    }

    public void verifyValuePresent(T value) {
        boolean flag = false;
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == value || array[i].equals(value)) {
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

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return array[index++];
            }
        };
    }

}
