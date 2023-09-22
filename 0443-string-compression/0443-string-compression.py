class Solution:
    def compress(self, chars: List[str]) -> int:
        i ,j=0,0
        while j < len(chars):
            cnt = 1
            k = j
            while(j+1 < len(chars) and chars[j]==chars[j+1]):
                cnt+=1
                j+=1
            chars[i] = chars[k]
            i+=1
            j+=1
            if cnt > 1:
                cnt_str = str(cnt)
                l=0
                while l < len(cnt_str):
                    chars[i] = cnt_str[l]
                    i+=1
                    l+=1
        return i   
        