class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
    
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        int[] output = new int[k];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : entryList) {
            if(i>=k){
                break;
            }
            output[i]=entry.getKey();
            i++;
        }
        return output;
    }
}
