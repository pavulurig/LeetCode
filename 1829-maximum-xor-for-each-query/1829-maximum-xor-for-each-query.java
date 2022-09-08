class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int xor = 0;
        
        //preprocessing
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        int ans[] = new int[nums.length];
        int expected = (int)Math.pow(2,maximumBit)-1;
        for(int i=0;i<nums.length;i++){
            
            ans[i]=xor^expected;
            xor^=nums[nums.length-i-1];
        }
        //TimeComplexity : O(N)
        //SpaceComplexity :O(1)
        return ans;
    }
}