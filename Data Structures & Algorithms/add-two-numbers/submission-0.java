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
        ListNode it1=l1;
        ListNode it2=l2;
        int carry=0;
        ListNode res=new ListNode();
        ListNode it3=res;

        while(it1!=null && it2!=null){
            
            int sum=it1.val+it2.val+carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            
            it1=it1.next;
            it2=it2.next;

            it3.next=node;
            it3=it3.next;
        }

        while(it1!=null){
            int sum=it1.val+carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);

            it1=it1.next;

            it3.next=node;
            it3=it3.next;
        }

        while(it2!=null){
            int sum=it2.val+carry;
            carry=sum/10;

            ListNode node=new ListNode(sum%10);
            it2=it2.next;

            it3.next=node;
            it3=it3.next;
        }
        if(carry!=0){
            it3.next=new ListNode(carry);
        }
        return res.next;
    }
}
