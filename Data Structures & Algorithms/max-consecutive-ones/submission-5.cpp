class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int res=0,curCount=0;
        for(int n : nums){
            if(n==1)
                curCount++;
            else{
                res = curCount > res ? curCount : res ;
                curCount = 0;
            }
                
        }
        return curCount > res ? curCount : res ;
    }
};