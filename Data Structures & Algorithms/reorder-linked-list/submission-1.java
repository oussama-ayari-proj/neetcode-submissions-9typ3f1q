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
    public void reorderList(ListNode head) {
       if (head == null || head.next == null || head.next.next == null) return;
       ListNode curr = head;
       while(curr != null && curr.next != null && curr.next.next != null){
        ListNode prev = curr;
        ListNode fast = curr.next;
        while(fast.next != null){
            prev = fast;
            fast = fast.next;
        }
        ListNode temp = curr.next;
        curr.next = fast;
        fast.next = temp;
        prev.next = null;
        curr = temp;

       }
    }
}
