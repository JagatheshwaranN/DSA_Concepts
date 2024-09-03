package lc.linkedList;

@SuppressWarnings("ALL")
public class DetectCycleInListAndRemoveTheLoopDemo {

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

        System.out.println(DetectCycleInListAndRemoveTheLoopDemo.detectCycle(headNoCycle));
        DetectCycleInListAndRemoveTheLoopDemo.printList(headWithCycle, 10);
        System.out.println(DetectCycleInListAndRemoveTheLoopDemo.detectCycle(headWithCycle));
        DetectCycleInListAndRemoveTheLoopDemo.printList(headWithCycle, 10);

    }

    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    prev = fast;
                    slow = slow.next;
                    fast = fast.next;
                }
                prev.next = null;
                return slow;
            }
        }
        return null;
    }

    public static void printList(ListNode head, int limit) {
        ListNode temp = head;
        int count = 0;
        while (temp != null && count < limit) {
            System.out.println(temp.val + " -> ");
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("null");
        } else {
            System.out.println("...");
        }
    }

}
