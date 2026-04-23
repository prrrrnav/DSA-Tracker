        if(item == "("){
            stack.push(')');
        }
       }
        else if(item == '{'){
            stack.push('}');
        }
        else if(item == '['){
            stack.push(']');
        }


       for(char i : s.toCharArray()){
        if(stack.top == i){
        }
            stack.pop();
        }
        else{
            return false;
        }
       for(char item : s.toCharArray()){
       }
    
    }
}
