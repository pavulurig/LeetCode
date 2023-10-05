class Solution:
    def longestNiceSubarray(self, nums: List[int]) -> int:
        i , j = 0,0
        bits = 0
        ans = 1
        while j < len(nums):
            if j-i == 0:
                bits = nums[j]
                j+=1
            else:
                if bits & nums[j] == 0:
                    bits = bits | nums[j]
                    ans = max(j-i+1,ans)
                    j += 1
                else:
                    ## Remove i ,using XOR to remove
                    bits = bits ^ nums[i]
                    i+=1                    
        return ans
        