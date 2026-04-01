class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> occ1 = new HashMap<>();
        Map<Character,Integer> occ2 = new HashMap<>();
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        for(char c : schar){
            findOcc(occ1,c);
        }
        for(char c : tchar){
            findOcc(occ2,c);
        }
        if(occ1.size() != occ2.size()){
            return false;
        }
        for(Map.Entry<Character,Integer> entry : occ1.entrySet()){
            if(!occ2.containsKey(entry.getKey())){
                return false;
            } else if(occ2.containsKey(entry.getKey()) 
            && !occ2.get(entry.getKey()).equals(entry.getValue())){
                return false;
            }
        }
        return true;

    }
    private void findOcc(Map<Character,Integer> map,char c){
        if(map.containsKey(c)){
            map.put(c,map.get(c)+1);
        }else{
            map.put(c,1);
        }
    }
}
