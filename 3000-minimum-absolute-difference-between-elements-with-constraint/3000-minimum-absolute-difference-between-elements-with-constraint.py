from sortedcontainers import SortedList
class Solution:
    def minAbsoluteDifference(self, nums: List[int], x: int) -> int:
        sorted_array = SortedList(key = lambda k : k[0])
        min_ans = abs(nums[0] - nums[-1])
        for i in range(x,len(nums)):
            insertt = (nums[i-x],i-x)
            sorted_array.add(insertt)
            pos = sorted_array.bisect_left((nums[i],i))
            if len(sorted_array) >= pos+1:
                min_ans = min(min_ans,abs(sorted_array[pos][0]-nums[i]))
            if len(sorted_array) >= pos+2:
                min_ans = min(min_ans,abs(sorted_array[pos+1][0]-nums[i]))
            
            min_ans = min(min_ans,abs(sorted_array[pos-1][0]-nums[i]))
               
        return min_ans

        