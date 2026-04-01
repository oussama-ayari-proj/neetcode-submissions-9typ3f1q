class Solution {
    public boolean isPalindrome(String s) {
        char[] sChar= s.toLowerCase().toCharArray();
        StringBuilder builder = new StringBuilder(); 
        for(char c : sChar){
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                builder.append(c);
            }
        }
        
        char[] bChar = builder.toString().toCharArray();
        int left = 0;
        int right = bChar.length - 1;
        while(left<=right){
            if(bChar[left]==bChar[right]){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
