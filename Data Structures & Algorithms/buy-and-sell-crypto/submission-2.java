class Solution {
    public int maxProfit(int[] prices) {
     int price = 0;
     for(int i = 0 ; i < prices.length ; i++){
        for(int j = i+1 ; j < prices.length ; j++){
            price=Math.max(price,prices[j]-prices[i]);
        }
     }   
     return price;
    }
}
