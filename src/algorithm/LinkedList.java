package algorithm;

public class LinkedList {

    private static ListNode head;


    public static void main(String[] args)
    {
//        head = new ListNode(1) ;
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next =  new ListNode(4);
//        head.next.next.next.next =  new ListNode(5);
//        head.next.next.next.next.next =  new ListNode(6);
//        head.next.next.next.next.next.next =  new ListNode(7);
//        head.next.next.next.next.next.next.next =  head;


//        removeKthNode remove = new removeKthNode();
//        ListNode result = remove.removeKthNode(head,4);

//        reverseLinkedList reversal = new reverseLinkedList();
//        ListNode result = reversal.reverseR(head);
//        ListNode result = reversal.reverseI(head);

//        linkedListFunctions functions = new linkedListFunctions();
////        int capacity = functions.countNodes(head);
//        boolean result = functions.checkLoop(head);
//        System.out.println(result);





//        while(result!=null)
//        {
//            System.out.print(result.value);
//            result = result.next ;
//        }


        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(5);
        a.next = b;
        b.next = c ;


        ListNode d = new ListNode(2);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(6);
        ListNode g = new ListNode(7);

        d.next = e;
        e.next = f;
        f.next = g;

        linkedListFunctions functions = new linkedListFunctions();
        ListNode result = functions.mergeLL(a,d);

        while(result!=null)
        {
        System.out.print(result.value);
        result = result.next ;
        }


    }


}
