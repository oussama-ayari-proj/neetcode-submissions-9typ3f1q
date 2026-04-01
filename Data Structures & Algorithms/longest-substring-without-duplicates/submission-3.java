class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0;
        int r =0;
        Set<Character> set = new HashSet<>();
        int max = 0;
        char[] arr = s.toCharArray();
        while(r < arr.length){
            if(!set.contains(arr[r])){
                set.add(arr[r]);
                r++;
                max = Math.max(max, r-l);
            }else{
                set.remove(arr[l]);
                l++;
            }
        }
        return max;
    }
}
