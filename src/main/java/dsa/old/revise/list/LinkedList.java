package dsa.old.revise.list;

@SuppressWarnings("ALL")
public class LinkedList {

    Node head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 4);
        list = insert(list, 1);
        print(list);
        insert(list, 5);
        insert(list, 7);
        print(list);
        delete(list, 5);
        print(list);
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node lastNode = list.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return list;
    }

    public static LinkedList delete(LinkedList list, int key) {
        System.out.println(STR."Delete Element \{key} from Linked List");
        Node currentNode = list.head, previousNode = null;
        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;
            System.out.println(STR."\{key} is found and deleted");
            return list;
        }
        while (currentNode != null && currentNode.data != key) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            previousNode.next = currentNode.next;
            System.out.println(STR."\{key} is found and deleted");
        }
        if(currentNode == null){
            System.out.println(key +" is not found");
        }
        return list;
    }

    public static void print(LinkedList list) {
        Node currentNode = list.head;
        System.out.print("Linked List Items :: ");
        while (currentNode != null) {
            System.out.print(STR."\{currentNode.data} ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

}
