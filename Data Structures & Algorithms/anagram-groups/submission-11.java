class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] sArr = s.toCharArray();
            int[] sCount = new int[26];
            for(char c : sArr){
                sCount[c-'a']++;
            }
            StringBuilder keyB = new StringBuilder();
            for(int i : sCount){
                keyB.append(i).append("#");
            }
            String key = keyB.toString();
            System.out.println(key);
            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(s);
                map.put(key,list);
            }else{
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(key,l);
            }
        }
        List<List<String>> output = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            output.add(entry.getValue());
        }
        return output;
    }
}
