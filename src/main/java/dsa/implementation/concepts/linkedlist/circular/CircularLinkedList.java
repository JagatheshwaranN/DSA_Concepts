package dsa.implementation.concepts.linkedlist.circular;

@SuppressWarnings("ALL")
public class CircularLinkedList<T> {

    class Node {

        T data;
        Node nextNode;

        public Node(T data) {
            this.data = data;
            nextNode = null;
        }

    }

    Node last;

    public CircularLinkedList() {
        last = null;
    }

    public void display() {
        if (last == null) {
            System.out.println("List is empty.");
        } else {
            Node temp = last.nextNode;
            System.out.print("Elements in the list are :: ");
            do {
                System.out.print(STR."\{temp.data} ");
                temp = temp.nextNode;
            } while (temp != last.nextNode);
            System.out.println();
        }
    }

    public void insertAtBegin(T data) {
        Node newNode = new Node(data);
        if (last == null) {
            newNode.nextNode = newNode;
            last = newNode;
        } else {
            newNode.nextNode = last.nextNode;
            last.nextNode = newNode;
        }
    }

    public void updateAtBegin(T value) {
        if (last == null) {
            throw new IndexOutOfBoundsException("Update attempted on the empty list.");
        }
        last.nextNode.data = value;
    }

    public void deleteAtBegin() {
        if (last == null) {
            throw new IndexOutOfBoundsException("Deletion attempted on the empty list.");
        }
        if (last.nextNode == last) {
            last = null;
        } else {
            last.nextNode = last.nextNode.nextNode;
        }
    }

    public void insertAtEnd(T data) {
        Node newNode = new Node(data);
        if (last == null) {
            newNode.nextNode = newNode;
            last = newNode;
        } else {
            newNode.nextNode = last.nextNode;
            last.nextNode = newNode;
            last = newNode;
        }
    }

    public void updateAtEnd(T value) {
        if (last == null) {
            throw new IndexOutOfBoundsException("Update attempted on the empty list.");
        }
        if (last.nextNode == last) {
            last = null;
        } else {
            Node temp = last.nextNode;
            while (temp.nextNode != last) {
                temp = temp.nextNode;
            }
            temp.nextNode.data = value;
        }
    }

    public void deleteAtEnd() {
        if (last == null) {
            throw new IndexOutOfBoundsException("Deletion attempted on the empty list.");
        }
        if (last.nextNode == last) {
            last = null;
        } else {
            Node temp = last.nextNode;
            while (temp.nextNode != last) {
                temp = temp.nextNode;
            }
            temp.nextNode = last.nextNode;
            last = temp;
        }
    }

    public void verifyValuePresent(T value) {
        Node temp = last.nextNode;
        do {
            if (temp.data == value || temp.data.equals(value)) {
                System.out.println(value + " - Is present in the list?: " + true);
                return;
            }
            temp = temp.nextNode;
        } while (temp != last.nextNode);
        System.out.println(value + " - Is present in the list?: " + false);
    }

    public void insertAfter(T value, T newValue){
        if (last == null) {
            throw new IndexOutOfBoundsException("Insertion attempted on the empty list.");
        }
        Node temp = last.nextNode;
        Node prev = null;
        Node newNode = new Node(newValue);
        do {
            prev = temp;
            temp = temp.nextNode;
            if(temp.data == value || temp.data.equals(value)){
                newNode.nextNode = temp.nextNode;
                temp.nextNode = newNode;
            }
        }while(temp != last.nextNode);

    }

    public void deleteValue(T value) {
        if (last == null) {
            throw new IndexOutOfBoundsException("Deletion attempted on the empty list.");
        }
        Node temp = last.nextNode;
        Node prev = null;
        do {
            prev = temp;
            temp = temp.nextNode;
            if (temp.data == value || temp.data.equals(value)) {
                if (temp == last) {
                    last = prev;
                }
                prev.nextNode = temp.nextNode;
            }
        } while (temp != last.nextNode);
    }

    public void clearList() {
        if (last == null) {
            System.out.println("List is already empty.");
        }
        last = null;
    }

    public int size() {
        int count = 0;
        Node temp = last.nextNode;
        do {
            temp = temp.nextNode;
            count++;
        } while (temp != last.nextNode);
        return count;
    }

    /**
     * This method is just for trial and error.
     *
     * @return node.data
     */
    public T deleteAtBeginType2() {
        if (last == null) {
            throw new IndexOutOfBoundsException("Deletion attempted on the empty list.");
        }
        T temp = last.nextNode.data;
        if (last.nextNode == last) {
            last = null;
        } else {
            last.nextNode = last.nextNode.nextNode;
        }
        return temp;
    }

}
