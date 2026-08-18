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
        min = val < min ? val : min;
        min_stack_.push_back(min);
    }
    
    void pop() {
        min_stack_.pop_back();
        stack_.pop_back();
        if (!min_stack_.empty()) {
            min = min_stack_[min_stack_.size()-1];
        }
    }
    
    int top() {
        return stack_[stack_.size()-1];
    }
    
    int getMin() {
        return min_stack_[min_stack_.size()-1];
    }
};