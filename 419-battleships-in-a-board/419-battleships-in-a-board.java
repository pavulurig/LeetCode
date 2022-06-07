class Solution {
    int vis[][] = new int[1000][1000];
    public int countBattleships(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && board[i][j]=='X'){
                    dfs(i,j,board,n,m);
                    cnt++;
                }
                
            }
        }
        
        return cnt;
    }
    
    void dfs(int i,int j,char[][] board,int n,int m){
        int dx[]={0,0,1,-1};
        int dy[]={1,-1,0,0};
        vis[i][j]=1;
        for(int ii=0;ii<4;ii++){
            if(i+dx[ii]>=0 && i+dx[ii]<n && j+dy[ii]>=0 && j+dy[ii]<m && board[i+dx[ii]][j+dy[ii]] == 'X' && vis[i+dx[ii]][j+dy[ii]]==0){
                dfs(i+dx[ii],j+dy[ii],board,n,m);
            }
        }
       
    }
}