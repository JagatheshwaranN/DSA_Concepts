package dsa.implementation.linkedlist.doubly;


import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("ALL")
public class DoublyLinkedList<T> implements Iterable<T> {

    class Node {

        T data;

        Node nextNode;

        Node prevNode;

        Node(T data) {
            this.data = data;
            nextNode = null;
            prevNode = null;
        }

    }

    Node head;

    Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void displayDoublyList() {
        display();
        displayReverse();
    }

    private void display() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            StringBuilder stringBuilder = new StringBuilder("Normal Order -  Elements in the list are :: ");
            Node temp = head;
            while (temp != null) {
                stringBuilder.append(temp.data).append("\t");
                temp = temp.nextNode;
            }
            System.out.println(stringBuilder.toString());
        }
    }

    private void displayReverse() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            StringBuilder stringBuilder = new StringBuilder("Reverse Order - Elements in the list are :: ");
            Node temp = tail;
            while (temp != null) {
                stringBuilder.append(temp.data).append("\t");
                temp = temp.prevNode;
            }
            System.out.println(stringBuilder.toString());
        }
    }

    public void insertAtBegin(T value) {
        Node newNode = new Node(value);
        newNode.nextNode = head;
        if (head == null) {
            tail = newNode;
        } else {
            head.prevNode = newNode;
        }
        head = newNode;
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
        if (head == null) {
            tail = null;
        } else {
            head.prevNode = null;
        }
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
            if (temp == null) {
                throw new IndexOutOfBoundsException("Invalid position.");
            }
        }
        newNode.nextNode = temp.nextNode;
        newNode.prevNode = temp;
        if (temp == tail) {
            tail = newNode;
        } else {
            temp.nextNode.prevNode = newNode;
        }
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
                if (temp == null) {
                    throw new IndexOutOfBoundsException("Invalid position.");
                }
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
                if (temp == null) {
                    throw new IndexOutOfBoundsException("Invalid position.");
                }
            }
            prev.nextNode = temp.nextNode;
            if (temp.nextNode == null) {
                tail = prev;
            } else {
                temp.nextNode.prevNode = prev;
            }
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
            if (prev == tail) {
                tail = newNode;
            }
            prev.nextNode = newNode;
            newNode.prevNode = prev;
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
        if (prev == tail) {
            tail.data = value;
        }
        //prev.data = value;
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
            //temp.nextNode.prevNode = null;
            //tail = temp.prevNode;
            //temp.nextNode = null;
            temp.nextNode = null;
            tail = temp;
        }
    }

    public void getValue(int position) {
        if (position < 0 || position >= length()) {
            throw new IndexOutOfBoundsException("Invalid position.");
        }
        Node temp = head;
        for (int i = 0; i < position && temp != null; i++) {
            temp = temp.nextNode;
            if (temp == null) {
                throw new IndexOutOfBoundsException("Invalid position.");
            }
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
        if (head == null && tail == null) {
            System.out.println("List is already empty.");
        }
        head = null;
        tail = null;
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

    public Iterator<T> reverseIterator() {
        return new Iterator<T>() {
            Node temp = tail;

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
                temp = temp.prevNode;
                return value;
            }
        };
    }

    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        //1
        list.insertAtBegin(3);
        list.insertAtBegin(7);
        list.insertAtBegin(9);
        list.displayDoublyList();
//        //8
//        list.displayReverse();
//        list.insertAtEnd(50);
//        list.display();
//        list.displayReverse();
//        //9
//        list.updateAtEnd(55);
//        list.display();
//        list.displayReverse();
//        //10
//        list.deleteAtEnd();
//        list.display();
//        list.displayReverse();
//        list.getValue(1);
//        list.searchValue(3);
//        list.verifyValuePresent(7);
//        list.clearList();
//        list.display();
//        list.displayReverse();
//
//        //6
//        list.updateAtBegin(20);
//        list.display();
//        list.displayReverse();
//        //2
//        list.deleteAtBegin();
//        list.display();
//        list.displayReverse();
//        //7
//        list.insertAtPosition(2, 11);
//        //3
//        list.display();
//        list.displayReverse();
//        //4
//        list.deleteAtPosition(2);
//        list.display();
//        list.displayReverse();
//        //5
//        list.deleteAtBegin();
//        list.display();
//        list.displayReverse();
    }
}

