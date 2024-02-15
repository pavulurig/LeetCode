class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        nums.sort()
        left = [nums[0]]
        #print(nums)
        for i in range(1,len(nums)):
            left.append(left[-1]+nums[i])
        ans = -1
        for i in range(2,len(nums)):
            if left[i-1]>nums[i]:
                ans = max(ans,left[i])
        return ans