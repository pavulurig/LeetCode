class Solution:
    def maxMoves(self, grid: List[List[int]]) -> int:
        possible_moves = [(0,1),(1,1),(-1,1)]
        n = len(grid)
        m = len(grid[0])

        @cache
        def dp(i,j):
            fans = 0
            for x,y in possible_moves:
                next_i = i+x
                next_j = j+y
                if 0<= next_i < n and 0<=next_j<m and grid[i][j] < grid[next_i][next_j]:
                    fans=max(fans,1+dp(next_i,next_j))
            return fans


        ans = 0
        for i in range(n):
            ans = max(ans,dp(i,0))
        return ans
        
           
        