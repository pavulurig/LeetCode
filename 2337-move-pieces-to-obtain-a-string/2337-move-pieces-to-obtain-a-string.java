class Solution {
    public boolean canChange(String start, String target) {
        class Node{
            char ch;
            int index;
        }
        
        List<Node>startList = new ArrayList<>();
        List<Node>endList = new ArrayList<>();
        for(int i=0;i<start.length();i++){
            if(start.charAt(i)!='_'){
              Node n = new Node();
                n.ch= start.charAt(i);
                n.index=i;
                startList.add(n);  
            }
            
        }
        
        for(int i=0;i<target.length();i++){
            if(target.charAt(i)!='_'){
               Node n = new Node();
                n.ch= target.charAt(i);
                n.index=i;
                endList.add(n); 
            }
            
        }
        
        if(startList.size()!=endList.size()){
            return false;
        }
        
        int i =0,j=0;
        while(i<startList.size() && j<endList.size()){
            if(startList.get(i).ch != endList.get(j).ch){
                return false;
            }else{
                if(startList.get(i).ch=='R'){
                    if(startList.get(i).index>endList.get(j).index){
                        return false;
                    }
                }else{
                    if(startList.get(i).index<endList.get(j).index){
                        return false;
                    }
                }
            }
            i++;
            j++;
        }
        return true;
    }
}