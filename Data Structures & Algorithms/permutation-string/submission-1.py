class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s1) > len(s2):
            return False
        l, r = 0, len(s1)-1
        s1=sorted(s1)
        while r < len(s2):
            sign = sorted(s2[l:r+1])
            print(sign)
            if sign==s1:
                return True
            l+=1
            r+=1
            
        return False;
        