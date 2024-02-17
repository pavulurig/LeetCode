class Solution:
    def furthestBuilding(self, heights: List[int], bricks: int, ladders: int) -> int:
        pq = []
        for i in range(len(heights)-1):
            if heights[i] < heights[i+1]: #Jump
                heapq.heappush(pq,heights[i+1]-heights[i])
                if len(pq) <= ladders: # Good
                    continue
                bricks -= heapq.heappop(pq) # Dead?
                if bricks < 0:
                    return i
        return len(heights)-1

       



