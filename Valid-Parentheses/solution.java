            stack.push(')');
        }
       }
        else if(item == '{'){
            stack.push('}');
        }
        else if(item == '['){
            stack.push(']');
        }


    
    return true;
    public boolean isValid(String s) {
        Deque<char> stack = new ArrayDeque<>();

       for(char item : s.toCharArray()){
        if(item == '('){
class Solution {
        else{
            if(stack.isEmpty() || stack.pop()!=item){
        }
                
            }
    }
}
