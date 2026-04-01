class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        stored={}

        for i in range(len(nums)):
            val=nums[i]
            
            if target - val in stored.keys() and stored[target - val]!=i:
                return [stored[target-val],i]
            stored[val] = i
        return []


        

