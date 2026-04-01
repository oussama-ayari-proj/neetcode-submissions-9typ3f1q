class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit=0
        n=len(prices)
        for i in range(1,n):
            profit=max(profit, prices[i]-min(prices[:i]))
        return profit