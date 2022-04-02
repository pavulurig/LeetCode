class Solution {
    public long numberOfWays(String s) {
        int zeros =0,ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zeros++;
            }else{
                ones++;
            }
        }
        
        //take 010 & 101
        long ans = 0;
        int currentZeros = s.charAt(0)=='0'? 1:0;
        int currentOnes = s.charAt(0)=='1'? 1:0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == '0'){
                ans+=currentOnes*(ones-currentOnes);
                currentZeros++;
            }else{
                ans+=currentZeros*(zeros-currentZeros);
                currentOnes++;
            }
        }
        return ans;
        
    }
    
}