class Solution {
    public boolean isValid(String s) {
        Deque<String> stack = new ArrayDeque<>();

       for(char item : s.toCharArray()){
        if(item == "("){
            stack.push(')')
        }
       }
        else if(item == '{'){
            stack.push('}')
        }
    }
        
}
