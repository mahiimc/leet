public class PalindromLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(0);
        linkedList.add(0);
        

       System.out.println(isPalindrome(linkedList.head));
    }

    /**
     * Aproach:
     *  Find the middle using slow and fast pointers
     *  Reverese the first half
     *  Compare the first half and second half
     *  return false if any of the num not same.
     */

     public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null &&  fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null ) {
            slow = slow.next;
        }
       
        slow  = rev(slow);
        fast = head;
        while( slow != null ) {
            if(fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

     public static ListNode rev(ListNode head) {

        ListNode prev = null;
        while( head != null )  {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    
}
