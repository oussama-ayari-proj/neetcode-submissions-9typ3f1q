import numpy as np
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        
        for i in range(len(nums)):
            v=nums[i]
            for k in range(i+1,len(nums)):
                if v==nums[k] :
                    return True
        return False
            

