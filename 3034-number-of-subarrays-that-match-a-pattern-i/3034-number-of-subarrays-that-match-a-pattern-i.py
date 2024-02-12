class Solution:
    def countMatchingSubarrays(self, nums: List[int], pattern: List[int]) -> int:

        def check(current):
            for k in range(len(current)-1):
                if current[k]>current[k+1] and pattern[k]!=-1:
                    return False
                if current[k] == current[k+1] and pattern[k]!=0:
                    return False
                if current[k] < current[k+1] and pattern[k]!=1:
                    return False

            return True
        cnt = 0
        for i in range(len(nums)-len(pattern)):
           current = nums[i:i+len(pattern)+1]
           if check(current) == True:
               cnt+=1
        return cnt
           

            
        