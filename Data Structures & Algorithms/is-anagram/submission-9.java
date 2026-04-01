class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sChecker = new int[26];
        int[] tChecker = new int[26];
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for(char c : sChar){
            sChecker[c-'a']++;
        }
        for(char c : tChar){
            tChecker[c-'a']++;
        }
        for(int i = 0 ; i<tChecker.length ;i++){
            if(sChecker[i]!= tChecker[i]){
                return false;
            }
        }
        return true;
    }
}
