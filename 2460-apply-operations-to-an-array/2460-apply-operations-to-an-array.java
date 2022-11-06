class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i]= 2*nums[i];
                nums[i+1]=0;
            }
        }
        
        int narr[] = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=0){
                narr[j]= nums[i];
                j++;
            }
        }
        while(j<nums.length){
            narr[j]=0;
            j++;
        }
        return narr;
    }
}