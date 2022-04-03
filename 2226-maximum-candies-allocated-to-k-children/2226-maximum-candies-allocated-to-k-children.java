class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left=0;
        int ca [] = candies;
        Arrays.sort(ca);
       
        int right=ca[candies.length -1];
        long sum=0;
        for(int i=0;i<candies.length;i++){
            sum+=candies[i];
        }
        
        if(sum<k) return 0;
        int ans=0;
        while(left<=right){
            int mid =  (left + right+1) / 2;
            if(helper(mid,candies,k) == true){
                ans = mid;
                left = mid+1;
                
            }else{
                right = mid-1;
            } 
        }  
        return ans;
    }
    
    boolean helper(int mid,int candies[],long k){
        long count=0;
        if(mid == 0) return false;
        for(int i=0;i<candies.length;i++){
            count+=candies[i]/mid;
        }
        return count>=k;
    }
}