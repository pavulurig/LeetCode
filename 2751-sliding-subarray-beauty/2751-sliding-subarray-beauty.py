class Solution:
    def getSubarrayBeauty(self, nums: List[int], k: int, x: int) -> List[int]:
        dict_s = {}
        for i in range(k):
            if nums[i] in dict_s:
                dict_s[nums[i]]+=1
            else:
                dict_s[nums[i]] = 1

        i = k
        front = 0
        sub_array = []
        sub_array.append(self.get_x_smallest(dict_s,x))
        while i < len(nums):
            dict_s[nums[front]]-= 1
            if nums[i] in dict_s:
                dict_s[nums[i]]+=1
            else:
                dict_s[nums[i]] = 1
            front+=1
            sub_array.append(self.get_x_smallest(dict_s,x))
            i+=1
        return sub_array

    def get_x_smallest(self,dicts,x) -> int:
        ans = 0
        cnt = 0
        for i in range(-50,0,1):
            #print(i)
            if i in dicts and dicts[i] > 0:
                cnt+= dicts[i]
            if cnt >= x:
                ans = i
                break
        if ans >= 0:
            ans = 0
        return ans
