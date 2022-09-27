class Solution {
    public String pushDominoes(String dominoes) {
        int[]r = new int[dominoes.length()];
        int[]l = new int[dominoes.length()];
        int counter = -1;
        
        //R logic
        for(int i=0;i<dominoes.length();i++){
            if(dominoes.charAt(i) == 'R'){
                if(counter!=-1){
                    counter =0;
                    r[i] = counter;
                }else{
                    counter++;
                    r[i] = counter;
                }
                
            }else if(dominoes.charAt(i) == '.'){
                if(counter == -1){
                    r[i] = Integer.MAX_VALUE;
                }else{
                    counter++;
                    r[i]=counter; 
                }
                
            }else{
                counter = -1;
                r[i] = Integer.MAX_VALUE;
                
            }
        }
        
        //l LOGIC
        counter =-1;
        for(int i=dominoes.length()-1;i>=0;i--){
            if(dominoes.charAt(i) == 'L'){
                if(counter!=-1){
                    counter=0;
                    l[i] = counter;
                }else{
                  counter++;
                 l[i] = counter;  
                }
                
            }else if(dominoes.charAt(i) == '.'){
                if(counter == -1){
                    l[i] = Integer.MAX_VALUE;
                }else{
                    counter++;
                    l[i]=counter; 
                }
                
            }else{
                counter = -1;
                l[i] = Integer.MAX_VALUE;
                
            }
        }
         StringBuilder ans = new StringBuilder();
        for(int i=0;i<dominoes.length();i++){
            if(l[i] == r[i]){
                ans.append('.');
            }
               else if(l[i]>r[i]){
                    ans.append('R');
                }else{
                    ans.append('L');
                }
        }
        
        return ans.toString();
    }
}