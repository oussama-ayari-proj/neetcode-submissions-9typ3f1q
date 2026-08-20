class ListNode{
public:
    int val;
    ListNode* next=nullptr;
    ListNode* prev=nullptr;

    ListNode(int val_){
        val=val_;
    }
};

class MyLinkedList {
public:

    ListNode* head;
    ListNode* tail;

    int length=0;

    MyLinkedList() {
        head = new ListNode(-1);
        tail = new ListNode(-1);
        head->next = tail;
        tail->prev = head;
    }
    
    int get(int index) {
        if(index < 0 || index >= length)
            return -1;
        int i = 0;
        ListNode* it=head->next;
        while(i < length){
            if(i==index)
                return it->val;
            it=it->next;
            i++;
        }
        return -1;
    }
    
    void addAtHead(int val) {
        ListNode* newHead=new ListNode(val);
        ListNode* oldHead = head->next;
        oldHead->prev = newHead;
        newHead->next = oldHead;
        newHead->prev = head;
        head->next=newHead;
        length++;
    }
    
    void addAtTail(int val) {
        ListNode* newTail = new ListNode(val);
        ListNode* oldTail = tail->prev;
        oldTail->next = newTail;
        newTail->prev = oldTail;
        newTail->next = tail;
        tail->prev = newTail;
        length++;
    }
    
    void addAtIndex(int index, int val) {
        if(index < 0 || index > length) return;
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == length){
            addAtTail(val);
            return;
        }
        int i = 0;
        ListNode* it=head->next;
        while(i < index){
            it=it->next;
            i++;
        }
        ListNode* newNode = new ListNode(val);
        ListNode* pre = it->prev;
        pre->next = newNode;
        newNode->prev = pre;
        newNode->next=it;
        it->prev=newNode;
        length++;
    }
    
    void deleteAtIndex(int index) {
        if(index < 0 || index >= length) return;
        int i = 0;
        ListNode* it=head->next;
        while(i < index){
            it=it->next;
            i++;
        }
        ListNode* pre=it->prev;
        ListNode* nxt=it->next;
        pre->next = nxt;
        nxt->prev=pre;
        delete it;
        length--;
    }
};