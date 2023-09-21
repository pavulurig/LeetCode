class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        i ,j = 0,0
        ans = [1]*(len(nums1)*len(nums2))
        k = 0
        while i < len(nums1) and j < len(nums2):
            if nums1[i] < nums2[j]:
                ans[k] = nums1[i]
                i+=1
                k+=1
            else:
                ans[k] = nums2[j]
                j+=1
                k+=1
        if i < len(nums1):
            ans[k:] = nums1[i:]
        if j < len(nums2):
            ans[k:] = nums2[j:]
        n = len(ans)
        return ans[n//2] if n%2 == 1 else (ans[n//2]+ans[(n//2)-1])/2
        