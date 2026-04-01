class Solution {
    public int characterReplacement(String s, int k) {
        int l= 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int output = 0;
        for(int r = 0; r < s.length() ; r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
            // AAAABBBA , k=2
            int currMaxf = map.values().stream().max(Comparator.naturalOrder()).orElse(1);
            if((((r-l)+1) - currMaxf > k )){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            }

            output = Math.max(output, (r-l)+1);
        }
        return output;
    }
}
