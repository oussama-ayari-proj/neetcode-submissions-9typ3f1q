class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        postfix[nums.length-1] = nums[nums.length-1];
        prefix[0] = nums[0];
        int j=nums.length-2;
        for(int i = 1 ; i < nums.length ; i++){
            prefix[i]=prefix[i-1]*nums[i];
            postfix[j]=postfix[j+1]*nums[j];
            j--;
        }
        int[] output = new int[nums.length];
        for(int i = 0 ; i<nums.length ;i++){
            if(i-1>=0 && i+1<nums.length){
                output[i]=prefix[i-1]*postfix[i+1];
            }else if(i-1<0){
                output[i]=postfix[i+1];
            }else{
                output[i]=prefix[i-1];
            }
        }
        return output;
    }
}  
