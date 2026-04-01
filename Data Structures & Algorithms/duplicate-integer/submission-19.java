class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int number : nums){
            if(list.contains(number)){
                return true;
            }
            list.add(number);
        }
        return false;
    }
}