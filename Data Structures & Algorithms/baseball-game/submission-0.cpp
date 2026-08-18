class Solution {
public:
    int calPoints(vector<string>& operations) {
        vector<int> record;
        for (string op : operations){
            int n = record.size();
            if (op == "+"){
                if(n>=2)
                    record.push_back(record[n-1] + record[n-2]);
                else record.push_back(record[n-1]);
            }else if (op == "C"){
                record.pop_back();
            }else if (op == "D"){
                record.push_back(record[n-1]*2);
            }else {
                record.push_back(stoi(op));
            }
            /*for(int num : record)
                cout << num << " ";
            cout << "\n";*/
        }
        int res=0;
        for(int num : record)
            res+=num;
        return res;
    }
};