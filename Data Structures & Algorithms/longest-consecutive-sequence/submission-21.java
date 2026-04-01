class Solution {
    public int longestConsecutive(int[] nums) {
        
    Set<Integer> set = new HashSet<>();
    for(int i : nums){
        set.add(i);
    }
    int max = Integer.MIN_VALUE;
    for(int i : set){
        int checkMax=1;
        while(set.contains(i+1)){
            checkMax++;
            i++;
        }
        max=Integer.max(max,checkMax);
    }
    return Integer.max(max,0);
    }
}
