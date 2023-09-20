class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = [nums[0]]
        ans = []
        right = [nums[len(nums)-1]]
        for i in range(1,len(nums)):
            left.append(left[i-1]*nums[i])
        
        for i in range(len(nums)-2,-1,-1):
            right.append(right[len(right)-1]*nums[i])
            #print(right)
        right.reverse()
        for i in range(len(nums)):
            if i == 0:
                ans.append(right[1])
            elif i == len(nums)-1:
                ans.append(left[len(nums)-2])
            else:
                ans.append(left[i-1]*right[i+1])
        return ans
