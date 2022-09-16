class Solution {
    public int rob(int[] nums) {
        //Top Down
       Integer dp[] = new Integer[nums.length+1];
        return topdown(nums,nums.length-1,dp);
    }
    
    int topdown(int[] nums,int i,Integer[] dp){
        if(i == 0) return nums[0];
        if(i == 1) return Math.max(nums[0],nums[1]);
        if(dp[i]!=null) return dp[i];
        dp[i] = Math.max(nums[i]+topdown(nums,i-2,dp),topdown(nums,i-1,dp));
        return dp[i];
             
    }
}