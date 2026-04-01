class Solution {
    public int maxProfit(int[] prices) {
        //brute 
        int profit = 0;
        for(int i = 0 ; i < prices.length ; i++){
            int buy = prices[i];
            for(int j = i+1; j < prices.length ; j++){
                if(prices[j] - buy > profit){
                    profit = prices[j] - buy;
                }
            }
        }
        return profit;
    }
}
