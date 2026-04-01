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
       public ListNode MergeTwoLists(ListNode list1, ListNode list2)
{
     ListNode dummy = new ListNode();
    ListNode current = dummy;

    // Create a list to store values from both lists
    List<int> array = new List<int>();

    // Traverse the first list and add values to the array
    while (list1 != null)
    {
        array.Add(list1.val);
        list1 = list1.next;
    }

    // Traverse the second list and add values to the array
    while (list2 != null)
    {
        array.Add(list2.val);
        list2 = list2.next;
    }

    // Sort the array
    array.Sort();

    // Create the new sorted linked list from the sorted array
    foreach (int value in array)
    {
        current.next = new ListNode(value);
        current = current.next;
    }

    // Return the head of the new linked list
    return dummy.next;
}


}