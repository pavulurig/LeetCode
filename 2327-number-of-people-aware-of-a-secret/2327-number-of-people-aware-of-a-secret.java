class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        class Node {
            int delay;
            int forget;
            int cnt;
        }
        Queue<Node> queue = new LinkedList<>();
        Node nodee = new Node();
        nodee.delay = delay+1;
        nodee.forget= forget+1;
        nodee.cnt= 1;
        queue.add(nodee);
        int count =1;
        for(int i=1;i<=n;i++){ 
            while(queue.size()>0){
                if(queue.peek().forget<=i){
                    queue.poll();
                }else{
                    break;
                }
            }
            int cnt = 0;
            for(Node nn : queue){ 
                if(nn.delay<=i){
                    cnt+=nn.cnt;
                    cnt =cnt%1000000007;
                }
            }
        
             Node neww = new Node();
             neww.delay = delay+i;
             neww.forget= forget+i;
             neww.cnt= cnt;
             queue.add(neww);
        }
        int ans = 0;
        
        while(!queue.isEmpty()){
            Node nn = queue.poll();
            ans+=nn.cnt;
            ans%=1000000007;
        }
        return ans;
        
    }
}