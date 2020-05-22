package algorithm;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;

public class linkedListFunctions {
    ListNode head;

    public int countNodes(ListNode head) {
        int count = 1;


//        ListNode current = head;

        while (head.next != null) {
            head = head.next;
            count = count + 1;
        }
        return count;

    }

    public boolean checkLoop(ListNode head) {
        HashSet<ListNode> map = new HashSet<ListNode>();
        while (head != null) {
            if (!map.contains(head)) {
                map.add(head);
                head = head.next;
            } else {
                return true;
            }
        }
        return false;
    }

    public ListNode mergeLL(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode p = l3;
        System.out.println(p.value);

        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 == null) p.next = l2;
        if (l2 == null) p.next = l1;
        return l3.next;
    }
}
