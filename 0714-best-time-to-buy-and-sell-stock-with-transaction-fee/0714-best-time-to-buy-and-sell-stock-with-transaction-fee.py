class Solution:
    def maxProfit(self, prices: List[int], fee: int) -> int:
        @lru_cache(maxsize = 100)
        def f(i,j):
            if i >= len(prices):
                return 0
            ans = 0
            if j == 0: #sell
                ans+= max(f(i+1,1)+prices[i],f(i+1,0))
            else : #buy
                ans+= max(f(i+1,1),-prices[i]-fee+f(i+1,0))
            return ans

        return f(0,1)

