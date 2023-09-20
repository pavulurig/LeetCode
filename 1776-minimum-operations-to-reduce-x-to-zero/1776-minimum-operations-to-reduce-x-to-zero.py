class Solution:
    def minOperations(self, nums: List[int], x: int) -> int:
        if sum(nums)<x: return -1
        if sum(nums) == x: return len(nums)
        i,j = 0, 0
        look = sum(nums)-x
        summ = 0
        ans = 0
        while j < len(nums) :
            if nums[j]+summ < look:
                summ+=nums[j]
                j+=1
            elif nums[j]+summ == look:
                summ+=nums[j]
                ans = max(ans,j-i+1)
                j+=1
            else:
                summ-=nums[i]
                i+=1
        
        return len(nums)-ans if ans>0 else -1
        