class Solution {
public:
    int lengthOfLastWord(string s) {
        int n = s.length()-1;
        int ans=0;

        while(n>=0){
            if(s[n]==' ' && ans!=0)
                break;
            if(s[n]!=' ')
                ans++;
            n--;
        }
        return ans;
    }
};