class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        while(true){
            fast=squareSumOfDigits(squareSumOfDigits(fast));
            slow=squareSumOfDigits(slow);
            if(slow == 1)
                return true;
            if(fast == slow)
                return slow==1;
        }
    }
    public int squareSumOfDigits(int n){
        int sum=0;
        while(n!=0){
            sum+=(n%10)*(n%10);
            n=n/10;
        }
        return sum;
    }
}
