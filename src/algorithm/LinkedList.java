package algorithm;

public class LinkedList {

    private static ListNode head;


    public static void main(String[] args)
    {
        head = new ListNode(1) ;
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next =  new ListNode(4);
        head.next.next.next.next =  new ListNode(5);
        head.next.next.next.next.next =  new ListNode(6);
        head.next.next.next.next.next.next =  new ListNode(7);

//        removeKthNode remove = new removeKthNode();
//        ListNode result = remove.removeKthNode(head,4);

        reverseLinkedList reversal = new reverseLinkedList();
        ListNode result = reversal.reverseR(head);
//        ListNode result = reversal.reverseI(head);




        while(result!=null)
        {
            System.out.print(result.value);
            result = result.next ;
        }
    }
}
