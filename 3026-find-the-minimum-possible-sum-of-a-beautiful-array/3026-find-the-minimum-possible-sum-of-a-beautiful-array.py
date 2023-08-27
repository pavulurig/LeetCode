class Solution:
    def minimumPossibleSum(self, n: int, target: int) -> int:
        sum = 0
        vis = set()
        i = 1
        total = 0
        while True:
            if i >= target:
                vis.add(i)
                sum+=i
                total+=1
            else:
                if (target-i) not in vis:
                    sum+=i
                    vis.add(i)
                    total+=1
            if total >= n:
                    break
            i+=1

        return sum