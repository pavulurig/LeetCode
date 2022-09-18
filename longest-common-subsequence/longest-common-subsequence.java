class Solution {
    public int longestCommonSubsequence(String a, String b) {
       
        Integer dp[][] = new Integer[a.length()][b.length()];
        return dp(a,b,0,0,dp);
    }
    
    int dp(String a,String b,int i,int j,Integer[][]dp){
        if(i>=a.length() || j>=b.length()) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)){
            dp[i][j]= 1+dp(a,b,i+1,j+1,dp);
        }else{
            dp[i][j]= Math.max(dp(a,b,i+1,j,dp),dp(a,b,i,j+1,dp));
        }
        return dp[i][j];
    }
}