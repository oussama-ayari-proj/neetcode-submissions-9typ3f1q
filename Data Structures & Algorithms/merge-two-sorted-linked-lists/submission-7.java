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
        // 2 -> 2 -> 4 -> null
        // 1 -> 3 -> 5 -> null
        if(list1 == null && list2 == null){
            return null;
        }
        ListNode  curr1 = list1;
        ListNode curr2 = list2;
        ListNode head = new ListNode();
        ListNode curr = head;
        while(curr1 != null && curr2 != null){
            if(curr1.val > curr2.val){
                curr.next = curr2;
                curr = curr.next;
                curr2 = curr2.next;
            } else if(curr2.val > curr1.val){
                curr.next = curr1;
                curr = curr.next;
                curr1= curr1.next;
            }else{
                ListNode next1 = curr1.next;
                ListNode next2 = curr2.next;

                curr.next = curr2;
                curr = curr.next;
                curr.next = null;

                curr.next = curr1;
                curr = curr.next;
                curr.next = null;

                curr1 = next1;
                curr2 = next2;
            }
        }
        addRest(curr1,curr);
        addRest(curr2,curr);
        return head.next;
    }

    private void addRest(ListNode follow, ListNode head){
        if(follow != null){
            head.next = follow;

        }
    }
}