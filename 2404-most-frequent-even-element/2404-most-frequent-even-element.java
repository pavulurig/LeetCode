class Solution {
    public int mostFrequentEven(int[] nums) {
        int min = 0;
        int ans = -1;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
                if(hm.get(nums[i]) > min){
                    ans = nums[i];
                    min = hm.get(nums[i]);
                }else if(hm.get(nums[i]) == min){
                    ans = Math.min(ans,nums[i]);
                }
            }
        }
        return ans;
        //Time : O(N)
        //Space: O(N)
    }
}