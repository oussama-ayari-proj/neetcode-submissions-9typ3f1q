class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer> , List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] occCount = new int[26];
            char[] schar = s.toCharArray();
            for(char c : schar){
                occCount[c-'a']++;
            }
            List<Integer> key = Arrays.stream(occCount).boxed().toList();
            if(map.containsKey(key)){
                List<String> currValue = map.get(key);
                currValue.add(s);
                map.put(key,currValue);
            }else{
                map.put(key, new ArrayList<>(Arrays.asList(s)));
            }
        }
        List<List<String>> output = new ArrayList<>();
        for(Map.Entry<List<Integer>,List<String>> entry : map.entrySet()){
            output.add(entry.getValue());
        }
        return output;
    }
}
