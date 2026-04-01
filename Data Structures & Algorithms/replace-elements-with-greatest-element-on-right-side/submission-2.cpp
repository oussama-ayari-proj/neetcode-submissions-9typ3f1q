class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int n=arr.size();
        int m=arr[n-1];
        for(int i=n-2;i>=0;i--){
            int curVal=arr[i];
            arr[i]=m;
            m=max(m,curVal);
        }
        arr[n-1]=-1;
        return arr;
    }
};