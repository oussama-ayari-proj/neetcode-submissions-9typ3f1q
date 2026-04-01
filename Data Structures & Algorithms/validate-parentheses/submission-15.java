class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ar = s.toCharArray();
        String checker = "([{";
        for(char c : ar) {
            if(checker.contains(c+"")) {
                stack.push(c);
            }else {
                if(stack.isEmpty()){return false;}
                if(c==']' && stack.pop()!='['){
                    return false;
                }
                if(c==')' && stack.pop()!='('){
                    return false;
                }
                if(c=='}' && stack.pop()!='{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
