package algorithm;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;

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

    public boolean checkLoop(ListNode head)
    {
        HashSet<ListNode> map = new HashSet<ListNode>();
        while(head!=null)
        {
            if(!map.contains(head))
            {
                map.add(head);
                head = head.next ;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
