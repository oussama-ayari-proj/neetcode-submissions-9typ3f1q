class Solution {
    public boolean isAnagram(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        int[] sOcc = new int[26];
        int[] tOcc = new int[26];
        for(char c : schar){
            sOcc[c -'a']++;
        }
        for(char c : tchar){
            tOcc[c -'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(sOcc[i]!=tOcc[i]){
                return false;
            }
        }
        return true;
    }
}
