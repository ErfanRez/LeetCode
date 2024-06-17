class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1) return false;
        
        Stack<Character> stack = new Stack<>();
        
        for(char chrc : s.toCharArray()){
            if((chrc == '(' || chrc == '{' || chrc == '[') && chrc != s.charAt(s.length()-1)){
                stack.push(chrc);
            } else if (
            (chrc == ')' && !stack.isEmpty() && stack.peek() == '(') || 
            (chrc == '}' && !stack.isEmpty() && stack.peek() == '{') ||
            (chrc == ']' && !stack.isEmpty() && stack.peek() == '[')
            ){
                stack.pop();
            } else {
                return false;
            }
        }

        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
        
    }
}