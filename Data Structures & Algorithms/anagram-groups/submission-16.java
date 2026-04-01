class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap<>();
        for(String  s : strs){
            Integer[] charOcc = new Integer[26];
            Arrays.fill(charOcc, 0);
            for(char c : s.toCharArray()){
                charOcc[c-'a']++;
            }
            List<Integer> key = Arrays.asList(charOcc);
            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(s);
                map.put(key,list);
            }else{
                map.put(key,new ArrayList<>(Arrays.asList(s)));
            }
        }
        List<List<String>> output = new ArrayList<>();
        for(Map.Entry<List<Integer>, List<String>> entry : map.entrySet()){
            output.add(entry.getValue());
        }
        return output;
    }
}
