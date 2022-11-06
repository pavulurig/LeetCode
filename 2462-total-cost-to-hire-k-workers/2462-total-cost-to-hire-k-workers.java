class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        class Node {
            int val;
            int index;
        }
        
        class CustomComp implements Comparator<Node>{
             
    
            public int compare(Node s1, Node s2) {
                if (s1.val == s2.val)
                    return s1.index-s2.index;
                else 
                    return s1.val-s2.val;
                }
        }
        
        PriorityQueue<Node> q1 = new PriorityQueue<>(new CustomComp());
        PriorityQueue<Node> q2 = new PriorityQueue<>(new CustomComp());
        int i=0;
        while(i<candidates){
            Node n = new Node();
            n.val = costs[i];
            n.index = i;
            q1.add(n);
            i++;
        }
        
        int j=candidates;
        int kk=costs.length-1;
        while(j>0){
            Node n = new Node();
            n.val = costs[kk];
            n.index = kk;
            q2.add(n);
            j--;
            kk--;
        }
    
        long ans = 0;
        for(int itr=0;itr<k;itr++){
            if(!q1.isEmpty() && !q2.isEmpty()){
             
                Node a = q1.peek();
                Node b = q2.peek();
                if(a.val == b.val && a.index == b.index){
                    ans+=a.val;
                    q1.poll();
                    q2.poll();
                }else if(a.val == b.val && a.index!=b.index){
                    ans+=a.val;
                    if(a.index>b.index) {
                        q2.poll();
                        if(i<=kk && kk>=0){
                           Node n = new Node();
                           n.val = costs[kk];
                           n.index = kk;
                           q2.add(n); 
                            kk--;
                        }
                    }
                    else {
                        q1.poll();
                        if(i<=kk&& i<costs.length){
                           Node n = new Node();
                           n.val = costs[i];
                           n.index = i;
                           q1.add(n); 
                            i++;
                        }
                    }
                }else{
                    if(a.val>b.val){
                        ans+=b.val;
                        q2.poll();
                        if(i<=kk && kk>=0 ){
                           Node n = new Node();
                           n.val = costs[kk];
                           n.index = kk;
                           q2.add(n); 
                            kk--;
                        }
                    }else{
                        ans+=a.val;
                        q1.poll();
                        if(i<=kk && i<costs.length){
                           Node n = new Node();
                           n.val = costs[i];
                           n.index = i;
                           q1.add(n); 
                            i++;
                        }
                    }
                }
            }else if(!q1.isEmpty()){
                Node a = q1.poll();
                ans+=a.val;
            }else{
                Node a = q2.poll();
                ans+=a.val;
            }
        }
        return ans;
    }
}