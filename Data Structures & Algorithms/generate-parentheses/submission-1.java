class Solution {
    public List<String> generateParenthesis(int n) {
     List<String> output = new ArrayList<>();
     dfs("",output,n);
     return output;   
    }
    private boolean isValid(String s) {
        int open = 0;
        for(char c : s.toCharArray()){
            if(c=='('){open++;}
            else{open--;}
            if(open<0){
                return false;
            }
        }
        return open ==0;
    }
    private void dfs(String s, List<String> output , int n){
        if(n*2==s.length()){
            if(isValid(s)){output.add(s);}
            return;
        }
        dfs(s+'(',output,n);
        System.out.println(s);
        dfs(s+')',output,n);
        System.out.println(s);
    }
}
