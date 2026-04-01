class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int[] sc = new int[26];
        int[] st = new int[26];
        for(char c : sArr){
            sc[c-'a']++;
        }
        for(char c : tArr){
            st[c-'a']++;
        }
        for(int i = 0 ; i<26 ;i++){
            if(st[i]!=sc[i]){
                return false;
            }
        }

        return true;

    }
}
