

public class RemoveNthNode {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        int N = 1;
        removeNthFromEnd(list.head,N);
        list.print(list.head);
    }

    public static ListNode removeNthFromEnd(ListNode head , int n ) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first  = dummy;
        ListNode second = dummy;

        for(int i=0;i<=n;i++) {
            first = first.next;
        }
       
        while( first != null ) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
    
}
