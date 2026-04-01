class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String  s : strs){
            char[] clone = s.toCharArray();
            Arrays.sort(clone);
            String key = new String(clone);
            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(s);
                map.put(key,list);
            }else{
                map.put(key,new ArrayList<>(Arrays.asList(s)));
            }
        }
        List<List<String>> output = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            output.add(entry.getValue());
        }
        return output;
    }
}
