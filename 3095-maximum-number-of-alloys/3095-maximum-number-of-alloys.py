class Solution:
    def maxNumberOfAlloys(self, n: int, k: int, budget: int, composition: List[List[int]], stock: List[int], cost: List[int]) -> int:
        ans = 0
        for i in range(k):
            left,right = 0,10**9
            while left <= right:
                mid = left+(right-left)//2
                total_budget = 0
                for j in range(n):
                    total_budget+=(max(0,(mid*composition[i][j])-stock[j])*cost[j])
                if total_budget <= budget:
                    ans = max(ans,mid)
                    left = mid+1
                else:
                    right = mid-1
        return ans