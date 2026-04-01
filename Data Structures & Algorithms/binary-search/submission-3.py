class Solution:
    def search(self, nums: List[int], target: int) -> int:
        n = len(nums)
        start, end = 0, n-1

        while end - start + 1 > 0:
            mid = int(start + (end - start + 1)/2)
            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                start = mid + 1
            else:
                end = mid -1

        return -1