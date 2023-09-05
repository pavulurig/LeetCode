class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        @lru_cache(maxsize=10000)
        def f(i,isllowedtobuy):
            if i >= len(prices):
                return 0
            ans =0
            if isllowedtobuy == 1:
                ans+= max(-prices[i]+f(i+1,0),f(i+1,1))
            else:
                ans+= max(prices[i]+f(i+2,1),f(i+1,0))
            return ans
        return f(0,1)
