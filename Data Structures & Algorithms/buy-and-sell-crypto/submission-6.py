class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit=0
        l,r=0,1
        n=len(prices)
        while r<n:
            profit = max(profit,prices[r]-prices[l])
            if prices[r]<prices[l]:
                l=r
            else:
                r=r+1
        return profit


