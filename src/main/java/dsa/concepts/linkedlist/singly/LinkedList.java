package dsa.concepts.linkedlist.singly;


import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("ALL")
public class LinkedList<T> implements Iterable<T> {

    class Node {

        T data;

        Node nextNode;

        Node(T data) {
            this.data = data;
            nextNode = null;
        }

    }

    Node head;

    public LinkedList() {
        head = null;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            StringBuilder stringBuilder = new StringBuilder("Elements in the list are :: ");
            Node temp = head;
            while (temp != null) {
                stringBuilder.append(temp.data).append(" ");
                temp = temp.nextNode;
            }
            System.out.println(stringBuilder.toString());
        }
    }

    public void insertAtBegin(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }
    }

    public void updateAtBegin(T value) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Update attempted on the empty list.");
        }
        head.data = value;
    }

    public void deleteAtBegin() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Deletion attempted on the empty list.");
        }
        head = head.nextNode;
    }

    public void insertAtPosition(int position, T value) {
        Node newNode = new Node(value);
        Node temp = head;
        if (position < 0 || position > length()) {
            throw new IndexOutOfBoundsException("Invalid position.");
        }
        if (position == 0) {
            insertAtBegin(value);
            return;
        }
        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.nextNode;
        }
        if (temp == null) {
            throw new IndexOutOfBoundsException("Invalid position.");
        }
        newNode.nextNode = temp.nextNode;
        temp.nextNode = newNode;
    }

    public void updateAtPosition(int position, T value) {
        Node temp = head;
        if (position < 0 || position >= length()) {
            throw new IndexOutOfBoundsException("Invalid position.");
        }
        if (head == null) {
            throw new IndexOutOfBoundsException("Update attempted on the empty list.");
        }
        if (position == 0) {
            updateAtBegin(value);
            return;
        } else {
            for (int i = 1; i <= position && temp != null; i++) {
                temp = temp.nextNode;
            }
            if (temp == null) {
                throw new IndexOutOfBoundsException("Invalid position.");
            }
        }
        temp.data = value;
    }

    public void deleteAtPosition(int position) {
        if (position < 0 || position >= length()) {
            throw new IndexOutOfBoundsException("Invalid position.");
        }
        if (head == null) {
            throw new IndexOutOfBoundsException("Deletion attempted on the empty list.");
        }
        if (position == 0) {
            deleteAtBegin();
            return;
        } else {
            Node temp = head;
            Node prev = null;
            for (int i = 1; i <= position && temp != null; i++) {
                prev = temp;
                temp = temp.nextNode;
            }
            if (temp == null) {
                throw new IndexOutOfBoundsException("Invalid position.");
            }
            prev.nextNode = temp.nextNode;
        }
    }

    public void insertAtEnd(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node temp = head;
            Node prev = null;
            while (temp != null) {
                prev = temp;
                temp = temp.nextNode;
            }
            prev.nextNode = newNode;
        }
    }

    public void updateAtEnd(T value) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Update attempted on the empty list.");
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            prev = temp;
            temp = temp.nextNode;
        }
        prev.data = value;
    }

    public void deleteAtEnd() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Deletion attempted on the empty list.");
        }
        if (head.nextNode == null) {
            head = null;
            return;
        } else {
            Node temp = head;
            while (temp.nextNode.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = null;
        }
    }

    public void getValue(int position) {
        if (position < 0 || position >= length()) {
            throw new IndexOutOfBoundsException("Invalid position.");
        }
        Node temp = head;
        for (int i = 0; i < position && temp != null; i++) {
            temp = temp.nextNode;
        }
        if (temp == null) {
            throw new IndexOutOfBoundsException("Invalid position.");
        }
        System.out.println("Position " + position + " has value: " + temp.data);
    }

    public void searchValue(T value) {
        Node temp = head;
        int position = 0;
        while (temp != null) {
            if (temp.data == value || temp.data.equals(value)) {
                System.out.println("Value " + value + " has found at position: " + position);
                return;
            }
            temp = temp.nextNode;
            position++;
        }
        System.out.println("Value not found in the list.");
    }

    public void verifyValuePresent(T value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value || temp.data.equals(value)) {
                System.out.println(value + " - Is present in the list?: " + true);
                return;
            }
            temp = temp.nextNode;
        }
        System.out.println(value + " - Is present in the list?: " + false);
    }

    public void clearList() {
        if (head == null) {
            System.out.println("List is already empty.");
        }
        head = null;
    }

    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.nextNode;
            count++;
        }
        return count;
    }

    public void revers() {
        Node prev = null;
        Node current = head;
        Node next = head.nextNode;
        while (current != null) {
            next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;
        }
        head = prev;
        display();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node temp = head;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T value = temp.data;
                temp = temp.nextNode;
                return value;
            }
        };
    }

}

