class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        i,j=0,0
        summ = 0
        fans = -inf
        while j < len(nums):
            summ+=nums[j]
            #print(summ)
            if j-i+1 == k:
                fans = max(fans,summ/k)
                #print(fans)
                summ-=nums[i]
                i+=1
            j+=1
        return fans
        