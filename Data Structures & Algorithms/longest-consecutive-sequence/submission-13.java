class Solution {
    public int longestConsecutive(int[] nums) {
       
       


       Set<Integer> set  = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
       int output=0;
       for(int i : set){
        int count=1;
            while(set.contains(i+count)){
                count++;
            }
        output=Math.max(count,output);
       }
       return output;
    }
}
