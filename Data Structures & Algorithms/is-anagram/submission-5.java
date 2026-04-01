class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sOcc = new int[26];
        int[] tOcc = new int[26];
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for(char c : sArr){
            sOcc[c-'a']++;
        }
        
        for(char c : tArr){
            tOcc[c-'a']++;
        }
        for(int i = 0 ; i<26 ; i++){
            if(tOcc[i]!=sOcc[i]){
                return false;
            }
        }
        return true;
    }
}
