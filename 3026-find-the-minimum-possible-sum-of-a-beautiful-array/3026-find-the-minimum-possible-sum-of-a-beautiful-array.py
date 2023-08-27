class Solution:
    def minimumPossibleSum(self, n: int, target: int) -> int:
        #sum = 0
        vis = set()
        i=1
        while len(vis)<n:
            if target-i not in vis:
                vis.add(i)

            i+=1
        return sum(vis)