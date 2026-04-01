class Solution:
    def compareTriplets(self, t1: List[int],t2: List[int]) -> bool:
        n=0
        for i in range(3):
            if t1[i]==t2[i]:
                n=n+1
        return n==3
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n=len(nums)
        res=[]
        for i in range(n):
            cur=nums[i]
            m={}
            for j in range(i,n):
                val=nums[j]
                if (-val-cur) in m.keys():
                    if i!=j and i!=m[(-val-cur)] and j!=m[(-val-cur)]:
                        candidate=sorted([cur,val,(-val-cur)])
                        test=True
                        for t in res:
                            if self.compareTriplets(candidate,t):
                                test=False
                        if test:
                            res.append(candidate)
                m[val]=j
        return res
        
        