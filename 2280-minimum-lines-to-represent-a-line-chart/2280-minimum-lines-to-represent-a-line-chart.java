class Solution {
    public int minimumLines(int[][] stockPrices) {
        
        Arrays.sort(stockPrices, (a, b) ->a[0]-b[0]);
        if(stockPrices.length == 1) return 0;
        int cnt=1;
        for(int i=2;i<stockPrices.length;i++){
            int a = stockPrices[i][0];
            int b = stockPrices[i][1];
            
            int x = stockPrices[i-1][0];
            int y = stockPrices[i-1][1];
            
            int m = stockPrices[i-2][0];
            int n = stockPrices[i-2][1];
            
            long diff1 = (y-b)*(m-x);
            long diff2 = (n-y)*(x-a);
           
            if(diff1!=diff2){
                cnt++;
                // prev=slope;
                // a=x;
                // b=y;
            } 
        }
        return cnt;
    }
}