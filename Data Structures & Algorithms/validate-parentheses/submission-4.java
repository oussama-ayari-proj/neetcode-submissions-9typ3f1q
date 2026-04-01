class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr= s.toCharArray();
        String  check = "([{";
       
        for(int i = 0 ; i <arr.length ; i++){
            if(check.contains(arr[i]+"")){
                stack.push(arr[i]);
            }else{
                if (stack.isEmpty()) return false;
                if(arr[i]==']' && stack.pop()!='['){
                    return false;
                }
                else if(arr[i]==')' && stack.pop()!='('){
                    return false;
                }
                else if(arr[i]=='}' && stack.pop()!='{'){
                     return false;
                }   
            }
        }
        return stack.isEmpty();
    }
}
