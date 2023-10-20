class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        alt = [0]
        ans = 0
        for each in gain:
            alt.append(alt[-1]+each)
            ans = max(ans,alt[-1])

        return ans

        