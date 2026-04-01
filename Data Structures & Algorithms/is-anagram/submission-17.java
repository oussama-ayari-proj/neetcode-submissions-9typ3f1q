class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sOcc = new int[26];
        int[] tOcc = new int[26];
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        for(char c : schar){
            sOcc[c-'a']++;
        }
        for(char c : tchar){
            tOcc[c-'a']++;
        }
        for(int i = 0 ;  i <sOcc.length ; i++){
            if(tOcc[i]!=sOcc[i]){
                return false;
            }
        }
        return true;
    }
}
