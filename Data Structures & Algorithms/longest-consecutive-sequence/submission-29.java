class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set  = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int longest = 0;
        for(int i : set){
            int checklongest = 1;
            while(set.contains(i+1)){
                checklongest++;
                i++;
            }
            longest = Math.max(longest,checklongest);
        }
        return longest;
    }
}
