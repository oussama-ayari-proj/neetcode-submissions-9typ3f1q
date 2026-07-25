class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashmap = {}
        n=len(nums)
        for i in range(n) :
            curKeys = hashmap.keys()
            if curKeys.__contains__(target - nums[i]):
                return [hashmap[target - nums[i]],i]
            hashmap[nums[i]]=i
        return []