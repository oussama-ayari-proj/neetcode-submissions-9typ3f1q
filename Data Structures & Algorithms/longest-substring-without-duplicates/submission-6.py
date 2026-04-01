class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if s=="":
            return 0
        res=1
        l , r = 0, 1
        n=len(s)
        f={}
        f[s[l]]=1
        while r<n:
            if s[r] in f.keys():
                f[s[r]]+=1
            else:
                f[s[r]]=1
            while l<r and f[s[r]]>1:
                f[s[l]]-=1
                l+=1
            res=max(res,r-l+1)
            r+=1
        return res