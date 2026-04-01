class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 ){
            return 0;
        }
        if(nums.length==1) return 1;
        Set<Integer> set  = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int output=1;
        for(int s : set){
            if(set.contains(s+1)){
                int length=1;
                while(set.contains(s+length)){
                    length++;
                }
                output=Math.max(output,length);
            }
        }
        return output;
    }
}
