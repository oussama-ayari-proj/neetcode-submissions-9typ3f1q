class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniq=new HashSet<>();
        for(int n : nums){
            if(!uniq.add(n))
                return true;
        }
        return false;
    }
}
