class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        if len(nums) <= 2: return True
        k=0
        while k < len(nums)-1:
            if nums[k] == nums[k+1]:
                k+=1
                continue
            else:
                break

        if k == len(nums)-1:
            return True
        
        increase = nums[k] <= nums[k+1]
        if increase:
            for i in range(k,len(nums)-1):
                if nums[i] <= nums[i+1]:
                    continue
                else:
                    return False
        else:
            for i in range(k,len(nums)-1):
                if nums[i] >= nums[i+1]:
                    continue
                else:
                    return False
        return True  