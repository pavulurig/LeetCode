class Solution {
    public int addRungs(int[] rungs, int dist) {
        int i=0,cnt=0;
        if(rungs[0] > dist) cnt+=(rungs[0]-1)/dist;
        for(int j=0;j<rungs.length-1;j++){
            if(rungs[j+1]-rungs[j]>dist){
                int diff = rungs[j+1]-rungs[j];
                cnt+=(diff-1)/dist;
            }
        }
        return cnt;
    }
}