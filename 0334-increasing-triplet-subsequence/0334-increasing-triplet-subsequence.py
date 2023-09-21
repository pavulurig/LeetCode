class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        if len(nums)<=2 : return False
        i , j = float('inf'), float('inf')
        for k in range(len(nums)):
            if nums[k] <= i :
                i = nums[k]
            else:
                if nums[k] <=j:
                    j = nums[k]
                else:
                    return True

        return False
                    
        