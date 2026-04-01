class Solution:
    def maxTurbulenceSize(self, arr: List[int]) -> int:
        prev=""
        l=0
        r=1
        n=len(arr)
        res=1
        while r<n:
            if arr[r]>arr[r-1] and prev!=">":
                res=max(res,r-l+1)
                r+=1
                prev=">"
                print(l,r)
            elif arr[r]<arr[r-1] and prev!="<":
                res=max(res,r-l+1)
                r+=1
                prev="<"
                print(l,r)
            else:
                if arr[r]==arr[r-1]:
                    r+=1
                l=r-1
                prev=""
            
        return res