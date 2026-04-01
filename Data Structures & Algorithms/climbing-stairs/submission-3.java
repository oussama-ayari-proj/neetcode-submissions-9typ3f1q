class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;
        int[] dp=new int[]{1,1};
        int i=1;
        while(i<n){
            int tmp=dp[0];
            dp[0]+=dp[1];
            dp[1]=tmp;
            i++;
        }
        return dp[0];
    }
}
