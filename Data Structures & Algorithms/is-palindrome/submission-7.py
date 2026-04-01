class Solution:

    def isAlphaNum(self, c: str) -> bool:
        return (c>='a' and c<='z') or (c>='0' and c<='9')

    def isPalindrome(self, s: str) -> bool:
        s=s.lower()
        left=0
        right=len(s)-1

        while(left<right):
            if not self.isAlphaNum(s[left]):
                left=left+1
                continue
            if not self.isAlphaNum(s[right]):
                right=right-1
                continue
            
            if s[left]!=s[right]:
                return False
            left=left+1
            right=right-1
        
        return True