class Solution {
    public int lengthOfLongestSubstring(String s) {
        int output = 0;
        char[] sarr = s.toCharArray();
        for(int i = 0 ;  i < sarr.length ; i++){
            Set<Character> curr = new HashSet();
            for(int j = i ;  j < sarr.length ; j++){
                if(!curr.contains(sarr[j])){
                    curr.add(sarr[j]);
                }else{
                    break;
                }
            }
            output = Math.max(output,curr.size());
        }
        return output;
    }
}
