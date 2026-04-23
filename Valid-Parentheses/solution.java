            stack.push(')');
        }
    return stack.isEmpty();
        else if(item == '{'){
            stack.push('}');
        }
        else if(item == '['){
            stack.push(']');
        }

        if(item == '('){
        else{
            if(stack.isEmpty() || stack.pop()!=item){
        }
                return false;
            }
    }
       for(char item : s.toCharArray()){

        Deque<Character> stack = new ArrayDeque<>();
       }
}
class Solution {
    public boolean isValid(String s) {
