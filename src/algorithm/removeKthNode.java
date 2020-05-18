package algorithm;

public class removeKthNode {

    ListNode head;


    public ListNode removeKthNode(ListNode head, int target) {
        ListNode current = head;

        while (current != null) {
            if (current.next.value != target) {
                current = current.next;
            }
            else {
                current.next = current.next.next;
                return head;
            }
        }
        return null;
    }
}
