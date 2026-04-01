/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

public class Solution {
  public bool HasCycle(ListNode head)
  {
      ListNode current = head; 
      int length = 0;
      int index = 0; 
      List <ListNode> array = new List<ListNode>();
      while (current != null)
      {

          if( array.IndexOf(current) !=-1)
          {
              return true; 
          }
          array.Add(current);
          current = current.next;
      }


      return false;
  }
}
