class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        
        for c in s:
            if (c==')' or c=='}' or c==']') and len(stack)==0:
                return False

            if (c==')'and stack[-1]=='(') or (c=='}'and stack[-1]=='{') or (c==']'and stack[-1]=='['):
                stack.pop()
            else:
                stack.append(c)
        return len(stack)==0