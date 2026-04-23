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
        if(stack.peek() == i){
        }
            stack.pop();
        }
        else{
            return false;
        }
       }
    return true;
    }
}
