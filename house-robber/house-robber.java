class Solution {
    public int rob(int[] nums) {
        //Top Down
       Integer dp[] = new Integer[nums.length+1];
        return bottomup(nums,dp);
        //return topdown(nums,nums.length-1,dp);
    }
    int bottomup(int[] nums,Integer[] dp){
        dp[0]=nums[0];
        if(nums.length == 1) return dp[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
        
    }
    int topdown(int[] nums,int i,Integer[] dp){
        if(i == 0) return nums[0];
        if(i == 1) return Math.max(nums[0],nums[1]);
        if(dp[i]!=null) return dp[i];
        dp[i] = Math.max(nums[i]+topdown(nums,i-2,dp),topdown(nums,i-1,dp));
        return dp[i];
             
    }
}