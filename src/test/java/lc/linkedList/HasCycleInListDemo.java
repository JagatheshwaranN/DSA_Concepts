package lc.linkedList;

class ListNode {

    int val;

    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

}

@SuppressWarnings("ALL")
public class HasCycleInListDemo {

    public static void main(String[] args) {
        ListNode headNoCycle = new ListNode(1);
        headNoCycle.next = new ListNode(2);
        headNoCycle.next.next = new ListNode(3);
        headNoCycle.next.next.next = new ListNode(4);

        ListNode headWithCycle = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        ListNode fourthNode = new ListNode(4);

        headWithCycle.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = secondNode;

        System.out.println(HasCycleInListDemo.hasCycle(headNoCycle));
        System.out.println(HasCycleInListDemo.hasCycle(headWithCycle));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}
