class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        i,j=0,0
        s = ""
        for k in range(min(len(word1),len(word2))):
            s+=word1[k]
            s+=word2[k]
        s+=word1[k+1:]
        s+=word2[k+1:]
        return s

        