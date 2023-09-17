class Solution:
    def maximumSum(self, nums: List[int]) -> int:
        squares = [i*i for i in range(1,101)]
        fans = 0
        for j in range(1,1000):
            ans = 0
            for k in range(len(squares)):
                if j*squares[k] <= len(nums):
                    ans+= nums[j*squares[k]-1]
                else:
                    break
            fans = max(ans,fans)
        return fans
        