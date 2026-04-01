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
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){ 
            list.add(entry.getValue());
            System.out.println(entry.getValue());
        }
        Collections.sort(list);
        List<Integer> checker = new ArrayList<>();
        for(int i = list.size()-1 ; i>=0 ; i--){
            if(list.size()-i<=k){
                checker.add(list.get(i));
            }
        }
        int[] output = new int[k];
        int oi = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if( checker.contains(entry.getValue()) && oi<k){
                output[oi] = entry.getKey();
                oi++;
            }
        }
        return output;

    }
}
