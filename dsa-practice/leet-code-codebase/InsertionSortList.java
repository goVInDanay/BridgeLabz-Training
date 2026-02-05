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
 class Solution{
    public ListNode insertionSortList(ListNode head) {
	    if(head == null){
	        return head;
        }
	    ListNode sorted = new ListNode(0); 
        ListNode curr = head; 
        ListNode prev = sorted; 
        ListNode next = null; 
        while(curr != null){
            if(prev.val > curr.val){
                prev = sorted;
            }
            next = curr.next;
            while(prev.next != null && prev.next.val < curr.val){
                prev = prev.next;
            }
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }
        return sorted.next;
    }
 }