class Solution {
    int dp[][][] = new int[32][3][3]; 
    public int findIntegers(int n) {
        String  s = "";
        int m = n;
        while(m>0){
            s+=Integer.valueOf(m%2);
            m=m/2;
        }
        StringBuilder st = new StringBuilder(s);
        st.reverse();
        s = st.toString();
        //System.out.println(s+);
        return f(s,0,0,0);
    }
    
    public int f(String s,int pos,int tight,int prev ){
        
        if(pos == s.length()){
            return 1;
        } 
        if(dp[pos][tight][prev]!=0) return dp[pos][tight][prev];
        int ans=0;
        int till = 1;
        if(tight==0)
            till = s.charAt(pos) - '0';
        
        for(int i=0;i<=till;i++){
            int newTight=tight;
            if(i<till)newTight=1;
            if(prev==1 && i==1)continue;
           ans+=f(s,pos+1,newTight,i); 
        }
        dp[pos][tight][prev] = ans;
       return dp[pos][tight][prev]; 
    }
}