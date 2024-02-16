class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        dct = Counter(arr)
        lst = dct.items()
        order = [(b,a) for (a,b) in lst]
        print(order)
        heapq.heapify(order)
        while k > 0:
            k-=1
            top = heapq.heappop(order)
            print(top)
            temp = [top[0]-1,top[1]]
            if temp[0] == 0:
                continue
            heapq.heappush(order,(temp[0],temp[1]))
        return len(order)
