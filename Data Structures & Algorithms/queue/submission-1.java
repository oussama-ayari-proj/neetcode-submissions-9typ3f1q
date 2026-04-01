class Deque {

    Node head;
    Node tail;
    public Deque() {
        head=new Node(0);
        tail=new Node(0);
        head.next=tail;
        tail.prev=head;
    }

    public boolean isEmpty() {
        return this.head.next==this.tail;
    }

    public void append(int value) {
       Node tmp=this.tail.prev;
       Node node=new Node(value,tmp,this.tail);
       tmp.next=node;
       this.tail.prev=node;
    }

    public void appendleft(int value) {
        Node tmp=this.head.next;
        Node node=new Node(value,this.head,tmp);
        this.head.next=node;
        tmp.prev=node;
    }

    public int pop() {
        if(this.isEmpty()) return -1;
        Node last=this.tail.prev;
        Node prev=last.prev;

        prev.next=this.tail;
        this.tail.prev=prev;

        last.next=null;
        last.prev=null;

        return last.val;
    }

    public int popleft() {
        if(this.isEmpty()) return -1;
        Node first=this.head.next;
        Node next=first.next;

        next.prev=this.head;
        this.head.next=next;

        first.next=null;
        first.prev=null;

        return first.val;
    }
}
class Node{
    int val;
    Node next;
    Node prev;
    public Node(int val, Node prev, Node next){
        this.val=val;
        this.prev=prev;
        this.next=next;
    }
    public Node(int val){
        this(val,null,null);
    }
}