class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer,List<Integer> > coneect = new HashMap<>();
        for(int i=0;i<manager.length;i++){
            if(manager[i]!=-1){
               List<Integer> all = coneect.getOrDefault(manager[i],new ArrayList<>());
               all.add(i); 
               coneect.put(manager[i],all);
            }
        }
        class Node {
            int a;
            int b;
            Node(int a,int b){
                this.a= a;
                this.b = b;
            }
            
        }
        Queue<Node> qq = new LinkedList<>();
        qq.add(new Node(headID,informTime[headID]));
         int ans= 0;
        while(qq.size()>0){
            Node nn = qq.poll();
            List<Integer>ll = coneect.getOrDefault(nn.a,new ArrayList<>());
            ans = Math.max(ans,nn.b);
            for(int i=0;i<ll.size();i++){
                qq.add(new Node(ll.get(i),nn.b+informTime[ll.get(i)]));    
            }
        }
      
        
        return ans;
    }
}