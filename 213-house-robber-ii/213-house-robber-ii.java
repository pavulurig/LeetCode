class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        Integer ans[] = new Integer[nums.length+1];
        int n = nums.length;
        int a = dp(nums,0,n-2,ans);
        ans = new Integer[nums.length+1];
        int b = dp(nums,1,n-1,ans);
        return Math.max(a,b);
    }
    
    int dp(int[] nums,int i,int comp,Integer ans[]){
        if(i>comp) return 0;
        if(ans[i]!=null) return ans[i];
        ans[i]= Math.max(nums[i]+dp(nums,i+2,comp,ans),dp(nums,i+1,comp,ans));
        return ans[i];
    }
    
}