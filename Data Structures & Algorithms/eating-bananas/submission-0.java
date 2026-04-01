class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=piles[0];
        
        for(int p : piles)
            high=Math.max(high,p);

        int res=high;
        while(low<=high){
            int mid=low+((high-low)/2);
            int totalTime=0;
            for(int p : piles){
                totalTime+=Math.ceil((double)p/mid);
            }
            if(totalTime<=h){
                high=mid-1;
                res=Math.min(res,mid);
            }else{
                low=mid+1;
            }
        }
        return res;
    }
}
