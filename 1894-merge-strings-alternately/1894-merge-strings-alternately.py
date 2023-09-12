class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        i,j=0,0
        s = []
        for k in range(min(len(word1),len(word2))):
            s.append(word1[i])
            s.append(word2[j])
            i+=1
            j+=1
        while i < len(word1):
            s.append(word1[i])
            i+=1
        while j < len(word2):
            s.append(word2[j])
            j+=1
        return ''.join(s)

        