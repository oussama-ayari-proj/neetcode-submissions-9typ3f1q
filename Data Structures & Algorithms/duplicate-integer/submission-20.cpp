class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> hashSet;
        for(int n : nums){
            if(hashSet.find(n) != hashSet.end())
                return true;
            hashSet.insert(n);
        }
        return false;
    }
};