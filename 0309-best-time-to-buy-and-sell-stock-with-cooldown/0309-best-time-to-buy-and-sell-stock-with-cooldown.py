class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        @lru_cache(maxsize=5000)
        def f(i,allowedtobuy):
            if i >= len(prices):
                return 0
            if allowedtobuy == 1:
                return max(-prices[i]+f(i+1,0),f(i+1,1))
            else:
                return max(prices[i]+f(i+2,1),f(i+1,0))
        
        return f(0,1)
        
