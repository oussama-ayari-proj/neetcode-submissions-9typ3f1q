class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2){
                return o2.getValue().compareTo(o1.getValue()); 
            }
        });
        int count =0;
        int[] output = new int[k];
        for(Map.Entry<Integer,Integer> entry : list){
            output[count]=entry.getKey();
            count++;
            if(count==k){
                break;
            }
        }
        return output;
        
    }
}
