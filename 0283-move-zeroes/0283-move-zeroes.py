class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i  = -1
        for j,num in enumerate(nums):
            if nums[j] == 0 and i == -1:
                i = j
            elif nums[j]!= 0 and i != -1:
                nums[i] , nums[j] = nums[j] , nums[i]
                i+=1
        #print(i,j)
        # if i < len(nums) and nums[i] == 0:
        #     nums[i] , nums[j-1] = nums[j-1] , nums[i]



        