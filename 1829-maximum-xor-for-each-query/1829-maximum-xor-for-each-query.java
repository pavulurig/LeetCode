class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int suffArray [] = new int[nums.length];
        suffArray[0] = nums[0];
        //preprocessing
        for(int i=1;i<nums.length;i++){
            suffArray[i] = suffArray[i-1]^nums[i];
        }
        int ans[] = new int[nums.length];
        String ansstr = "";
         int number=0;
        int count=0;
        for(int i=suffArray.length-1;i>=0;i--){
            int required = (int)Math.pow(2,maximumBit)-1;
             number=0;
            for(int pos=0;pos<20;pos++){
                int currentBit = suffArray[i]&(1<<(pos));
                int rquiredBit = required&(1<<(pos));
                if(currentBit != rquiredBit){
                    number+= (int)Math.pow(2,pos);
                }
            }
            
            ans[count]=number;
            count++;
        }
        return ans;
    }
}