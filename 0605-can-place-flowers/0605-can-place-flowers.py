class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        cnt = 0
        for i in range(len(flowerbed)):
            if flowerbed[i] == 0:
                left = (i==0) or (flowerbed[i-1]==0)
                right = (i==len(flowerbed)-1) or (flowerbed[i+1]==0)
                if left and right:
                    cnt+=1
                    flowerbed[i] = 1
        return cnt>= n