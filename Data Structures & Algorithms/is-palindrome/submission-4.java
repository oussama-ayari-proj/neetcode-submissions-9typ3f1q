class Solution {
     public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' || 
                c >= 'a' && c <= 'z' || 
                c >= '0' && c <= '9');
    }
    public boolean isPalindrome(String s) {
       StringBuilder checkString = new StringBuilder();
       char[] sA = s.toLowerCase().toCharArray();
       for(char c : sA){
        if(alphaNum(c)){
            checkString.append(c);
        }
       }
       char[] clearedString = checkString.toString().toCharArray();
       int left=0;
       int right= clearedString.length-1;
       while(right>left){
        System.out.println(clearedString[left]+" "+clearedString[right]);
        if(clearedString[left]!=clearedString[right]){
            return false;
        }
        right--;
        left++;
       }
       return true;
    }
}
