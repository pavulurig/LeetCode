class Solution {
    public int rob(int[] nums) {
        Integer ans[] = new Integer[nums.length+1];
        return dp(nums,0,ans);
        
    }
    
    int dp(int[] nums,int i,Integer ans[]){
        if(i>nums.length-1) return 0;
        if(ans[i]!=null) return ans[i];
        ans[i]= Math.max(nums[i]+dp(nums,i+2,ans),dp(nums,i+1,ans));
        return ans[i];
    }
}