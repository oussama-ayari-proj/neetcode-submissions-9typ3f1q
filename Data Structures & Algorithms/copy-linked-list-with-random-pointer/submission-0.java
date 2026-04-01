/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Map<Node,Node> map =new HashMap<>();
        Node it=head;
        while(it!=null){
            map.put(it,new Node(it.val));
            it=it.next;
        }
        it=head;
        while(it!=null){
            Node node=map.get(it);
            node.next=map.get(it.next);
            node.random=map.get(it.random);
            it=it.next;
        }

        return map.get(head);
    }
}
