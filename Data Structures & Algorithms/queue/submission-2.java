class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    public ListNode(int val){
        this.next=null;
        this.val =val ;
        this.prev=null;
    }
}

class Deque {
    private ListNode head;
    private ListNode tail;
    public Deque() {
        head = new ListNode(-1);
        tail = new ListNode(-1);
        this.head.next=tail;
        this.tail.prev=this.head;
    }

    public boolean isEmpty() {
        if(this.head.next==this.tail){
            return true;
        }
        return false;
    }

    public void append(int value) {
       ListNode nodeToAppend = new ListNode(value);
       nodeToAppend.prev= this.tail.prev;
       nodeToAppend.next=this.tail;
       this.tail.prev.next=nodeToAppend;
       this.tail.prev=nodeToAppend;
    }

    public void appendleft(int value) {
       ListNode nodeToAppend = new ListNode(value);
       nodeToAppend.next = this.head.next;
       nodeToAppend.prev = this.head;
       this.head.next.prev=nodeToAppend;
       this.head.next=nodeToAppend;
    }

    public int pop() {
        if(isEmpty()){
            return -1;
        }
       ListNode nodeToReturn = this.tail.prev;
       ListNode prevNode = nodeToReturn.prev;
        int  val = nodeToReturn.val;
        this.tail.prev=prevNode;
        prevNode.next=this.tail;
        return val;
    }

    public int popleft() {
        if(isEmpty()){
            return -1;
        }
        ListNode nodeToPop = this.head.next;
        ListNode nextNode = nodeToPop.next;
        int val  = nodeToPop.val;
        this.head.next=nextNode;
        nextNode.prev=this.head;
        return val;
    }
}
