class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        int carry=(digits[i]+1)/10;
        digits[i]=(digits[i]+1)%10;
        i--;
        while(carry!=0 && i>=0){
            carry=(digits[i]+carry)/10;
            digits[i]=(digits[i]+1)%10;
            i--;
        }
        if(carry != 0){
            int[] updated=new int[digits.length+1];
            updated[0]=carry;
            for(int j=0;j<digits.length;j++){
                updated[j+1]=digits[j];
            }
            return updated;
        }
        return digits;
    }
}
