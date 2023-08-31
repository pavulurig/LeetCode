class Solution:
    def addMinimum(self, word: str) -> int:
        check = "abc"
        i = 0
        j = 0
        start = 0
        ans = 0
        while i < len(word):
            if word[i] == check[j]:
                start = i
                i+= 1
                j+= 1
            else:
                ans+= 1
                j+= 1
            
            if j%3 == 0:
                j = j%3
                i = start+1
                start = i
        if j != 0 :
            ans+= (3-j)
        return ans
