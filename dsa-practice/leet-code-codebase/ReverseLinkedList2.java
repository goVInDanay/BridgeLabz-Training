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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        int l = 0;
        ListNode last = null;
        while(l < left){
            last = temp;
            temp = temp.next;
            l++;
        }
        ListNode curr = temp;
        ListNode prev = last;
        ListNode next;
        while(l <= right){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            l++;
        }
        last.next = prev;
        temp.next = curr;
        return dummy.next;
    }
}