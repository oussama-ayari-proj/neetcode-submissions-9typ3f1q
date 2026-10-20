class Solution {
public:
    int countStudents(vector<int>& students, vector<int>& sandwiches) {
        queue<int> q;
        int n = students.size();

        for(int s : students){
            q.push(s);
        }

        int res=n;
        for(int sandwich : sandwiches){
            int cur_count=0;
            while(cur_count<n && q.front()!=sandwich){
                int val = q.front();
                cur_count++;
                q.pop();
                q.push(val);
            }
            if(q.front()==sandwich){
                res--;
                q.pop();
            }else break;
        }

        return res;
    }
};