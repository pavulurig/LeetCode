from sortedcontainers import SortedList
class Solution:
    def findIndices(self, nums: List[int], indexDifference: int, valueDifference: int) -> List[int]:
        li = SortedList()
        for i in range(indexDifference,len(nums)):
            li.add([nums[i-indexDifference],i-indexDifference])
            #print(li)
            a,ai = li[0]
            b,bi = li[-1]
            if abs(a-nums[i]) >= valueDifference:
                return [i,ai]
            if abs(b-nums[i]) >= valueDifference:
                return [i,bi]
        return [-1,-1]
        
       