class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        boolean flag= true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) =='{' || s.charAt(i) =='[' ){
            st.push(s.charAt(i));
            }else{
                if(st.empty()){
                    flag=false;
                    break;
                }
                else{
                    if(s.charAt(i) == ']' && st.peek() !='['){
                        flag = false;
                    }else if(s.charAt(i) == ')' && st.peek() !='('){
                        flag = false;
                    }
                    else if(s.charAt(i) == '}' && st.peek() !='{'){
                        flag = false;
                    }else{
                        st.pop();
                    }
                }
            }
        }
        if(!st.empty()){
            flag=false;
        }
        return flag;
    }
}