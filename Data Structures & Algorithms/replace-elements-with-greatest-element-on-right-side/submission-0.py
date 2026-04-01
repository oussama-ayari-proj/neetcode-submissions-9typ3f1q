class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        n = len(arr)

        postfix = [-1]*n
        cur_max = arr[-1]
        for i in range(n-2,-1,-1):
            postfix[i]=cur_max
            cur_max = max(arr[i],cur_max)
            
        
        return postfix