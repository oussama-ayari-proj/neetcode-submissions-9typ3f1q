class WebPage {
public:
    string url;
    WebPage* prev;
    WebPage* next;

    WebPage(string url_){
        url = url_;
    }

};

class BrowserHistory {
public:

    WebPage* head;
    WebPage* tail;

    WebPage* cur;

    BrowserHistory(string homepage) {
        head = new WebPage("");
        tail = new WebPage("");

        WebPage* newPage = new WebPage(homepage);
        head->next = newPage;
        newPage->prev=head;
        
        newPage->next = tail;
        tail->prev = newPage;
        
        cur=newPage;
    }
    
    void visit(string url) {
        WebPage* newPage = new WebPage(url);
        WebPage* first = cur->next;

        newPage->prev=cur;
        cur->next=newPage;

        newPage->next=tail;
        tail->prev=newPage;

        cur=newPage;

        while(first!=tail){
            WebPage* nxt=first->next;
            delete first;
            first=nxt;
        }
    }
    
    string back(int steps) {
        while(cur->prev!=head && steps !=0){
            cur=cur->prev;
            steps--;
        }
        return cur->url;
    }
    
    string forward(int steps) {
        while(cur->next!=tail && steps !=0){
            cur=cur->next;
            steps--;
        }
        return cur->url;
    }
};

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory* obj = new BrowserHistory(homepage);
 * obj->visit(url);
 * string param_2 = obj->back(steps);
 * string param_3 = obj->forward(steps);
 */