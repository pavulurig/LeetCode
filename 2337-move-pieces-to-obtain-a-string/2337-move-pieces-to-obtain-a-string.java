class Solution {
    public boolean canChange(String start, String target) {
        int i=0,j=0;
        while(i<start.length() || j<target.length()){
            while(i<start.length()  && start.charAt(i)=='_'){
                i++;
            }
            while(j<target.length() && target.charAt(j)=='_'){
                j++;
            }
            if( (i == start.length()) || (j == start.length())) break;
            if(start.charAt(i)!=target.charAt(j)) break;
            if(start.charAt(i) == 'L' && j>i) break;
            if(start.charAt(i) == 'R' && i>j) break;
            i++;
            j++;
        }
        System.out.println(i);
         System.out.println(j);
        
        return i==start.length() && j== target.length();
    }
}