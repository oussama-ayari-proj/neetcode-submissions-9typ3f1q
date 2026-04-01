class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(dp(cost,0),dp(cost,1));
    }
    public int dp(int[] cost,int i){
        if(i>=cost.length)
            return 0;
        return cost[i]+Math.min(dp(cost,i+1),dp(cost,i+2));
    }
}
