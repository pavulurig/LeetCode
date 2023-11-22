class Solution:
    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, k: int) -> int:
        graph = defaultdict(list)
        for flight in flights:
            graph[flight[0]].append((flight[1],flight[2]))
        cheapest_price = 99999999
        pq = []
        visited = [99999999 for _ in range(n)]
        heapq.heappush(pq,(0,src,0)) #price,vertice,stops
        while pq:
            w,u,stops = heapq.heappop(pq)
            if u == dst:
                cheapest_price = min(cheapest_price,w)
            if stops > k:
                continue 
            if visited[u] > stops:
                for to_node in graph[u]:
                    v,new_w = to_node
                    heapq.heappush(pq,(w+new_w,v,stops+1)) 
                visited[u] = stops+1 
        if cheapest_price == 99999999:
             return -1 
        return cheapest_price
                



        