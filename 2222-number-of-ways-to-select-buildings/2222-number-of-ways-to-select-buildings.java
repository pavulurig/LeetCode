class Solution {
    public long numberOfWays(String s) {
        List<Integer> zeros = new ArrayList<Integer>();
        List<Integer> ones = new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zeros.add(i);
            }else{
                ones.add(i);
            }
        }
        
        //take 010
        long ans = 0;
        for(int i=0;i<ones.size();i++){
            int pos = Collections.binarySearch(zeros,ones.get(i));
            pos = Math.abs(pos)-1;
           //System.out.println(pos);
            ans+=(pos*(zeros.size()-pos));
        }
        //take 101
        for(int i=0;i<zeros.size();i++){
                int pos = Collections.binarySearch(ones,zeros.get(i));
                pos = Math.abs(pos)-1;
                //System.out.println(pos);
                ans+=(pos*(ones.size()-pos));
            }
       
        return ans;
        
    }
    
}