class Solution {
    public String maximumNumber(String num, int[] change) {
        StringBuilder str = new StringBuilder(num);
        int flag = 0;
        for(int i=0;i<num.length();i++){
            int c = num.charAt(i)-'0';
            int a = change[c];
            //System.out.println(c);
            if(a>=c){
                if(a!=c)
                    flag=1;
                //char cc=(char)a; 
                char cc = Integer.toString(a).charAt(0);
                //System.out.println(cc);
                str.setCharAt(i,cc);
            }else{
                if(flag == 1) break; 
            }
        }
        return str.toString();
        
    }
}