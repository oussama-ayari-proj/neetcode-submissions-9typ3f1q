class Solution {
    Stack<Character> stack=new Stack<>();
    List<String> res=new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backTrack(0,0,n);
        return res;
    }

    public void backTrack(int open,int closed,int n){
        if(open==closed && open==n){
            StringBuilder stringBuilder=new StringBuilder();
            for(Character c : stack)
                stringBuilder.append(c);
            res.add(stringBuilder.toString());
            return;
        }

        if(open<n){
            stack.push('(');
            backTrack(open+1,closed,n);
            stack.pop();
        }
        if(closed<open){
            stack.push(')');
            backTrack(open,closed+1,n);
            stack.pop();
        }
    }
}
