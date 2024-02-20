class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        max_x = len(nums)
        sum_x = sum(nums)
        sum_n = (max_x * (max_x + 1)) // 2
        return sum_n - sum_x
