class Solution {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer,Integer>hmap = new HashMap<Integer,Integer>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        int max = nums[nums.length-1];
        Integer dp[] = new Integer[max+1];
        dp[0] = 0;
        if(nums.length == 1) return nums[0];
        dp[1] = hmap.getOrDefault(1,0);
        for(int i=2;i<=max;i++){
            int val =  hmap.getOrDefault(i,0);
            dp[i] = Math.max(dp[i-2]+(val*i),dp[i-1]);
        }
        return dp[max];
         //return topdown(hmap,max,dp);    
    }
    
    int topdown(HashMap<Integer,Integer>hmap,int n,Integer[] dp){
        if(n<=0) return 0;
        //if(hmap.getOrDefault(n,0) == 0) return 0;
        if(dp[n]!=null) return dp[n];
        int val =  hmap.getOrDefault(n,0);
        dp[n]= Math.max(topdown(hmap,n-2,dp)+(n*val),topdown(hmap,n-1,dp));
        return dp[n];
    }
}