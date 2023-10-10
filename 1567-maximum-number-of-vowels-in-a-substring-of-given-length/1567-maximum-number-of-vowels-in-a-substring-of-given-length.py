class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = {'a','e','i','o','u'}
        i = j =0
        ans = 0
        max_ans = 0
        while j < len(s):
            if j-i+1 <= k:
                if s[j] in vowels:
                    ans+=1
                    max_ans = max(max_ans,ans)
                j+=1
            else:
                if s[i] in vowels:
                    ans-=1
                i+=1
        return max_ans

        