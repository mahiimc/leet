public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        ListNode newHead =  reverse(linkedList.head);
        linkedList.head = newHead;
        linkedList.print(newHead);
    }


    public static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while( curr != null ) {
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
        }
       return prev;
        
    } 
    
}
