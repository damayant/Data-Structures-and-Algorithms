package algorithm;

import org.jetbrains.annotations.NotNull;

public class linkedListFunctions {
    ListNode head ;

    public int countNodes(ListNode head)
    {
        int count  = 1;


//        ListNode current = head;

        while(head.next!=null)
        {
            head = head.next ;
            count = count +1 ;
        }
        return count ;

    }
}
