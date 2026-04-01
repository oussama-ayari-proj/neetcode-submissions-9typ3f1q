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
        int len=0;
        ListNode it=head;
        while(it!=null){
            it=it.next;
            len++;
        }
        if(len>1){
            int target=len-n;
            it=head;
            if(target==0){
                return it.next;
            }else{
                for(int i=0;i<target-1;i++)
                    it=it.next;
                ListNode del=it.next;
                if(del.next==null){
                    it.next=null;
                }else{
                    it.next=del.next;
                    del.next=null;
                }
            }
            
        }else return null;
        
        return head;
    }
}
