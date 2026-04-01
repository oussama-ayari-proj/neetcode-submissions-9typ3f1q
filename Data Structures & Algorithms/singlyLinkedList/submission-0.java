class ListNode{
    int val;
    ListNode next;

    public ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }

    public ListNode(int val){
        this(val,null);
    }
}

class LinkedList {

    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        this.head=new ListNode(-1);
        this.tail=this.head;
    }

    public int get(int index) {
        int i=0;
        ListNode p=this.head.next;
        while(i<index && p!=null){
            i++;
            p=p.next;
        }
        return p!=null ? p.val : -1;
    }

    public void insertHead(int val) {
        ListNode node=new ListNode(val,this.head.next);
        this.head.next=node;
        if(node.next==null)
            this.tail=node;
    }

    public void insertTail(int val) {
        this.tail.next=new ListNode(val);
        this.tail=this.tail.next;
    }

    public boolean remove(int index) {
        int i=0;
        ListNode p=this.head;
        while(i<index && p!=null){
            i++;
            p=p.next;
        }
        if(p!=null && p.next!=null){
            if(p.next==this.tail)
                this.tail=p;
            p.next=p.next.next;
            return true;
        }

        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values=new ArrayList<>();
        ListNode p=head.next;
        while(p!=null){
            values.add(p.val);
            p=p.next;
        }
        return values;
    }
}
