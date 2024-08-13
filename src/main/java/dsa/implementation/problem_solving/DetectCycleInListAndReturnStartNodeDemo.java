package dsa.implementation.problem_solving;

@SuppressWarnings("ALL")
public class DetectCycleInListAndReturnStartNodeDemo {

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

        System.out.println(DetectCycleInListAndReturnStartNodeDemo.detectCycle(headNoCycle));
        System.out.println(DetectCycleInListAndReturnStartNodeDemo.detectCycle(headWithCycle).val);
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

}
