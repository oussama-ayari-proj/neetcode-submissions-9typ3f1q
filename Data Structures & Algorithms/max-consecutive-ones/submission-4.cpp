class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int count=0,res=0,n=nums.size();

        for(int i=0;i<n;i++){
            if(nums[i]==1)
                count++;
            else {
                res=max(res,count);
                count=0;
            }
        }

        return max(res,count);
    }
};