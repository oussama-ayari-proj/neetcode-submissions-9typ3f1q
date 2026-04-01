class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        res=0
        l , n = 0 , len(arr)
        curSum=arr[l]
        if k==1 and curSum>=threshold:
            res+=1
        for r in range(1,n):
            
            if r - l + 1 > k:
                curSum-=arr[l]
                l+=1
            curSum+=arr[r]
            if (r - l + 1 == k):
                if int(curSum/k) >= threshold:
                    res= res+1

            
            
        return res
