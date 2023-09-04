class Solution:
    def maxProfit(self, k: int, prices: List[int]) -> int:
        dp= [[[0 for _ in range(2+1)] for _ in range(k+1)] for _ in range(len(prices)+1)]

        for i in range(len(prices)-1,-1,-1):
            for j in range(k):
                for l in range(2):
                    if l == 1:
                        dp[i][j][l] = max(-prices[i]+dp[i+1][j][0],dp[i+1][j][1])
                    else:
                        dp[i][j][l] = max(prices[i]+dp[i+1][j+1][1],dp[i+1][j][0])
        return dp[0][0][1]