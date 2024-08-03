package dsa.implementation.linkedlist;


public class LinkedList {

    Node head;

    public LinkedList() {
        head = null;
    }

    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        }else {
            newNode.nextNode = head;
            head = newNode;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(STR."\{temp.data} ");
            temp = temp.nextNode;
        }
        System.out.println();
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertAtBeginning(9);
        list.insertAtBeginning(5);
        list.display();
    }

}

