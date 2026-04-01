class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer , Integer> map = new HashMap<>();

       for(int i :nums){
        if(!map.containsKey(i)){
            map.put(i,1);
        }else{
            map.put(i,map.get(i)+1);
        }
       }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry<Integer,Integer> m1, Map.Entry<Integer,Integer> m2){
                int cp = m2.getValue().compareTo(m1.getValue());
                return cp;
            }
        });
        int count =0;
        int[] output = new int[k];
        for(Map.Entry<Integer,Integer> m :list){
            if(count<k){
                output[count]=m.getKey();
                count++;
            }else{
                break;
            }
        }
        return output; 
    }
}
