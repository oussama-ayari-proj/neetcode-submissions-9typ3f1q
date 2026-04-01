class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0;
        int max = 0;
        for (int i : nums){
            if(i==1){
                ones++;
            }else{
                max = Math.max(max,ones);
                ones =0;
            }
        }
        return Math.max(ones,max);
    }
}