class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this(val,null);
    }
    public ListNode(int val , ListNode next){
        this.val=val;
        this.next=next;
    }
}
class LinkedList {
    private ListNode headNode;
    private ListNode tailNode;
    public LinkedList() {
       this.headNode = new ListNode(-1);
       this.tailNode = this.headNode;
    }

    public int get(int index) {
        int k =0;
        ListNode curr=this.headNode.next;
        while(curr!=null){
            if(k==index){
                return curr.val;
            }
            k++;
            curr=curr.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next=headNode.next;
        headNode.next=newNode;
        if(newNode.next==null){
            tailNode=newNode;
        }

    }

    public void insertTail(int val) {
        this.tailNode.next = new ListNode(val);
        this.tailNode = this.tailNode.next;
        
    }

    public boolean remove(int index) {
        int i = 0 ;
        ListNode curr = this.headNode; 
       while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }
         if (curr != null && curr.next != null) {
            if (curr.next == this.tailNode) {
                this.tailNode = curr;
            }
            curr.next = curr.next.next;
            System.out.println(curr.val);
            System.out.println(get(0) + " " + get(1) + " " + get(2) );
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ListNode curr= this.headNode.next;
        ArrayList<Integer> list = new ArrayList<>();
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        return list;
    }
}
