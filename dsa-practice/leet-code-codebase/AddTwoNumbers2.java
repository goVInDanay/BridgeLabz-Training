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
    public ListNode reverseList(ListNode head) {  
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        ListNode l3 = new ListNode(-1);
        ListNode temp = l3;
        int carry = 0;
        while(l1!=null || l2!=null || carry != 0){
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int num = val1 + val2 + carry;
            ListNode node = new ListNode(num % 10);
            temp.next = node;
            temp = temp.next;
            carry = num / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        } 
        ListNode ans = reverseList(l3.next);
        return ans;
    }
}