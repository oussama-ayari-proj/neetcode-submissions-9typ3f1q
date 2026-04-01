class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        length= float("inf")
        l , n = 0 , len(nums)
        curSum=nums[l]
        if curSum>=target:
            return 1
        for r in range(1,n):
            curSum+=nums[r]

            while curSum>=target and l<=r:
                length=min(length,r-l+1)
                curSum-=nums[l]
                l+=1
        return length if length!=float("inf") else 0