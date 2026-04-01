class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if(len(nums)==0):
            return 0
        uniques=set(nums)
        
        res= 0
        for num in uniques:
            if(num-1 not in uniques):
                count=1
                while(num+1 in uniques):
                    count=count+1
                    num=num+1
                res=max(res,count)
                   
        return res