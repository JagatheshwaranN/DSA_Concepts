package dsa.implementation.linkedlist;


public class LinkedList {

    Node head;

    public LinkedList() {
        head = null;
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (temp != null) {
            System.out.print(STR."\{temp.data} ");
            temp = temp.nextNode;
        }
        System.out.println();
    }

    public void insertAtBegin(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }
    }

    public void updateAtBegin(int value) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Deletion Attempted On Empty List");
        }
        head.data = value;
    }

    public void deleteAtBegin() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Deletion Attempted On Empty List");
        }
        head = head.nextNode;
    }

    public void insertAtPosition(int position, int value) {
        Node newNode = new Node(value);
        Node temp = head;
        if (position == 0) {
            insertAtBegin(value);
            return;
        }
        for (int i = 1; i < position; i++) {
            temp = temp.nextNode;
            if (temp == null)
                throw new IndexOutOfBoundsException("Invalid Position");
        }
        newNode.nextNode = temp.nextNode;
        temp.nextNode = newNode;
    }

    public void updateAtPosition(int position, int value) {
        Node temp = head;
        if (head == null) {
            throw new IndexOutOfBoundsException("Update Attempted On Empty List");
        }
        if (position == 0) {
            updateAtBegin(value);
        }
        for (int i = 1; i <= position; i++) {
            temp = temp.nextNode;
        }
        temp.data = value;
    }

    public void deleteAtPosition(int position) {
        Node temp = head;
        Node prev = null;
        if (head == null) {
            throw new IndexOutOfBoundsException("Deletion Attempted On Empty List");
        }
        if (position == 0) {
            deleteAtBegin();
            return;
        }
        for (int i = 1; i <= position; i++) {
            prev = temp;
            temp = temp.nextNode;
        }
        assert prev != null;
        prev.nextNode = temp.nextNode;
    }

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            prev = temp;
            temp = temp.nextNode;
        }
        assert prev != null;
        prev.nextNode = newNode;
    }

    public void updateAtEnd(int value) {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            prev = temp;
            temp = temp.nextNode;
        }
        assert prev != null;
        prev.data = value;
    }

    public void deleteAtEnd() {
        Node temp = head;
        Node prev = null;
        for (int i = 1; i < length(); i++) {
            prev = temp;
            temp = temp.nextNode;
        }
        assert prev != null;
        prev.nextNode = null;
    }

    public void getValue(int position) {
        Node temp = head;
        for (int i = 1; i <= position; i++) {
            temp = temp.nextNode;
        }
        System.out.println(temp.data);
    }

    public void searchValue(int value) {
        Node temp = head;
        for (int i = 1; i <= length(); i++) {
            temp = temp.nextNode;
            if (temp.data == value) {
                System.out.println(i);
                break;
            }
        }
    }

    public void verifyValuePresent(int value) {
        Node temp = head;
        boolean flag = false;
        for (int i = 1; i <= length(); i++) {
            assert temp != null;
            temp = temp.nextNode;
            if (temp != null) {
                if (temp.data == value) {
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(flag);
    }

    public void clearList() {
        if (head == null) {
            System.out.println("List is already empty");
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

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegin(9);
        list.insertAtBegin(5);
        list.display();
        list.insertAtPosition(1, 7);
        list.display();
        list.insertAtPosition(0, 2);
        list.display();
        list.deleteAtPosition(1);
        list.display();
        list.updateAtPosition(1, 17);
        list.display();
        list.updateAtBegin(12);
        list.display();
        list.insertAtEnd(20);
        list.display();
        list.updateAtEnd(25);
        list.display();
        System.out.println(list.length());
        list.deleteAtEnd();
        list.display();
        list.getValue(1);
        list.searchValue(9);
        list.verifyValuePresent(17);
        list.clearList();
        list.display();
    }

}

