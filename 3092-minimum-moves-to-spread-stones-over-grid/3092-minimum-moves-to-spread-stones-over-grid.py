class Solution:
    def minimumMoves(self, grid: List[List[int]]) -> int:
        zero = []
        more_than_one = []
        moves = inf
        for i in range(3):
            for j in range(3):
                if grid[i][j]==0:
                    zero.append([i,j])
                elif grid[i][j]>1:
                    for _ in range(grid[i][j]-1):
                        more_than_one.append([i,j])
        # print(more_than_one)
        # print(zero)
        for perm in permutations(more_than_one):
            #print(perm)
            total_distance = 0
            for i in range(len(zero)):
                total_distance += abs(zero[i][0]-perm[i][0])+abs(zero[i][1]-perm[i][1])
            moves = min(moves, total_distance)

        return moves

        