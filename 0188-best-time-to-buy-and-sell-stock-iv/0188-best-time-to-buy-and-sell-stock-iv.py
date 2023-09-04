class Solution:
    def maxProfit(self, k: int, prices: List[int]) -> int:
        @lru_cache(maxsize=100000)
        def f(i,j,buy):
            if i >= len(prices) or j>=k:
                return 0
            
            if buy == 1:
                return max(-prices[i]+f(i+1,j,0),f(i+1,j,1))
            else:
                return max(prices[i]+f(i+1,j+1,1),f(i+1,j,0))
        return f(0,0,1)