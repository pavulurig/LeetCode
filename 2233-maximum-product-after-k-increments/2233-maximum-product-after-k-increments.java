class Solution {
    
    public int maximumProduct(int[] nums, int k) {
        
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        
        while(k>0){
            k--;
            int top = pq.poll();
            top++;
            pq.add(top);
        }
        long ans = 1;
        while(!pq.isEmpty()){
           int top = pq.poll();
            ans = (ans*top)%1000000007;
        }
        return (int)ans;
        
    }
    
   
}