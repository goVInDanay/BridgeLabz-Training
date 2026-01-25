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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        if(size <= 1){
            head = null;
        }
        else if(n == size){
            head = head.next;
        }
        else{
            int idx = size - n;
            temp = head;
            int i = 1;
            while(i < idx){
                i++;
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        return head;
    }
}