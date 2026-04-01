class Solution {
    public boolean isAnagram(String s, String t) {
       int[] sOcc = new int[26];
       int[] tOcc= new int[26];
       char[] sArray = s.toCharArray();
       char[] tArray = t.toCharArray();
       for(int i = 0 ; i< sArray.length ; i++){
            sOcc[sArray[i]-'a']++;
       }
        for(int i = 0 ; i< tArray.length ; i++){
            tOcc[tArray[i]-'a']++;
       }
       for(int i = 0 ; i<26 ; i++){
        if(sOcc[i]!=tOcc[i]){
            return false;
        }
       }
       return true;
    }
}
