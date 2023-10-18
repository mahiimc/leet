public class LinkedListCycle {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        linkedList.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        // linkedList.print(linkedList.head);
        System.out.println(hasCycle(linkedList.head));
    }

    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;

        while( fast != null && fast.next != null ) {
            if(slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
       
        return false;
    }
}
