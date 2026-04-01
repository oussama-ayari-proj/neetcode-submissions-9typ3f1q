class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] key =new  int[26];
            char[] arr = s.toCharArray();
            for(char c : arr){
                key[c-'a']++;
            }
            List<Integer> l = new ArrayList<>();
            for(int i : key){
                l.add(i);
            }
            if(map.containsKey(l)){
                List<String> curr = map.get(l);
                curr.add(s);
                map.put(l,curr);
            }else{
                List<String> curr = new ArrayList<>();
                curr.add(s);
                map.put(l,curr);
            }
        }
        return new ArrayList<>(map.values());

    }
}
