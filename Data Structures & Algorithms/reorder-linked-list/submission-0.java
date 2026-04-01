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
        Stack<Integer> stack=new Stack<>();
        ListNode it=head;
        //Fill the stack
        while(it!=null){
            stack.push(it.val);
            it=it.next;
        }
        //Inject new nodes
        it=head;
        int n=stack.size();
        for(int i=0;i<n/2;i++){
            ListNode next=it.next;
            ListNode node= new ListNode(stack.pop(),next);
            it.next=node;
            it=next;
        }
        //Clean the Linked List
        it=head;
        int cur=0;
        while(it!=null){
            if(cur>=n-1){
                ListNode next=it.next;
                it.next=null;
                it=next;
            }else it=it.next;
            cur++;
        }
    }

}
