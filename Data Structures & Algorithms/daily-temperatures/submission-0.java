class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] output = new int[n];
        for(int i=0 ; i < n ; i++ ){
            for (int j = i ; j < n ; j++){
                if(temperatures[i]<temperatures[j]){
                    output[i]=j-i;
                    break;
                }else if(output[i] == 0){
                    continue;
                }else{
                    output[i]=0;
                }
            }
        }
        return output;
    }
}
