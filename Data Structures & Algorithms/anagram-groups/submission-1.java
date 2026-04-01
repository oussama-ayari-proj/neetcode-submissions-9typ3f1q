class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            //System.out.println(Arrays.toString(count));
            if(!map.containsKey(Arrays.toString(count))){
                map.put(Arrays.toString(count),new ArrayList<>());
            }
            map.get(Arrays.toString(count)).add(s);
        }
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
        
        return new ArrayList<>(map.values());
    }
}
