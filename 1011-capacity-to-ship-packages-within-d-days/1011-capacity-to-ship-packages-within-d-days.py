class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        l = max(weights)
        h = sum(weights)
        while l < h:
            mid = (l+h)//2
            if self.ispossibleship(mid,weights,days) == True:
                #print(mid)
                h = mid
            else:
                l = mid+1
        return l

    def ispossibleship(self,capacity,weights,days):
        take_capacity = 0
        take_days = 0
        for weight in weights:
            take_capacity += weight
            if take_capacity > capacity:
                take_days += 1
                take_capacity = weight

        if take_capacity !=0:
            take_days += 1

        return take_days <= days


        
   