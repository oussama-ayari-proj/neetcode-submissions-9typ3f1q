class Solution {
public:
    bool isValid(string s) {
        vector<char> stack_;

        for(char c : s){
            int n = stack_.size();
            if(c == ')'){
                if(n>0 && stack_[n-1] == '(')
                    stack_.pop_back();
                else return false;
            }
            else if(c == '}'){
                if(n>0 && stack_[n-1] == '{')
                    stack_.pop_back();
                else return false;
            }
            else if(c == ']'){
                if(n>0 && stack_[n-1] == '[')
                    stack_.pop_back();
                else return false;
            }else 
            stack_.push_back(c);
        }

        return stack_.begin() == stack_.end();
    }
};
