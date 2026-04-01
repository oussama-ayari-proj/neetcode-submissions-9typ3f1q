class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int[] output = new int[k];
        for(int i = 0 ; i< k ; i++){
        int max = Integer.MIN_VALUE;
        int key = 0;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(max <= entry.getValue()){
                    key = entry.getKey();
                    max = entry.getValue();
                }
            }
            output[i] = key;
            map.put(key,-1001);
        }
        return output;
    }
}
