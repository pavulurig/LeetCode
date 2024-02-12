class Solution:
    def modifiedMatrix(self, nums: List[List[int]]) -> List[List[int]]:
        max_list = []
        col = len(nums[0])
        row = len(nums)
        for i in range(col):
            maxx = -1
            for j in range(row):
                maxx = max(maxx,nums[j][i])
            max_list.append(maxx)
        
        for i in range(len(nums)):
            maxx = -1
            for j in range(len(nums[i])):
                if nums[i][j] == -1:
                    nums[i][j] = max_list[j]
        return nums


        