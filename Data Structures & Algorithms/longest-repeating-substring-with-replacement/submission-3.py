class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        res=1
        l = 0
        n=len(s)
        f={}
        maxOcc=1
        for r in range(n):
            # Add right element to hashmap
            if s[r] not in f.keys():
                f[s[r]]=1
            else:
                f[s[r]]+=1
            
            # Calculate the maxOcc
            maxOcc=max(maxOcc,f[s[r]])

            # Resize Sliding Window
            if (r-l+1-maxOcc)>k:
                f[s[l]]-=1
                l+=1

            # Update res
            res=max(res,r-l+1)
        return res
            
            