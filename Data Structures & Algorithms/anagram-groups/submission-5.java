class Solution {
    //radhouene
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map   = new HashMap<>();

        for(int i = 0 ; i<strs.length ; i++){
            char[] cS = strs[i].toCharArray();
            int[] occ = new int[26];
            StringBuilder builderOfOcc=new StringBuilder();
            for(char c : cS){
                occ[c-'a']++;
            }
            for(int o : occ){
                builderOfOcc.append(o).append(",");
            }
            if(!map.containsKey(builderOfOcc.toString())){
                map.put(builderOfOcc.toString(),new ArrayList<>(Arrays.asList(strs[i])));
            }else{
            List<String> valueOfMap = map.get(builderOfOcc.toString());
            valueOfMap.add(strs[i]);
            map.put(builderOfOcc.toString(),valueOfMap);
            }
        }
        List<List<String>> output = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            output.add(entry.getValue());
        }
        return output;
    }
}
