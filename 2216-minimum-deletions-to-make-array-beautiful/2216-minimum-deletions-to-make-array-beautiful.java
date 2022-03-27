class Solution {
    public int minDeletion(int[] nums) {
        if(nums.length == 0)return 0;
        
        
        int cnt =0;
        int k = 0;
        for(int i=0;i<nums.length-1;i++){
            if(k%2 == 0 && nums[i] == nums[i+1]){
                cnt++;
            }else{
                k++;
            }
        }
        
        if((nums.length-cnt)%2 != 0) cnt++;
        return cnt;
    }
    
}