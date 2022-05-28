class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int row[] = new int[grid.length];
        int col[] = new int[grid.length];
        for(int i=0;i<grid.length;i++){
            int maxRow = -1,maxCol =-1;
            for(int j=0;j<grid.length;j++){
                maxRow=Math.max(maxRow,grid[i][j]);
                maxCol=Math.max(maxCol,grid[j][i]);
            }
            row[i]=maxRow;
            col[i]=maxCol;
        }
        // for(int i=0;i<row.length;i++){
        //     System.out.println(row[i]+"row");
        //     System.out.println(col[i]+"col");
        // }
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                sum+=Math.min(row[i],col[j])-grid[i][j];
            }
        }
        
        return sum;
        
    }
}