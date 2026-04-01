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
        if(list1 == null && list2 == null){
            return list1;
        }
       List<Integer> arr1 = new ArrayList<>();
       ListNode curr1 = list1;
       while(curr1 != null){
            arr1.add(curr1.val);
            curr1=curr1.next;
       }
       List<Integer> arr2 = new ArrayList<>();
       curr1 = list2;
       while(curr1 != null){
            arr2.add(curr1.val);
            curr1 = curr1.next;
       }
       List<Integer> sorted = new ArrayList<>();
       int i = 0;
       int j = 0;
       while( i < arr1.size() && j < arr2.size()){
        if(arr1.get(i) < arr2.get(j)){
            sorted.add(arr1.get(i));
            i++;
        }else if( arr2.get(j) < arr1.get(i)){
            sorted.add(arr2.get(j));
            j++;
        }else{
            sorted.add(arr1.get(i));
            sorted.add(arr2.get(j));
            i++;
            j++;
        }
       }
       while(j<arr2.size()){
           sorted.add(arr2.get(j));
           j++;
       }
       while(i<arr1.size()){
           sorted.add(arr1.get(i));
           i++;
       }
       if (sorted.isEmpty()) return null;
       ListNode head = new ListNode(sorted.get(0));
       ListNode curr = head;
       for(int w = 1 ; w < sorted.size() ; w++){
        curr.next = new ListNode(sorted.get(w));
        curr = curr.next;
       }
       return head;
    }
}