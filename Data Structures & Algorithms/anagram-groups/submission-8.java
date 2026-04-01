class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] sArr = s.toCharArray();
            int[] sOcc = new int[26];
            for(char c : sArr){
                sOcc[c-'a']++;
            }
            StringBuilder generatedKey= new StringBuilder();
            for(int i: sOcc){
                generatedKey.append(i).append(",");
            }
            System.out.println(generatedKey.toString());
            System.out.println(s);
                map.putIfAbsent(generatedKey.toString(), new ArrayList<>());
                map.get(generatedKey.toString()).add(s);
            
        }
        List<List<String>> output = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            output.add(entry.getValue());
        }
        return output;
        
    }
}
