class Solution {
    public int lengthOfLongestSubstring(String s) {
        //s = "zxyzxyz"
        //zxy -  
        //3 -
        if (s == null || s.length() == 0) {
        return 0;
    }

    int l = 0;
    int r = 0;
    int maxLength = 0;
    Set<Character> charSet = new HashSet<>();

    while (r < s.length()) {
        if (!charSet.contains(s.charAt(r))) {
            charSet.add(s.charAt(r));
            r++;
            maxLength = Math.max(maxLength, r - l);
        } else {
            charSet.remove(s.charAt(l));
            l++;
        }
    }
    
    return maxLength;
    }
}
