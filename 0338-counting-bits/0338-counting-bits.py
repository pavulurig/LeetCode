class Solution:
    def countBits(self, n: int) -> List[int]:
        ans = [0]
        for num in range(1,n+1):
            cnt = 0
            for j in range(32):
               if num & 1<<j > 0:
                    cnt+=1
            ans.append(cnt)
        return ans