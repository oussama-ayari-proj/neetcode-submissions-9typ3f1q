class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isAlphabetic(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        char[] sbchar = sb.toString().toCharArray();
        int start = 0;
        int tail = sbchar.length-1;
        while(start<tail){
            if(sbchar[start]!=sbchar[tail]){
                return false;
            }
            start++;
            tail--;
        }
        return true;
    }
}
