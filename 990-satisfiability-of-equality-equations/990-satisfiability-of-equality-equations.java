class Solution {
    public boolean equationsPossible(String[] equations) {
        int parent[] = new int[26];
        for(int i=0;i<26;i++){
            parent[i]=i;
        }
        for(int i=0;i<equations.length;i++){
            int a = equations[i].charAt(0)-'a';
            int b = equations[i].charAt(3)-'a';
            if(equations[i].charAt(1) == '='){
                union(a,b,parent);
            }
        }
        for(int i=0;i<equations.length;i++){
            int a = equations[i].charAt(0)-'a';
            int b = equations[i].charAt(3)-'a';
            if(equations[i].charAt(1) == '!'){
                int c = find(a,parent);
                int d = find(b,parent);
                if(c == d){
                    return false;
                }
            
            }
       }
        return true;
    }
    
    void union(int a ,int b,int parent[]){
        int aa = find(a,parent);
        int bb = find(b,parent);
        if(aa!=bb){
            parent[bb]=aa;
        }
    }
    
    int find(int a,int parent[]){
        if(a == parent[a]){
            return a;
        }
        return parent[a] = find(parent[a],parent); 
    }
    
}