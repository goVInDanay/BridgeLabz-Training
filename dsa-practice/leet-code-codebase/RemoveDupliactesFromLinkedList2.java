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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        dummy.next = head;
        ListNode temp = dummy.next;
        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val){
                int data = temp.val;
                while(temp != null && temp.val == data){
                    temp = temp.next;
                }
                prev.next = temp;
                temp = prev;
            }
            prev = temp;
            temp = temp.next;
        }
        return dummy.next;
    }
}