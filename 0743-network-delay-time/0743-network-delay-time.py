import math
import heapq
class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        distance = [math.inf for _ in range(n+1)]
        graph = defaultdict(list)
        
        for each_node in (times):
            graph[each_node[0]].append((each_node[1],each_node[2]))

        visited = set()
        distance[k] = 0
        ans = 0
        pq = []
        heapq.heappush(pq,(0,k))
        while pq:
            from_node = heapq.heappop(pq)
            if from_node[1] in visited:
                continue
            visited.add(from_node[1])
            for to_node in graph[from_node[1]]:
                if distance[from_node[1]] + to_node[1] < distance[to_node[0]]:
                    distance[to_node[0]] = distance[from_node[1]] + to_node[1]
                    #ans = max(ans, distance[to_node[0]])
                    heapq.heappush(pq,(distance[to_node[0]],to_node[0]))
        if len(visited) != n:
            return -1
        ans = -1
        for maxi in distance:
            if maxi != math.inf:
                ans = max(ans,maxi)
        return ans

        