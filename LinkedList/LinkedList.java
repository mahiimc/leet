public class LinkedList {

    public ListNode head;

    public LinkedList() {
        this.head = null;
    }


    public void add(ListNode node) {
        if (head == null) {
            head = node;
        }
        else {
            ListNode curr = head;
            while( curr.next != null ) {
                curr = curr.next;
            }
            curr.next = node;

        }

    }

    public void add(int val) {
        ListNode newNode = new ListNode(val);        
    
        if(head == null) {
            head = newNode;
        }
        else {
            ListNode curr = head;
            while( curr.next != null ) {
                curr = curr.next;
            }
            curr.next = newNode;

        }
        
    }

    public void print(ListNode head) {
        ListNode curr = head;
        System.out.print("HEAD -> ");
        while(curr != null) {
            System.out.print(curr.val+" -> ");
            curr = curr.next;
        }
        System.out.print("NULL");
    }

}



class ListNode {
    int val;
    ListNode next;
    public ListNode(int n) {
        val = n;
        next = null;
    }
}