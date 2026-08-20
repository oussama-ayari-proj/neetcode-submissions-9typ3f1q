class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* res = new ListNode();
        ListNode* it = res;
        while(list1 && list2){
            if(list1->val < list2->val){
                it->next = list1;
                list1 = list1->next;
            }else{
                it->next = list2;
                list2 = list2->next;
            }
            it= it->next;
        }
        it->next = list1 ? list1 : list2;
        return res->next;
    }
};