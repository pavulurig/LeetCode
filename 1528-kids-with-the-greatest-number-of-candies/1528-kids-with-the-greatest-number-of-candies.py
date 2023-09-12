class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        greates = max(candies)
        ans = []
        for i in range(len(candies)):
            if candies[i]+extraCandies >= greates:
                #greates = candies[i]+extraCandies
                ans.append(True)
            else:
                ans.append(False)
        return ans


        