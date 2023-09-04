class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        @lru_cache(maxsize = 100000)
        def f(i,k,buy):
            if i == len(prices) or k >=2 :
                return 0
            if buy == 1:
                # Buy
                # Don't buy
                return max(-prices[i]+f(i+1,k,0),f(i+1,k,1))
            else:
                return max(prices[i]+f(i+1,k+1,1),f(i+1,k,0))
            
        return f(0,0,1)

        