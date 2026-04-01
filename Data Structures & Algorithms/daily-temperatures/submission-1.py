class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        vals_stack = []
        index_stack = []
        n = len(temperatures)
        res = [0]*n
        vals_stack.append(temperatures[0])
        index_stack.append(0)

        for i in range(1,n):
            print(vals_stack)
            print(index_stack)
            while len(vals_stack)!=0 and temperatures[i] > vals_stack[-1]:
                index = index_stack.pop()
                res[index] = i - index
                vals_stack.pop()
            vals_stack.append(temperatures[i])
            index_stack.append(i)

        return res