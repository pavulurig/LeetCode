class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack();
       // String result = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ']'){
                StringBuilder sequence = new StringBuilder();
                while(st.peek() != '['){
                    sequence.append(st.pop());
                }
                sequence= sequence.reverse();
                st.pop();
                int n =0;
                int multiply=1;
                while(!st.isEmpty() && (st.peek() >= '0' && st.peek()<='9')){
                    n = n + (st.pop() - '0') * multiply;
                    multiply*=10;
                   
                }
               // System.out.println(n);
                //n--;
                StringBuilder fsequence = new StringBuilder();
                while(n>0){
                    fsequence= fsequence.append(sequence);
                    n--;
                }
                for(int j = 0; j<fsequence.length();j++){
                    st.push(fsequence.charAt(j));
                }
                
                
            }else{
                st.push(s.charAt(i));
            }
        }

        char[] result = new char[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return new String(result);
    }
}