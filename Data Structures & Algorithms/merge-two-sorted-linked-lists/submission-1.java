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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1== null && list2 == null){
            return null;
        }
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode head = new ListNode(-1);
        ListNode output=head;
        while(curr1 != null && curr2 != null){
            if(curr1.val<=curr2.val){
                head.next=curr1;
                curr1=curr1.next;
            }else{
                head.next=curr2;  
                curr2=curr2.next;
            }
             head=head.next;
        }
        if(curr2!=null){
            head.next=curr2;
        }
        if(curr1!=null){
            head.next=curr1;
        }
        return output.next;
    }
}