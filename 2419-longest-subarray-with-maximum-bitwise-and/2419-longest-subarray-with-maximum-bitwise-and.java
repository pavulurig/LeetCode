class Solution {
    public int longestSubarray(int[] nums) {
        int length = 0;
        int max= 1;
        for(int i=0;i<nums.length;i++){
           if(max<nums[i]){
               max = nums[i];
           }
        }
        
        int ans = 0;
        
        for(int i=0;i<nums.length;i++){
          if(max == nums[i]){
              length++;
          } else{
              ans = Math.max(ans,length);
              length=0;
          } 
        }
        ans = Math.max(ans,length);
        return ans;
    }
}