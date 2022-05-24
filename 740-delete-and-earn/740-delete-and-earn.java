class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length == 1) return nums[0];
        Integer ans[] = new Integer[nums.length+1];
        Arrays.sort(nums);
        return dp(nums,0,ans);
    }
    
    int dp(int[] nums,int i,Integer ans[]){
        
        if(i>nums.length-1) return 0;
        if(ans[i]!=null) return ans[i];
        
        int sum=0,next=i;
        while(next<=nums.length-1 && nums[next] == nums[i]){
            sum+=nums[next];
            next++;
        }
        while(next<=nums.length-1 && nums[next]<=nums[i]+1){
            //sum+=nums[next];
            next++;
        }
        int a = sum+dp(nums,next,ans);

        int b = dp(nums,i+1,ans);
        ans[i] = Math.max(a,b);
        return ans[i];
    }
}