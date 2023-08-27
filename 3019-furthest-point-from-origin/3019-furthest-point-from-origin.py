class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        cnt,empty = 0,0
        for move in moves:
            if move == 'L':
                cnt+=1
            elif move =='R':
                cnt-=1
            else:
                empty+=1
        return empty+abs(cnt)    
        