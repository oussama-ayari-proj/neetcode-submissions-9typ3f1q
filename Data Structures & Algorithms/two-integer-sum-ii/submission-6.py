class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left=0
        right=len(numbers)-1

        while(left<right):
            val=numbers[left]+numbers[right]

            if val<target:
                left=left+1
                continue
            if val>target:
                right=right-1
                continue
            
            return [left+1,right+1]