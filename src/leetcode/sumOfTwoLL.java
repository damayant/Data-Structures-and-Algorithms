/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headA = l1;
        ListNode headB = l2;
        ListNode result = new ListNode(0);
        ListNode temp_result = result;
        int carry_over = 0;
        
        while (headA!=null || headB!=null)
        {
            int temp = 0;
            if(headA!=null && headB!=null)
            {
                temp = headA.val + headB.val + carry_over ;
                carry_over = 0 ;
                if(temp>9)
                {
                    carry_over = temp/10 ;
                    temp = temp%10 ;
                }
                
                temp_result.next = new ListNode(temp) ;
                temp_result = temp_result.next ;
                headA = headA.next;
                headB = headB.next ;
            }
            
            else if(headB ==null )
            {
                temp = headA.val + carry_over ;
                carry_over = 0 ;
                if(temp>9)
                {
                    carry_over = temp/10 ;
                    temp = temp%10 ;
                }
                
                temp_result.next = new ListNode(temp) ;
                temp_result = temp_result.next ;
                headA = headA.next;
            }
            else 
            {
                temp = headB.val + carry_over ;
                carry_over = 0 ;
                if(temp>9)
                {
                    carry_over = temp/10 ;
                    temp = temp%10 ;
                }
                
                temp_result.next = new ListNode(temp) ;
                temp_result = temp_result.next ;
                headB = headB.next;
            }
        }
        if(carry_over > 0)
        {
            temp_result.next = new ListNode(carry_over);
        }
        return result.next;
    }

}
