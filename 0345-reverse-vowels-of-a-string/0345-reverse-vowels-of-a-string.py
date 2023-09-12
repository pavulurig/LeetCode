class Solution:
    def reverseVowels(self, s: str) -> str:
        i ,j = 0, len(s)-1
        vowels={'a','e','i','o','u'}
        ans = list(s)
        while i<j:
            if s[i].lower() in vowels and s[j].lower() in vowels:
                temp = ans[i]
                ans[i] = ans[j]
                ans[j]= temp
                i+=1
                j-=1
            elif s[i].lower() not in vowels:
                i+=1
            elif s[j].lower() not in vowels:
                j-=1
        return ''.join(ans)

