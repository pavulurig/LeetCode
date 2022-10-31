class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long sum = getSum(n);
        long mul =1;
        long aa = n;
        long num = n;
        while(sum>target){
            long a = (n/10)+1;
            mul*=10;
            num = a*mul;
            sum =getSum(a*mul);
            n = n/10;
        }
        
        return num-aa;
    }
    
    long getSum(long n){
        long sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
   
}
