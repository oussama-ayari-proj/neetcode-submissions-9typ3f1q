class Solution {
 
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            char[] arr = s.toCharArray();
            String check = "({[";
            for(char c : arr){
                if(check.contains(c+"")){
                    stack.push(c);
                }else{
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(c == ']'  && stack.pop() != '['){
                        return false;
                    }
                    if(c == ')'  && stack.pop() != '('){
                        return false;
                    }
                    if(c == '}'  && stack.pop() != '{'){
                        return false;
                    }
                }
            }
            return stack.isEmpty();
 
        }
}
