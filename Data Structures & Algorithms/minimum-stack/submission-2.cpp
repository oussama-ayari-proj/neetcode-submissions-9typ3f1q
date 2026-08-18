class MinStack {
public:
    vector<int> stack_;
    vector<int> min_stack_;
    int min;

    MinStack() {
        
    }
    
    void push(int val) {
        stack_.push_back(val);
        if(stack_.size() == 1 )
            min = val;
        else min = val < min ? val : min;
        min_stack_.push_back(min);
    }
    
    void pop() {
        stack_.pop_back();
        min_stack_.pop_back();
    }
    
    int top() {
        return stack_[stack_.size()-1];
    }
    
    int getMin() {
        return min_stack_[min_stack_.size()-1];
    }
};
