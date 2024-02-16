class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        dct = Counter(arr)
        lst = dct.items()
        order = [(b,a) for (a,b) in lst]
        print(order)
        heapq.heapify(order) # Build Heap :O(N)
        while k > 0: # O(K)
            k-=1
            top = heapq.heappop(order) #O(1)
            print(top)
            temp = [top[0]-1,top[1]]
            if temp[0] == 0:
                continue
            heapq.heappush(order,(temp[0],temp[1])) #O(Logn)
        return len(order)
