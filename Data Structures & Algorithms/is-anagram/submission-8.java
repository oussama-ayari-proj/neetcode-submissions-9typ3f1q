class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int[] sOcc = new int[26];
        int[] tOcc = new int[26];
        for(char c : sArr){
            sOcc[c-'a']++;
        }
        for(char c : tArr){
            tOcc[c-'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(sOcc[i]!=tOcc[i]){
                return false;
            }
        }
        return true;

    }
}
