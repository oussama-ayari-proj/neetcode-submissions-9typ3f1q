class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] arrayOfCharCount= new int[26];
            for(char c : s.toCharArray()){
                arrayOfCharCount[c-'a']++;
            }
            String key =  Arrays.toString(arrayOfCharCount);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
            
           
        }
        List<List<String>> output = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            output.add(entry.getValue());
        }
        return output;
        
    }
}
