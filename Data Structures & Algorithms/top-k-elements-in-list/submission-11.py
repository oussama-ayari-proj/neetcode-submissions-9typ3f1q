class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        occ=defaultdict(int)

        for i in nums:
            occ[i]=occ[i]+1
        
        occ = sorted(occ.items(),key=lambda x : x[1],reverse=True)
        res=[]
        for i in range(k):
            res.append(occ[i][0])
        return res