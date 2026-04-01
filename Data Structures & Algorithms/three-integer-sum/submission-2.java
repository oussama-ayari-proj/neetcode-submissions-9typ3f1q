class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
       for(int i = 0 ; i < n ; i++ ){
        for(int j =i+1 ; j < n ; j++){
            for(int k = j+1 ; k < n ; k++){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> lis = new ArrayList<>();
                    lis.add(nums[i]);
                    lis.add(nums[j]);
                    lis.add(nums[k]);
                    Collections.sort(lis);
                    if(!list.contains(lis)){
                        list.add(lis);
                    }
                }
            }
        }
        
       }
       return list;
    }
}
