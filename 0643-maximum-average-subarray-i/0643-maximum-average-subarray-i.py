class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        i , j = 0,0
        summ = 0
        max_sum = -inf
        while j < len(nums):
            if j-i+1 < k:
                summ += nums[j]
                j += 1
            elif j-i+1 == k:
                summ += nums[j]
                current = summ/k
                max_sum = max(max_sum,current)
                j += 1
            else:
                summ -= nums[i]
                i +=1
        return max_sum
        