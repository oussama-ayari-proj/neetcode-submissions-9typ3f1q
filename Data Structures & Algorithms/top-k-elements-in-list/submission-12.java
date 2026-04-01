class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            countOcc(map,i);
        }
        int[] output = new int[k];
        for(int i = 0 ; i < k ; i++){
            int max = Integer.MIN_VALUE;
            int key = -1;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue()>=max){
                    max = entry.getValue();
                    key = entry.getKey();
                }
            }
            map.remove(key);
            output[i]= key;
        }
        return output;
    }
    private void countOcc(Map<Integer,Integer> map,int val){
        if(map.containsKey(val)){
            map.put(val,map.get(val)+1);
        }else{
            map.put(val,1);
        }
    }
}
