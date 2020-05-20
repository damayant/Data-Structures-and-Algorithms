package algorithm;

import java.util.List;

public class reverseLinkedList {

    ListNode head;

    /*recursive version */
    public ListNode reverseR(ListNode head) {

        if(head ==null || head.next ==null)
        {
            return head;
        }

        ListNode p = reverseR(head.next);
        head.next.next = head ;
        head.next = null;
        return p;
    }

    /*iterative version*/
    public ListNode reverseI(ListNode head)
    {
       if (head ==null) return head ;

       ListNode previous = null ;
//       ListNode current  =  head;

       while(head!=null)
       {
           ListNode tempNext = head.next;
           head.next = previous;
           previous = head ;
           head =tempNext ;
       }
       return previous;
    }

}
