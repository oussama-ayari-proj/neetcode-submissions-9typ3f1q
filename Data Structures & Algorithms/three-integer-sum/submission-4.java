class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                for(int k = j+1 ; k < nums.length ; k++){
                    if(nums[i]+nums[k]+nums[j]== 0){
                        List<Integer> list = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                        Collections.sort(list);
                        if(!output.contains(list)){
                            output.add(list);
                        }
                    }
                }
            }
        }
        return output;
    }
}
