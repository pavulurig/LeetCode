class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        for each in words:
            if each == each[::-1]:
                return each
        return ""
        