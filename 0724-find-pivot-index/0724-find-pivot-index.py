class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        s = sum(nums)
        sum_so_far = 0
        for i in range(len(nums)):
            if sum_so_far == (s-sum_so_far-nums[i]):
                return i
            sum_so_far+=nums[i]
        return -1