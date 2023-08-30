class Solution:
    def addMinimum(self, word: str) -> int:
        possible = {'a':2,'b':2,'c':2,"ab":1,'bc':1,"ac":1,"abc":0}
        find = ""
        ans = 0
        for w in word:
            if find == "" or find[-1] < w:
                find+=w
           
            else:
                #print(possible[find],find)
                ans+=possible[find]
                find= ""
                find+=w
           
        if find!="":
            ans+=possible[find]

        return ans

        abca
        ke = ""
        key = abc
        a
        c<a
        key = ""
