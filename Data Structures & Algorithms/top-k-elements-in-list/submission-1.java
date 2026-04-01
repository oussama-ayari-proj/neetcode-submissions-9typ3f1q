class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            if(!map.containsKey(n)){
                map.put(n,1);
            }else{
                map.put(n,map.get(n)+1);
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
        int i=0;
        int[] output = new int[k];
        System.out.println(list);
        for(Map.Entry<Integer,Integer> entry : list){
            if(i<k){
                output[i]=entry.getKey();
                i++;
            }
        }
        return output;
    }
}
