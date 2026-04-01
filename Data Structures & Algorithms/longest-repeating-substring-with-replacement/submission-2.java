class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map  = new HashMap<>();
        char[] arr = s.toCharArray();
        int l=0;
        int maxOcc=0;
        int output =0;
        for(int i = 0 ; i < arr.length ; i++ ){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
            maxOcc=Math.max(maxOcc,map.get(arr[i]));
            if((i-l+1)-maxOcc>k){
                map.put(arr[l],map.get(arr[l])-1);
                l++;
            }
            output = Math.max(output,i-l+1);
        }
        return output;
    }
}
