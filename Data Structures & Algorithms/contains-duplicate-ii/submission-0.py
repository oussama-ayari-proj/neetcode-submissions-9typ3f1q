class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        l, n = 0, len(nums)
        window=set()
        window.add(nums[l])
        for r in range(1,n):

            if r-l>k:
                window.remove(nums[l])
                l+=1
            if nums[r] in window:
                return True
            window.add(nums[r])
        return False
            