class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        
        Integer cache [][] = new Integer[multipliers.length][multipliers.length];
        return dp(nums,multipliers,0,0,cache);
    }
    
    int dp(int[] nums,int[]multipliers,int i,int left ,Integer cache[][]){
        if(i==multipliers.length){
            return 0;
        }
        if(cache[i][left]!=null) return cache[i][left];
        
        int right = nums.length-1-(i-left);
        int mm = multipliers[i];
        
        cache[i][left]= Math.max(mm*nums[left]+dp(nums,multipliers,i+1,left+1,cache),mm*nums[right]+dp(nums,multipliers,i+1,left,cache));
        return cache[i][left];
    }
}