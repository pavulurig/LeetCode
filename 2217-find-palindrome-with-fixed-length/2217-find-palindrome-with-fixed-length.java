class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        long [] arr = new long[queries.length];
        for(int i=0;i<queries.length;i++){
           arr[i]= nthPalindrome(queries[i],intLength);
        }
        return arr;
    }
    
    public long nthPalindrome(long n, int k)
    {
       
        int temp = (k & 1)!=0 ? (k / 2) : (k/2 - 1);
        long palindrome = (long)Math.pow(10, temp);
        palindrome += n - 1; 
        long newnumber = palindrome;
        if ((k & 1)>0)
		    palindrome /= 10;
            

        while (palindrome>0)
        {
            newnumber = newnumber*10+palindrome % 10;
            palindrome /= 10;
        }
        
        String val = String.valueOf(newnumber);
        if(val.length() > k) return -1;
        return newnumber;
   
    }
}